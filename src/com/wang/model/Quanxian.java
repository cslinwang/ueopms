package com.wang.model;

/**
 * Quanxian entity. @author MyEclipse Persistence Tools
 */

public class Quanxian implements java.io.Serializable {

	// Fields

	private Integer qxid;
	private String qx;

	// Constructors

	/** default constructor */
	public Quanxian() {
	}

	/** full constructor */
	public Quanxian(String qx) {
		this.qx = qx;
	}

	// Property accessors

	public Integer getQxid() {
		return this.qxid;
	}

	public void setQxid(Integer qxid) {
		this.qxid = qxid;
	}

	public String getQx() {
		return this.qx;
	}

	public void setQx(String qx) {
		this.qx = qx;
	}

}