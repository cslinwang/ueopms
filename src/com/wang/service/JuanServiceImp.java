package com.wang.service;

import java.util.List;

import com.wang.dao.JuanDaoImp;
import com.wang.model.Juan;

public class JuanServiceImp implements JuanService {
	private JuanDaoImp daoImp;

	public void setDaoImp(JuanDaoImp daoImp) {
		this.daoImp = daoImp;
	}

	public boolean add(Juan juan) {
		// TODO Auto-generated method stub
		daoImp.add(juan);
		if (daoImp.select(juan).size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean delete(Juan juan) {
		// TODO Auto-generated method stub
		daoImp.delete(juan);
		List<Juan> juanList = daoImp.select(juan);
		if (juanList.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean update(Juan juan) {
		// TODO Auto-generated method stub
		daoImp.delete(juan);
		List<Juan> juanList = daoImp.select(juan);
		if (juanList.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

	public Juan select(Juan juan) {
		// TODO Auto-generated method stub
		return (Juan) daoImp.select(juan).get(0);
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return daoImp.selectAll();
	}

}
