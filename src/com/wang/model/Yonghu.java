package com.wang.model;

/**
 * Yonghu entity. @author MyEclipse Persistence Tools
 */

public class Yonghu implements java.io.Serializable {

	// Fields

	private Integer yhid;
	private String yhm;
	private String mm;
	private String xm;
	private String qx;
	private String dh;
	private String dz;

	// Constructors

	/** default constructor */
	public Yonghu() {
	}

	/** full constructor */
	public Yonghu(String yhm, String mm, String xm, String qx, String dh,
			String dz) {
		this.yhm = yhm;
		this.mm = mm;
		this.xm = xm;
		this.qx = qx;
		this.dh = dh;
		this.dz = dz;
	}

	// Property accessors

	public Integer getYhid() {
		return this.yhid;
	}

	public void setYhid(Integer yhid) {
		this.yhid = yhid;
	}

	public String getYhm() {
		return this.yhm;
	}

	public void setYhm(String yhm) {
		this.yhm = yhm;
	}

	public String getMm() {
		return this.mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}

	public String getXm() {
		return this.xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getQx() {
		return this.qx;
	}

	public void setQx(String qx) {
		this.qx = qx;
	}

	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public String getDz() {
		return this.dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

}