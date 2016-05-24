package com.wang.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.wang.model.Chengji;

public class ChengjiDaoImp implements ChengjiDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void add(Chengji chengji) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(chengji);
	}

	public void delete(Chengji chengji) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.delete(chengji);
	}

	public void update(Chengji chengji) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(chengji);
	}

	public List select(Chengji chengji) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Chengji where id=?",
				chengji.getCjid());
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Chengji");
	}

}
