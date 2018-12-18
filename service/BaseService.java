package com.bootdo.clouddoCore.service;


import com.bootdo.clouddoCore.util.page.PageList;

public interface BaseService<E> {

	/**
	* 添加
	**/
	Integer saveOne(E entity);
	
	/**
	* 查询列表
	**/
	PageList<E> selectList(E paramVo, Integer pageNum, Integer pageSize);
	
	/**
	* 查询详情
	**/
	E selectOne(Long id);
	
	/**
	* 修改
	**/
	Integer updateOne(E entity);

	/**
	* 删除
	**/
	Integer deleteOne(Long id);
	
}
