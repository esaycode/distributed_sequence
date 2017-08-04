package com.easy.code.sequence.dao.impl.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.easy.code.sequence.dao.impl.mybatis.mapper")
public class mybatisConfig {
}
