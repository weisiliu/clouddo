package com.bootdo.clouddoCore.domian;

import java.io.Serializable;
import java.util.Date;

/**
* 验证码记录表
**/

public class CodeLog implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* 主键
	**/
	private Long id;
	/**
	* 验证码
	**/
	private String code;
	/**
	* 邮箱
	**/
	private String email;
	/**
	* 状态：0已发送1发送失败
	**/
	private Integer state;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
}
