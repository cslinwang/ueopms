package com.wang.model;

/**
 * Jxnr entity. @author MyEclipse Persistence Tools
 */

public class Jxnr implements java.io.Serializable {

	// Fields

	private Integer jxnrid;
	private String kc;
	private String zj;
	private String nr;
	private String bz;

	// Constructors

	/** default constructor */
	public Jxnr() {
	}

	/** full constructor */
	public Jxnr(String kc, String zj, String nr, String bz) {
		this.kc = kc;
		this.zj = zj;
		this.nr = nr;
		this.bz = bz;
	}

	// Property accessors

	public Integer getJxnrid() {
		return this.jxnrid;
	}

	public void setJxnrid(Integer jxnrid) {
		this.jxnrid = jxnrid;
	}

	public String getKc() {
		return this.kc;
	}

	public void setKc(String kc) {
		this.kc = kc;
	}

	public String getZj() {
		return this.zj;
	}

	public void setZj(String zj) {
		this.zj = zj;
	}

	public String getNr() {
		return this.nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}