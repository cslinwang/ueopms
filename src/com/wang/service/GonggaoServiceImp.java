package com.wang.service;

import java.util.List;

import com.wang.dao.GonggaoDaoImp;
import com.wang.model.Gonggao;

public class GonggaoServiceImp implements GonggaoService {
	private GonggaoDaoImp daoImp;

	public void setDaoImp(GonggaoDaoImp daoImp) {
		this.daoImp = daoImp;
	}

	public boolean add(Gonggao gonggao) {
		// TODO Auto-generated method stub
		daoImp.add(gonggao);
		if (daoImp.select(gonggao).size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean delete(Gonggao gonggao) {
		// TODO Auto-generated method stub
		daoImp.delete(gonggao);
		List<Gonggao> gonggaoList = daoImp.select(gonggao);
		if (gonggaoList.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean update(Gonggao gonggao) {
		// TODO Auto-generated method stub
		daoImp.delete(gonggao);
		List<Gonggao> gonggaoList = daoImp.select(gonggao);
		if (gonggaoList.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

	public Gonggao select(Gonggao gonggao) {
		// TODO Auto-generated method stub
		return (Gonggao) daoImp.select(gonggao).get(0);
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return daoImp.selectAll();
	}

}
