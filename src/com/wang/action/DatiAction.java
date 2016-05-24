package com.wang.action;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.wang.model.Dati;
import com.wang.service.DatiServiceImp;

public class DatiAction implements ModelDriven<Dati> {
	private Dati dati = new Dati();

	public Dati getModel() {
		// TODO Auto-generated method stub
		return dati;
	}

	public ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	private DatiServiceImp serviceImp = (DatiServiceImp) ac
			.getBean("datiServiceImp");
	public Map session = ActionContext.getContext().getSession();
	public Map request = (Map) ActionContext.getContext().get("request");

	// 增加
	public String add() {
		boolean isAdd = serviceImp.add(dati);
		if (isAdd) {

			session.put("userList", serviceImp.selectAll());
			return "datiAddSuccess";
		} else {
			return "datiAddFail";
		}
	}

	// 删除
	public String delet() {
		boolean idDelet = serviceImp.delete(dati);
		if (idDelet) {
			session.put("userList", serviceImp.selectAll());
			return "datiDeletSuccess";
		} else {
			return "datiDeletFail";
		}
	}

	// 修改
	public String update() {
		session.put("dati", serviceImp.select(dati));
		return "datiUpdate";
	}

	public String updateSuccess() {
		boolean idUpdate = serviceImp.update(dati);
		if (idUpdate) {
			session.put("datiList", serviceImp.selectAll());
			return "datiUpdateSuccess";
		} else {
			return "datiUpdateFail";
		}
	}

	// 查询
	public String select() {
		session.put("dati", serviceImp.select(dati));
		return "datiDetail";
	}

	// 查询所有
	public String selectAll() {
		session.put("datiList", serviceImp.selectAll());
		return "datiSelectAll";
	}
}
