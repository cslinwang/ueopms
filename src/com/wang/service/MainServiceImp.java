package com.wang.service;

import java.util.List;

import com.wang.dao.GonggaoDaoImp;
import com.wang.dao.MainDaoImp;
import com.wang.model.Juan;
import com.wang.model.Shijuan;

public class MainServiceImp implements MainService {
	private MainDaoImp daoImp;

	public void setDaoImp(MainDaoImp daoImp) {
		this.daoImp = daoImp;
	}

	public List test(Shijuan shijuan) {
		// TODO Auto-generated method stub
		return daoImp.test(shijuan);
	}
}
