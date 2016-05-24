package com.wang.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.wang.model.Shijuan;

public class ShijuanDaoImp implements ShijuanDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void add(Shijuan shijuan) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(shijuan);
	}

	public void delete(Shijuan shijuan) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.delete(shijuan);
	}

	public void update(Shijuan shijuan) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(shijuan);
	}

	public List select(Shijuan shijuan) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Shijuan where id=?",
				shijuan.getSjid());
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Shijuan");
	}

}
