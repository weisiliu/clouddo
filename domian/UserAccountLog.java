package com.bootdo.clouddoCore.domian;

import java.io.Serializable;
import java.util.Date;

/**
* 账户交易表
**/
public class UserAccountLog implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* 
	**/
	private Long id;
	/**
	* 账户id
	**/
	private Long accountId;
	/**
	* 资产
	**/
	private String assets;
	/**
	* 资产类型
	**/
	private Integer state;
	/**
	* 请求内容
	**/
	private String requestParam;
	/**
	* 相应内容
	**/
	private String responseParam;
	/**
	* 创建时间
	**/
	private Date createTime;
	/**
	* 更新时间
	**/
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getAssets() {
		return assets;
	}

	public void setAssets(String assets) {
		this.assets = assets;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getRequestParam() {
		return requestParam;
	}

	public void setRequestParam(String requestParam) {
		this.requestParam = requestParam;
	}

	public String getResponseParam() {
		return responseParam;
	}

	public void setResponseParam(String responseParam) {
		this.responseParam = responseParam;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
