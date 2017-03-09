package com.steven.orm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.steven.model.ArthurDemo2;

@Mapper
public interface CustomArthurDemo2Mapper {
	@Select("select * from arthur_demo2")
	List<ArthurDemo2> selectAll();
}
