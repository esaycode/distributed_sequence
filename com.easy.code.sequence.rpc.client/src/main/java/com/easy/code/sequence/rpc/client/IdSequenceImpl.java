package com.easy.code.sequence.rpc.client;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.easy.code.sequence.rpc.service.IdSequenceDubboRpc;

@Component
public class IdSequenceImpl implements IdSequence {
	
	private static final Map<String, AtomicLong> identityMap = new HashMap<String, AtomicLong>();
	
	@Reference(version="1.0.0", timeout=3000)
	private IdSequenceDubboRpc idSequenceDubboRpc;
	
	@Autowired
	private IdSequenceConfig dubboConfig;
	
	@Override
	public synchronized Long next(String tableName){
		String cachedKey = dubboConfig.getSystem() + "_" + dubboConfig.getSubSystem() + "_" + dubboConfig.getModule()
				+ "_" + tableName;
		AtomicLong identityAtomicLong = identityMap.get( cachedKey );
		if( identityAtomicLong == null ) {
			Long idprefix = idSequenceDubboRpc.next(dubboConfig.getSystem(), dubboConfig.getSubSystem(), dubboConfig.getModule(), tableName);
			System.out.println(idprefix);
			identityAtomicLong = new AtomicLong(idprefix * 1000 + 1);
			identityMap.put( cachedKey, identityAtomicLong );
		}
		
		Long idvalue = identityAtomicLong.getAndIncrement();
		if( idvalue % 1000 == 0 ) {
			Long idseed = idSequenceDubboRpc.next(dubboConfig.getSystem(), dubboConfig.getSubSystem(), dubboConfig.getModule(), tableName);
			identityAtomicLong = new AtomicLong( idseed * 1000 + 1);
			identityMap.put( cachedKey, identityAtomicLong );
		}
		return idvalue;
	}
}
