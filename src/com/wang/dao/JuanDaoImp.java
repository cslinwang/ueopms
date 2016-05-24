package com.wang.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.wang.model.Juan;

public class JuanDaoImp implements JuanDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void add(Juan juan) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(juan);
	}

	public void delete(Juan juan) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.delete(juan);
	}

	public void update(Juan juan) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(juan);
	}

	public List select(Juan juan) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Juan where id=?",
				juan.getJid());
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Juan");
	}

}
