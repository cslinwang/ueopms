package com.wang.service;

import java.util.List;

import com.wang.dao.KechengDaoImp;
import com.wang.model.Kecheng;

public class KechengServiceImp implements KechengService {
	private KechengDaoImp daoImp;

	public void setDaoImp(KechengDaoImp daoImp) {
		this.daoImp = daoImp;
	}

	public boolean add(Kecheng kecheng) {
		// TODO Auto-generated method stub
		daoImp.add(kecheng);
		if (daoImp.select(kecheng).size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean delete(Kecheng kecheng) {
		// TODO Auto-generated method stub
		daoImp.delete(kecheng);
		List<Kecheng> kechengList = daoImp.select(kecheng);
		if (kechengList.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean update(Kecheng kecheng) {
		// TODO Auto-generated method stub
		daoImp.delete(kecheng);
		List<Kecheng> kechengList = daoImp.select(kecheng);
		if (kechengList.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

	public Kecheng select(Kecheng kecheng) {
		// TODO Auto-generated method stub
		return (Kecheng) daoImp.select(kecheng).get(0);
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return daoImp.selectAll();
	}

}
