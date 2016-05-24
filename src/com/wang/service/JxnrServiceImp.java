package com.wang.service;

import java.util.List;

import com.wang.dao.JxnrDaoImp;
import com.wang.model.Jxnr;

public class JxnrServiceImp implements JxnrService {
	private JxnrDaoImp daoImp;

	public void setDaoImp(JxnrDaoImp daoImp) {
		this.daoImp = daoImp;
	}

	public boolean add(Jxnr jxnr) {
		// TODO Auto-generated method stub
		daoImp.add(jxnr);
		if (daoImp.select(jxnr).size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean delete(Jxnr jxnr) {
		// TODO Auto-generated method stub
		daoImp.delete(jxnr);
		List<Jxnr> jxnrList = daoImp.select(jxnr);
		System.out.println(jxnrList.size());
		if (jxnrList.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean update(Jxnr jxnr) {
		// TODO Auto-generated method stub
		daoImp.delete(jxnr);
		List<Jxnr> jxnrList = daoImp.select(jxnr);
		if (jxnrList.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

	public Jxnr select(Jxnr jxnr) {
		// TODO Auto-generated method stub
		return (Jxnr) daoImp.select(jxnr).get(0);
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return daoImp.selectAll();
	}

}
