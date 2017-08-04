package com.easy.code.sequence.dao.impl.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.easy.code.sequence.dao.model.IdSequenceModel;

@Mapper
public interface IdSequenceMapper {

	@Select("select * from id_sequence where sys = #{sys} and sub_sys = #{subSys} and module = #{module} and table_name = #{tableName}")
	IdSequenceModel findBySysAndSubSysAndModuleAndTableName(@Param("sys") String sys,
			@Param("subSys") String subSys,
			@Param("module") String module,
			@Param("tableName") String tableName);

	@Update("update id_sequence set utime = unix_timestamp(now()),  id_seed = id_seed+1 where id = #{id} and id_seed = #{idSeed} ")
	int updateByIdAndUtime(@Param("id") Long id, @Param("idSeed") Long idSeed);

}
