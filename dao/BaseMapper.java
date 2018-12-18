package com.bootdo.clouddoCore.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseMapper<E> {
	/**
	* 添加
	**/
	Integer saveOne(E entity);

	/**
	* 查询列表
	**/
	List<E> selectList(E paramVo);

	/**
	* 查询详情
	**/
	E selectOne(@Param("id") Long id);

	/**
	* 修改
	**/
	Integer updateOne(E entity);

	/**
	* 删除
	**/
	Integer deleteOne(@Param("id") Long id);
}
