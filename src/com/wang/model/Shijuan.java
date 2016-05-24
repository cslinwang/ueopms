package com.wang.model;

/**
 * Shijuan entity. @author MyEclipse Persistence Tools
 */

public class Shijuan implements java.io.Serializable {

	// Fields

	private Integer sjid;
	private String shijuan;
	private String nr;
	private String sj;

	// Constructors

	/** default constructor */
	public Shijuan() {
	}

	/** full constructor */
	public Shijuan(String shijuan, String nr, String sj) {
		this.shijuan = shijuan;
		this.nr = nr;
		this.sj = sj;
	}

	// Property accessors

	public Integer getSjid() {
		return this.sjid;
	}

	public void setSjid(Integer sjid) {
		this.sjid = sjid;
	}

	public String getShijuan() {
		return this.shijuan;
	}

	public void setShijuan(String shijuan) {
		this.shijuan = shijuan;
	}

	public String getNr() {
		return this.nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getSj() {
		return this.sj;
	}

	public void setSj(String sj) {
		this.sj = sj;
	}

}