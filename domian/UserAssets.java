package com.bootdo.clouddoCore.domian;

import java.io.Serializable;
import java.util.Date;

/**
* 资产表
**/
public class UserAssets implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* 主键
	**/
	private Long id;
	/**
	* 资产
	**/
	private String assets;
	/**
	* 用户id
	**/
	private Long userId;
	/**
	* 资产类型
	**/
	private Integer type;
	/**
	* 已发红包
	**/
	private String money;
	/**
	* 是否可提取0否1是
	**/
	private Integer state;
	/**
	* 邀请人数
	**/
	private Integer invitationNum;
	/**
	* 间接邀请人数
	**/
	private Integer indirectInvitationNum;
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

	public String getAssets() {
		return assets;
	}

	public void setAssets(String assets) {
		this.assets = assets;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getInvitationNum() {
		return invitationNum;
	}

	public void setInvitationNum(Integer invitationNum) {
		this.invitationNum = invitationNum;
	}

	public Integer getIndirectInvitationNum() {
		return indirectInvitationNum;
	}

	public void setIndirectInvitationNum(Integer indirectInvitationNum) {
		this.indirectInvitationNum = indirectInvitationNum;
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
