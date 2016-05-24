package com.wang.service;

import java.util.List;

import com.wang.dao.ShijuanDaoImp;
import com.wang.model.Shijuan;

public class ShijuanServiceImp implements ShijuanService {
	private ShijuanDaoImp daoImp;

	public void setDaoImp(ShijuanDaoImp daoImp) {
		this.daoImp = daoImp;
	}

	public boolean add(Shijuan shijuan) {
		// TODO Auto-generated method stub
		daoImp.add(shijuan);
		if (daoImp.select(shijuan).size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean delete(Shijuan shijuan) {
		// TODO Auto-generated method stub
		daoImp.delete(shijuan);
		List<Shijuan> shijuanList = daoImp.select(shijuan);
		if (shijuanList.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean update(Shijuan shijuan) {
		// TODO Auto-generated method stub
		daoImp.delete(shijuan);
		List<Shijuan> shijuanList = daoImp.select(shijuan);
		if (shijuanList.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

	public Shijuan select(Shijuan shijuan) {
		// TODO Auto-generated method stub
		return (Shijuan) daoImp.select(shijuan).get(0);
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return daoImp.selectAll();
	}

}
