package com.bootdo.clouddoCore.domian;

import java.io.Serializable;
import java.util.Date;

/**
* 红包表
**/
public class RedEnvelopes implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* 
	**/
	private Long id;
	/**
	* 金额
	**/
	private Long money;
	/**
	* 用户id
	**/
	private Long userId;
	/**
	* 累计金额
	**/
	private String cumulativeMoney;
	/**
	* mt
	**/
	private String MT;
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

	public Long getMoney() {
		return money;
	}

	public void setMoney(Long money) {
		this.money = money;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getCumulativeMoney() {
		return cumulativeMoney;
	}

	public void setCumulativeMoney(String cumulativeMoney) {
		this.cumulativeMoney = cumulativeMoney;
	}

	public String getMT() {
		return MT;
	}

	public void setMT(String MT) {
		this.MT = MT;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
