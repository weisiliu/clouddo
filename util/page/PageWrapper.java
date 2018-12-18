package com.bootdo.clouddoCore.util.page;

import com.github.pagehelper.PageHelper;

import java.util.List;

/**
 * 分页包装方法(包裹pagehelper)
 */
public class PageWrapper extends PageHelper {
	
	/**
	 * 转化为简版分页对象
	 */
	public static <T> PageList<T> toPageList(List<T> list) {
		return new PageList<>(list);
	}
	
}
