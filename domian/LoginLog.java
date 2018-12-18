package com.bootdo.clouddoCore.domian;

import java.io.Serializable;
import java.util.Date;

/**
* 用户登录记录表
**/
public class LoginLog implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* 主键
	**/
	private Long id;
	/**
	* 用户ID
	**/
	private Long userId;
	/**
	* ip地址
	**/
	private String ip;
	/**
	* 用户类型0中心1应用
	**/
	private Integer type;
	/**
	* 状态：0登录1登出
	**/
	private Integer state;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
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
