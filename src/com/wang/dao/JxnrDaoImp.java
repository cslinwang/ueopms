package com.wang.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.wang.model.Jxnr;

public class JxnrDaoImp implements JxnrDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void add(Jxnr jxnr) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(jxnr);
	}

	public void delete(Jxnr jxnr) {
		// TODO Auto-generated method stub
		System.out.println("开始删除");
		this.hibernateTemplate.delete(jxnr);
		System.out.println("成功删除");
	}

	public void update(Jxnr jxnr) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(jxnr);
	}

	public List select(Jxnr jxnr) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Jxnr where id=?",
				jxnr.getJxnrid());
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Jxnr");
	}

}
