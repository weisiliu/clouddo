package com.bootdo.clouddoCore.domian;
import java.io.Serializable;
import java.util.Date;



/**
* 后台登录用户
**/

public class BackUser implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* 主键
	**/
	private Integer id;
	/**
	* 用户名
	**/
	private String userName;
	/**
	* 密码
	**/
	private String passWord;
	/**
	* 角色id
	**/
	private Integer roleId;
	/**
	* 创建时间
	**/
	private Date createTime;
	/**
	* 更新时间
	**/
	private Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
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
