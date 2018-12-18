package com.bootdo.clouddoCore.domian;

import java.io.Serializable;
import java.util.Date;

/**
* 红包明细
**/
public class RedEnvelopesLog implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* 
	**/
	private Long id;
	/**
	* 金额
	**/
	private String money;
	/**
	* 类型10邀请收入20游戏收入30领取40支出
	**/
	private Integer type;
	/**
	* 用户id
	**/
	private Long userId;
	/**
	* 红包id
	**/
	private Long redEnvelopesId;
	/**
	* 创建时间
	**/
	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRedEnvelopesId() {
		return redEnvelopesId;
	}

	public void setRedEnvelopesId(Long redEnvelopesId) {
		this.redEnvelopesId = redEnvelopesId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
