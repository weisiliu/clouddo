package com.bootdo.clouddoCore.domian;

import java.io.Serializable;
import java.util.Date;

/**
* 中心用户表
**/

public class CoreUser implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* 主键
	**/
	private Long id;
	/**
	* 邮箱
	**/
	private String email;
	/**
	* 密码
	**/
	private String passWord;
	/**
	* 昵称
	**/
	private String nickName;
	/**
	* 性别0男1女
	**/
	private Integer sex;
	/**
	* 真实姓名
	**/
	private String realName;
	/**
	* 证件号码
	**/
	private String idCard;
	/**
	* qq
	**/
	private String qq;
	/**
	* 微信
	**/
	private String wx;
	/**
	* 手机
	**/
	private String phone;
	/**
	* 谷歌账号
	**/
	private String googleName;
	/**
	* 头像
	**/
	private String headUrl;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWx() {
		return wx;
	}

	public void setWx(String wx) {
		this.wx = wx;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGoogleName() {
		return googleName;
	}

	public void setGoogleName(String googleName) {
		this.googleName = googleName;
	}

	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
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
