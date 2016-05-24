package com.wang.action;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.wang.model.Shijuan;
import com.wang.service.ShijuanServiceImp;

public class ShijuanAction implements ModelDriven<Shijuan> {
	private Shijuan shijuan = new Shijuan();

	public Shijuan getModel() {
		// TODO Auto-generated method stub
		return shijuan;
	}

	public ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	private ShijuanServiceImp serviceImp = (ShijuanServiceImp) ac
			.getBean("shijuanServiceImp");
	public Map session = ActionContext.getContext().getSession();
	public Map request = (Map) ActionContext.getContext().get("request");

	// ����
	public String add() {
		boolean isAdd = serviceImp.add(shijuan);
		if (isAdd) {

			session.put("userList", serviceImp.selectAll());
			return "shijuanAddSuccess";
		} else {
			return "shijuanAddFail";
		}
	}

	// ɾ��
	public String delet() {
		boolean idDelet = serviceImp.delete(shijuan);
		if (idDelet) {
			session.put("userList", serviceImp.selectAll());
			return "shijuanDeletSuccess";
		} else {
			return "shijuanDeletFail";
		}
	}

	// �޸�
	public String update() {
		session.put("shijuan", serviceImp.select(shijuan));
		return "shijuanUpdate";
	}

	public String updateSuccess() {
		boolean idUpdate = serviceImp.update(shijuan);
		if (idUpdate) {
			session.put("shijuanList", serviceImp.selectAll());
			return "shijuanUpdateSuccess";
		} else {
			return "shijuanUpdateFail";
		}
	}

	// ��ѯ
	public String select() {
		session.put("shijuan", serviceImp.select(shijuan));
		return "shijuanDetail";
	}

	// ��ѯ����
	public String selectAll() {
		session.put("shijuanList", serviceImp.selectAll());
		return "shijuanSelectAll";
	}
}
