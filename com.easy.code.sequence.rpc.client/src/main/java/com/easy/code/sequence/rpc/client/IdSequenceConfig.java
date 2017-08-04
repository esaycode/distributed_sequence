package com.easy.code.sequence.rpc.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component 
@ConfigurationProperties(prefix = IdSequenceConfig.PREFIX)
public class IdSequenceConfig {
	public static final String PREFIX = "app";
	
	private String system;
	
	private String subSystem;
	
	private String module;

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getSubSystem() {
		return subSystem;
	}

	public void setSubSystem(String subSystem) {
		this.subSystem = subSystem;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}
	
	
}
