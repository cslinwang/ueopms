package com.wang.model;

/**
 * Gonggao entity. @author MyEclipse Persistence Tools
 */

public class Gonggao implements java.io.Serializable {

	// Fields

	private Integer ggid;
	private String bt;
	private String nr;
	private String sj;

	// Constructors

	/** default constructor */
	public Gonggao() {
	}

	/** full constructor */
	public Gonggao(String bt, String nr, String sj) {
		this.bt = bt;
		this.nr = nr;
		this.sj = sj;
	}

	// Property accessors

	public Integer getGgid() {
		return this.ggid;
	}

	public void setGgid(Integer ggid) {
		this.ggid = ggid;
	}

	public String getBt() {
		return this.bt;
	}

	public void setBt(String bt) {
		this.bt = bt;
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