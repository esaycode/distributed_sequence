package com.easy.code.sequence.dao.model;

public class IdSequenceModel {

	private Long id;
	private String sys;
	private String subSys;
	private String module;
	private String tableName;
	private Long idSeed;
	private Long ctime;
	private Long utime;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSys() {
		return sys;
	}
	public void setSys(String sys) {
		this.sys = sys;
	}
	public String getSubSys() {
		return subSys;
	}
	public void setSubSys(String subSys) {
		this.subSys = subSys;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public Long getIdSeed() {
		return idSeed;
	}
	public void setIdSeed(Long idSeed) {
		this.idSeed = idSeed;
	}
	public Long getCtime() {
		return ctime;
	}
	public void setCtime(Long ctime) {
		this.ctime = ctime;
	}
	public Long getUtime() {
		return utime;
	}
	public void setUtime(Long utime) {
		this.utime = utime;
	}
	
	

}
