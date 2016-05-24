package com.wang.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.wang.model.Juan;
import com.wang.model.Shijuan;
import com.wang.model.Shiti;

public class MainDaoImp implements MainDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public List test(Shijuan shijuan) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find(
				"select b from Juan a,Shiti b where a.st=b.stid and a.sj=?",
				shijuan.getSjid().toString());
	}
}
