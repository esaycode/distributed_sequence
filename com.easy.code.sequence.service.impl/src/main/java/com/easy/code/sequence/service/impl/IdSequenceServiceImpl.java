package com.easy.code.sequence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.code.sequence.dao.IdSequenceDao;
import com.easy.code.sequence.dao.model.IdSequenceModel;
import com.easy.code.sequence.service.IdSequenceService;

@Service
public class IdSequenceServiceImpl implements IdSequenceService {

	@Autowired
	IdSequenceDao idSequenceDao;

	@Override
	public Long next(String sys, String subSys, String module, String tableName) {
		Long nextId = null;
		// 三次尝试机会
		for (int i = 0; i < 3; i++) {
			IdSequenceModel idSequenceModel = idSequenceDao.findBySysAndSubSysAndModuleAndTableName(sys, subSys, module,
					tableName);
			if (idSequenceModel == null) {
				throw new RuntimeException("the database is not init");
			}

			if (idSequenceDao.updateByIdAndUtime(idSequenceModel.getId(), idSequenceModel.getIdSeed()) > 0) {
				nextId = idSequenceModel.getIdSeed() + 1;
				break;
			}

		}
		System.out.println(nextId);
		return nextId;
	}

}
