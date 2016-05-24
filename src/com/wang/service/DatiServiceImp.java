package com.wang.service;

import java.util.List;

import com.wang.dao.DatiDaoImp;
import com.wang.model.Dati;

public class DatiServiceImp implements DatiService {
	private DatiDaoImp daoImp;

	public void setDaoImp(DatiDaoImp daoImp) {
		this.daoImp = daoImp;
	}

	public boolean add(Dati dati) {
		// TODO Auto-generated method stub
		daoImp.add(dati);
		if (daoImp.select(dati).size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean delete(Dati dati) {
		// TODO Auto-generated method stub
		daoImp.delete(dati);
		List<Dati> datiList = daoImp.select(dati);
		if (datiList.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean update(Dati dati) {
		// TODO Auto-generated method stub
		daoImp.delete(dati);
		List<Dati> datiList = daoImp.select(dati);
		if (datiList.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

	public Dati select(Dati dati) {
		// TODO Auto-generated method stub
		return (Dati) daoImp.select(dati).get(0);
	}

	public List selectAll() {
		// TODO Auto-generated method stub
		return daoImp.selectAll();
	}

}
