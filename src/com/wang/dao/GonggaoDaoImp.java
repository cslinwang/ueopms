package com.wang.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.wang.model.Gonggao;

public class GonggaoDaoImp implements GonggaoDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void add(Gonggao gonggao) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(gonggao);
	}

	public void delete(Gonggao gonggao) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.delete(gonggao);
	}

	public void update(Gonggao gonggao) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(gonggao);
	}

	public List select(Gonggao gonggao) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Gonggao where id=?",
				gonggao.getGgid());
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Gonggao");
	}

}
