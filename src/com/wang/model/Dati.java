package com.wang.model;

/**
 * Dati entity. @author MyEclipse Persistence Tools
 */

public class Dati implements java.io.Serializable {

	// Fields

	private Integer dtid;
	private String sj;
	private String st;
	private String da;
	private String dc;
	private String shijian;
	private String yh;

	// Constructors

	/** default constructor */
	public Dati() {
	}

	/** full constructor */
	public Dati(String sj, String st, String da, String dc, String shijian,
			String yh) {
		this.sj = sj;
		this.st = st;
		this.da = da;
		this.dc = dc;
		this.shijian = shijian;
		this.yh = yh;
	}

	// Property accessors

	public Integer getDtid() {
		return this.dtid;
	}

	public void setDtid(Integer dtid) {
		this.dtid = dtid;
	}

	public String getSj() {
		return this.sj;
	}

	public void setSj(String sj) {
		this.sj = sj;
	}

	public String getSt() {
		return this.st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public String getDa() {
		return this.da;
	}

	public void setDa(String da) {
		this.da = da;
	}

	public String getDc() {
		return this.dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
	}

	public String getShijian() {
		return this.shijian;
	}

	public void setShijian(String shijian) {
		this.shijian = shijian;
	}

	public String getYh() {
		return this.yh;
	}

	public void setYh(String yh) {
		this.yh = yh;
	}

}