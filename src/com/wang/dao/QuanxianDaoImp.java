package com.wang.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.wang.model.Quanxian;

public class QuanxianDaoImp implements QuanxianDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void add(Quanxian quanxian) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(quanxian);
	}

	public void delete(Quanxian quanxian) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.delete(quanxian);
	}

	public void update(Quanxian quanxian) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(quanxian);
	}

	public List select(Quanxian quanxian) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Quanxian where id=?",
				quanxian.getQxid());
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Quanxian");
	}

}
