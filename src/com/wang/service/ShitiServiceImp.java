package com.wang.service;

import java.util.List;

import com.wang.dao.ShitiDaoImp;
import com.wang.model.Shiti;

public class ShitiServiceImp implements ShitiService {
	private ShitiDaoImp daoImp;

	public void setDaoImp(ShitiDaoImp daoImp) {
		this.daoImp = daoImp;
	}

	public boolean add(Shiti shiti) {
		// TODO Auto-generated method stub
		daoImp.add(shiti);
		if (daoImp.select(shiti).size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean delete(Shiti shiti) {
		// TODO Auto-generated method stub
		daoImp.delete(shiti);
		List<Shiti> shitiList = daoImp.select(shiti);
		if (shitiList.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean update(Shiti shiti) {
		// TODO Auto-generated method stub
		daoImp.delete(shiti);
		List<Shiti> shitiList = daoImp.select(shiti);
		if (shitiList.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

	public Shiti select(Shiti shiti) {
		// TODO Auto-generated method stub
		return (Shiti) daoImp.select(shiti).get(0);
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return daoImp.selectAll();
	}

}
