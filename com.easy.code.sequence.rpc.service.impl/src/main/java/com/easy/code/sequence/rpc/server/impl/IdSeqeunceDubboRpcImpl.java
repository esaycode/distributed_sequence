package com.easy.code.sequence.rpc.server.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.easy.code.sequence.rpc.service.IdSequenceDubboRpc;
import com.easy.code.sequence.service.IdSequenceService;

@Service(version="1.0.0")
public class IdSeqeunceDubboRpcImpl implements IdSequenceDubboRpc{
	
	@Autowired
	IdSequenceService IdSequenceService;
	@Override
	public Long next(String sys, String subSys, String module, String tableName) {
		return IdSequenceService.next(sys, subSys, module, tableName);
	}

}
