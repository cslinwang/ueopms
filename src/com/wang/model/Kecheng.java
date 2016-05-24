package com.wang.model;

/**
 * Kecheng entity. @author MyEclipse Persistence Tools
 */

public class Kecheng implements java.io.Serializable {

	// Fields

	private Integer kcid;
	private String kc;
	private String jxnr;
	private String tp;
	private String js;

	// Constructors

	/** default constructor */
	public Kecheng() {
	}

	/** full constructor */
	public Kecheng(String kc, String jxnr, String tp, String js) {
		this.kc = kc;
		this.jxnr = jxnr;
		this.tp = tp;
		this.js = js;
	}

	// Property accessors

	public Integer getKcid() {
		return this.kcid;
	}

	public void setKcid(Integer kcid) {
		this.kcid = kcid;
	}

	public String getKc() {
		return this.kc;
	}

	public void setKc(String kc) {
		this.kc = kc;
	}

	public String getJxnr() {
		return this.jxnr;
	}

	public void setJxnr(String jxnr) {
		this.jxnr = jxnr;
	}

	public String getTp() {
		return this.tp;
	}

	public void setTp(String tp) {
		this.tp = tp;
	}

	public String getJs() {
		return this.js;
	}

	public void setJs(String js) {
		this.js = js;
	}

}