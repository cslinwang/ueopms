package com.wang.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.wang.model.Shiti;

public class ShitiDaoImp implements ShitiDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void add(Shiti shiti) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(shiti);
	}

	public void delete(Shiti shiti) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.delete(shiti);
	}

	public void update(Shiti shiti) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(shiti);
	}

	public List select(Shiti shiti) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Shiti where id=?",
				shiti.getStid());
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Shiti");
	}

}
