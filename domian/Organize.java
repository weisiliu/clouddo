package com.bootdo.clouddoCore.domian;

import java.io.Serializable;
import java.util.Date;

/**
* 小组表
**/
public class Organize implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* 
	**/
	private Long id;
	/**
	* 组长
	**/
	private Long chargehand;
	/**
	* 副组长1
	**/
	private Long deputyChargehand1;
	/**
	* 副组长2
	**/
	private Long deputyChargehand2;
	/**
	* 组员1
	**/
	private Long member1;
	/**
	* 组员2
	**/
	private Long member2;
	/**
	* 组员3
	**/
	private Long member3;
	/**
	* 组员4
	**/
	private Long member4;
	/**
	* 0等待游戏1已解散
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

	public Long getChargehand() {
		return chargehand;
	}

	public void setChargehand(Long chargehand) {
		this.chargehand = chargehand;
	}

	public Long getDeputyChargehand1() {
		return deputyChargehand1;
	}

	public void setDeputyChargehand1(Long deputyChargehand1) {
		this.deputyChargehand1 = deputyChargehand1;
	}

	public Long getDeputyChargehand2() {
		return deputyChargehand2;
	}

	public void setDeputyChargehand2(Long deputyChargehand2) {
		this.deputyChargehand2 = deputyChargehand2;
	}

	public Long getMember1() {
		return member1;
	}

	public void setMember1(Long member1) {
		this.member1 = member1;
	}

	public Long getMember2() {
		return member2;
	}

	public void setMember2(Long member2) {
		this.member2 = member2;
	}

	public Long getMember3() {
		return member3;
	}

	public void setMember3(Long member3) {
		this.member3 = member3;
	}

	public Long getMember4() {
		return member4;
	}

	public void setMember4(Long member4) {
		this.member4 = member4;
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
