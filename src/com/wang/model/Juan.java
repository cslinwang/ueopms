package com.wang.model;

/**
 * Juan entity. @author MyEclipse Persistence Tools
 */

public class Juan implements java.io.Serializable {

	// Fields

	private Integer jid;
	private String sj;
	private String st;

	// Constructors

	/** default constructor */
	public Juan() {
	}

	/** full constructor */
	public Juan(String sj, String st) {
		this.sj = sj;
		this.st = st;
	}

	// Property accessors

	public Integer getJid() {
		return this.jid;
	}

	public void setJid(Integer jid) {
		this.jid = jid;
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

}