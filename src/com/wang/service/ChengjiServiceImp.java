package com.wang.service;

import java.util.List;

import com.wang.dao.ChengjiDaoImp;
import com.wang.model.Chengji;
import com.wang.model.Quanxian;

public class ChengjiServiceImp implements ChengjiService {
	private ChengjiDaoImp daoImp;

	public void setDaoImp(ChengjiDaoImp daoImp) {
		this.daoImp = daoImp;
	}

	public boolean add(Chengji chengji) {
		// TODO Auto-generated method stub
		daoImp.add(chengji);
		if (daoImp.select(chengji).size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean delete(Chengji chengji) {
		// TODO Auto-generated method stub
		daoImp.delete(chengji);
		List<Chengji> chengjiList = daoImp.select(chengji);
		if (chengjiList.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean update(Chengji chengji) {
		// TODO Auto-generated method stub
		daoImp.delete(chengji);
		List<Chengji> chengjiList = daoImp.select(chengji);
		if (chengjiList.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

	public Chengji select(Chengji chengji) {
		// TODO Auto-generated method stub
		return (Chengji) daoImp.select(chengji).get(0);
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return daoImp.selectAll();
	}

}
