package com.easy.code.sequence.dao.impl.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.easy.code.sequence.dao.IdSequenceDao;
import com.easy.code.sequence.dao.impl.mybatis.mapper.IdSequenceMapper;
import com.easy.code.sequence.dao.model.IdSequenceModel;

@Repository
public class IdSequenceDaoImpl implements IdSequenceDao {

	@Autowired
	IdSequenceMapper idSequenceMapper;
	
	@Override
	public IdSequenceModel findBySysAndSubSysAndModuleAndTableName(String sys,
			String subSys,
			String module,
			String tableName) {
		return idSequenceMapper.findBySysAndSubSysAndModuleAndTableName(sys, subSys, module, tableName);
	}

	@Override
	public int updateByIdAndUtime(Long id, Long idSeed) {
		return idSequenceMapper.updateByIdAndUtime(id, idSeed);
	}

}
