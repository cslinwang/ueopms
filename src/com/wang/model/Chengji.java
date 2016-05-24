package com.wang.model;

/**
 * Chengji entity. @author MyEclipse Persistence Tools
 */

public class Chengji implements java.io.Serializable {

	// Fields

	private Integer cjid;
	private String sjid;
	private String yh;
	private String sj;
	private String cj;

	// Constructors

	/** default constructor */
	public Chengji() {
	}

	/** full constructor */
	public Chengji(String sjid, String yh, String sj, String cj) {
		this.sjid = sjid;
		this.yh = yh;
		this.sj = sj;
		this.cj = cj;
	}

	// Property accessors

	public Integer getCjid() {
		return this.cjid;
	}

	public void setCjid(Integer cjid) {
		this.cjid = cjid;
	}

	public String getSjid() {
		return this.sjid;
	}

	public void setSjid(String sjid) {
		this.sjid = sjid;
	}

	public String getYh() {
		return this.yh;
	}

	public void setYh(String yh) {
		this.yh = yh;
	}

	public String getSj() {
		return this.sj;
	}

	public void setSj(String sj) {
		this.sj = sj;
	}

	public String getCj() {
		return this.cj;
	}

	public void setCj(String cj) {
		this.cj = cj;
	}

}