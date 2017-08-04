package com.easy.code.sequence.rpc.service;

public interface IdSequenceDubboRpc {
	
	Long next(String sys, String subSys, String module, String tableName);
}
