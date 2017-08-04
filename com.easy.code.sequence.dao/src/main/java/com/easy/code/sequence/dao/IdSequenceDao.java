package com.easy.code.sequence.dao;

import com.easy.code.sequence.dao.model.IdSequenceModel;

public interface IdSequenceDao {
	IdSequenceModel findBySysAndSubSysAndModuleAndTableName(String sys, String subSys, String module, String tableName);

	int updateByIdAndUtime(Long id, Long idSeed);
}
