package com.wang.action;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.wang.model.Shiti;
import com.wang.service.ShitiServiceImp;

public class ShitiAction implements ModelDriven<Shiti> {
	private Shiti shiti = new Shiti();

	public Shiti getModel() {
		// TODO Auto-generated method stub
		return shiti;
	}

	public ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	private ShitiServiceImp serviceImp = (ShitiServiceImp) ac
			.getBean("shitiServiceImp");
	public Map session = ActionContext.getContext().getSession();
	public Map request = (Map) ActionContext.getContext().get("request");

	// 增加
	public String add() {
		boolean isAdd = serviceImp.add(shiti);
		if (isAdd) {

			session.put("userList", serviceImp.selectAll());
			return "shitiAddSuccess";
		} else {
			return "shitiAddFail";
		}
	}

	// 删除
	public String delet() {
		boolean idDelet = serviceImp.delete(shiti);
		if (idDelet) {
			session.put("userList", serviceImp.selectAll());
			return "shitiDeletSuccess";
		} else {
			return "shitiDeletFail";
		}
	}

	// 修改
	public String update() {
		session.put("shiti", serviceImp.select(shiti));
		return "shitiUpdate";
	}

	public String updateSuccess() {
		boolean idUpdate = serviceImp.update(shiti);
		if (idUpdate) {
			session.put("shitiList", serviceImp.selectAll());
			return "shitiUpdateSuccess";
		} else {
			return "shitiUpdateFail";
		}
	}

	// 查询
	public String select() {
		session.put("shiti", serviceImp.select(shiti));
		return "shitiDetail";
	}

	// 查询所有
	public String selectAll() {
		session.put("shitiList", serviceImp.selectAll());
		return "shitiSelectAll";
	}
}
