package com.wang.model;

/**
 * Shiti entity. @author MyEclipse Persistence Tools
 */

public class Shiti implements java.io.Serializable {

	// Fields

	private Integer stid;
	private String st;
	private String ms;
	private String da;
	private String f;
	private String lx;
	private String js;

	// Constructors

	/** default constructor */
	public Shiti() {
	}

	/** full constructor */
	public Shiti(String st, String ms, String da, String f, String lx, String js) {
		this.st = st;
		this.ms = ms;
		this.da = da;
		this.f = f;
		this.lx = lx;
		this.js = js;
	}

	// Property accessors

	public Integer getStid() {
		return this.stid;
	}

	public void setStid(Integer stid) {
		this.stid = stid;
	}

	public String getSt() {
		return this.st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public String getMs() {
		return this.ms;
	}

	public void setMs(String ms) {
		this.ms = ms;
	}

	public String getDa() {
		return this.da;
	}

	public void setDa(String da) {
		this.da = da;
	}

	public String getF() {
		return this.f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public String getLx() {
		return this.lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	public String getJs() {
		return this.js;
	}

	public void setJs(String js) {
		this.js = js;
	}

}