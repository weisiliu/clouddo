package com.bootdo.clouddoCore.domian;
import java.io.Serializable;
import java.util.Date;



/**
* 账户表
**/

public class CoreAccount implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* 
	**/
	private Long id;
	/**
	* 中心用户id
	**/
	private Long coreUserId;
	/**
	* 金额
	**/
	private String money;
	/**
	* 类型
	**/
	private Integer type;
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

	public Long getCoreUserId() {
		return coreUserId;
	}

	public void setCoreUserId(Long coreUserId) {
		this.coreUserId = coreUserId;
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
