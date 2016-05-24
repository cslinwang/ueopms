package com.wang.service;

import java.util.List;

import com.wang.dao.QuanxianDaoImp;
import com.wang.model.Quanxian;

public class QuanxianServiceImp implements QuanxianService {
	private QuanxianDaoImp daoImp;

	public void setDaoImp(QuanxianDaoImp daoImp) {
		this.daoImp = daoImp;
	}

	public boolean add(Quanxian quanxian) {
		// TODO Auto-generated method stub
		daoImp.add(quanxian);
		if (daoImp.select(quanxian).size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean delete(Quanxian quanxian) {
		// TODO Auto-generated method stub
		daoImp.delete(quanxian);
		List<Quanxian> quanxianList = daoImp.select(quanxian);
		if (quanxianList.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean update(Quanxian quanxian) {
		// TODO Auto-generated method stub
		daoImp.update(quanxian);
		List<Quanxian> quanxianList = daoImp.select(quanxian);
		if (quanxianList.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

	public Quanxian select(Quanxian quanxian) {
		// TODO Auto-generated method stub
		return (Quanxian) daoImp.select(quanxian).get(0);
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return daoImp.selectAll();
	}

}
