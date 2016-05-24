package com.wang.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.wang.model.Dati;

public class DatiDaoImp implements DatiDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void add(Dati dati) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(dati);
	}

	public void delete(Dati dati) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.delete(dati);
	}

	public void update(Dati dati) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(dati);
	}

	public List select(Dati dati) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Dati where id=?",
				dati.getDtid());
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Dati");
	}

}
