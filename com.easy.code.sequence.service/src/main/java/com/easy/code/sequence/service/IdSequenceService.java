package com.easy.code.sequence.service;

public interface IdSequenceService {
	
	Long next(String sys, String subSys, String module, String tableName);
}
