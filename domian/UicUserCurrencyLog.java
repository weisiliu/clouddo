package com.bootdo.clouddoCore.domian;

import java.io.Serializable;
import java.util.Date;

/**
* 币种交易记录表
**/
public class UicUserCurrencyLog implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* 
	**/
	private Long id;
	/**
	* 订单号
	**/
	private String orderNo;
	/**
	* 用户id
	**/
	private Long userId;
	/**
	* 昵称
	**/
	private String alias;
	/**
	* 手机
	**/
	private String userPhone;
	/**
	* 货币
	**/
	private String currency;
	/**
	* 币种  0:UIC
	**/
	private Integer type;
	/**
	* 状态  0充值中 1成功 2失败
	**/
	private Integer state;
	/**
	* 充值地址
	**/
	private String walletAddr;
	/**
	* 备注
	**/
	private String remark;
	/**
	* 
	**/
	private Date createTime;
	/**
	* 
	**/
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public String getWalletAddr() {
		return walletAddr;
	}

	public void setWalletAddr(String walletAddr) {
		this.walletAddr = walletAddr;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
