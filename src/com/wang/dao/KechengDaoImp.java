package com.wang.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.wang.model.Kecheng;

public class KechengDaoImp implements KechengDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void add(Kecheng kecheng) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(kecheng);
	}

	public void delete(Kecheng kecheng) {
		// TODO Auto-generated method stub
		System.out.println("start");
		this.hibernateTemplate.delete(kecheng);	}

	public void update(Kecheng kecheng) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(kecheng);
	}

	public List select(Kecheng kecheng) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Kecheng where id=?",
				kecheng.getKcid());
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Kecheng");
	}

}
