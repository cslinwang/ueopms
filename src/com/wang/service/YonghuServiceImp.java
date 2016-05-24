package com.wang.service;

import java.util.List;

import com.wang.dao.YonghuDaoImp;
import com.wang.model.Yonghu;

public class YonghuServiceImp implements YonghuService {
	private YonghuDaoImp daoImp;

	public void setDaoImp(YonghuDaoImp daoImp) {
		this.daoImp = daoImp;
	}

	public Yonghu login(Yonghu yonghu) {
		// TODO Auto-generated method stub
		List<Yonghu> yonghuList = daoImp.login(yonghu);
		if (yonghuList.size() == 0) {
			System.out.println("µÇÂ½Ê§°Ü...");
			yonghu = null;
		} else {
			yonghu = yonghuList.get(0);
		}
		return yonghu;
	}

	public boolean add(Yonghu yonghu) {
		// TODO Auto-generated method stub
		daoImp.add(yonghu);
		if (daoImp.select(yonghu).size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean delete(Yonghu yonghu) {
		// TODO Auto-generated method stub
		daoImp.delete(yonghu);
		List<Yonghu> yonghuList = daoImp.select(yonghu);
		if (yonghuList.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean update(Yonghu yonghu) {
		// TODO Auto-generated method stub
		daoImp.delete(yonghu);
		List<Yonghu> yonghuList = daoImp.select(yonghu);
		if (yonghuList.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

	public Yonghu select(Yonghu yonghu) {
		// TODO Auto-generated method stub
		return (Yonghu) daoImp.select(yonghu).get(0);
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return daoImp.selectAll();
	}

}
