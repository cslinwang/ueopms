package com.wang.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.wang.model.Yonghu;

public class YonghuDaoImp implements YonghuDao {
	private HibernateTemplate hibernateTemplate;
	private static final Log log = LogFactory.getLog(YonghuDaoImp.class);

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public List login(Yonghu yonghu) {
		// TODO Auto-generated method stub
		log.debug("login Yonghu instance");
		return this.hibernateTemplate.find("from Yonghu where yhm=? and mm=?",
				yonghu.getYhm(), yonghu.getMm());
	}

	public void add(Yonghu yonghu) {
		// TODO Auto-generated method stub
		log.debug("add Yonghu instance");
		this.hibernateTemplate.save(yonghu);
		log.info("add Yonghu success");
	}

	public void delete(Yonghu yonghu) {
		// TODO Auto-generated method stub
		log.debug("delete Yonghu instance");
		this.hibernateTemplate.delete(yonghu);
		log.debug("delete Yonghu success");
	}

	public void update(Yonghu yonghu) {
		// TODO Auto-generated method stub
		log.debug("update Yonghu instance");
		this.hibernateTemplate.update(yonghu);
		log.debug("update Yonghu success");
	}

	public List select(Yonghu yonghu) {
		// TODO Auto-generated method stub
		log.debug("select Yonghu instance");
		return this.hibernateTemplate.find("from Yonghu where id=?",
				yonghu.getYhid());
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		log.debug("selectAll Yonghu instance");
		return this.hibernateTemplate.find("from Yonghu");
	}

}
