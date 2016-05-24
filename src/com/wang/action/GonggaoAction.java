package com.wang.action;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.wang.model.Gonggao;
import com.wang.service.GonggaoServiceImp;

public class GonggaoAction implements ModelDriven<Gonggao> {
	private Gonggao gonggao = new Gonggao();

	public Gonggao getModel() {
		// TODO Auto-generated method stub
		return gonggao;
	}

	public ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	private GonggaoServiceImp serviceImp = (GonggaoServiceImp) ac
			.getBean("gonggaoServiceImp");
	public Map session = ActionContext.getContext().getSession();
	public Map request = (Map) ActionContext.getContext().get("request");

	// ����
	public String add() {
		boolean isAdd = serviceImp.add(gonggao);
		if (isAdd) {

			session.put("userList", serviceImp.selectAll());
			return "gonggaoAddSuccess";
		} else {
			return "gonggaoAddFail";
		}
	}

	// ɾ��
	public String delet() {
		boolean idDelet = serviceImp.delete(gonggao);
		if (idDelet) {
			session.put("userList", serviceImp.selectAll());
			return "gonggaoDeletSuccess";
		} else {
			return "gonggaoDeletFail";
		}
	}

	// �޸�
	public String update() {
		session.put("gonggao", serviceImp.select(gonggao));
		return "gonggaoUpdate";
	}

	public String updateSuccess() {
		boolean idUpdate = serviceImp.update(gonggao);
		if (idUpdate) {
			session.put("gonggaoList", serviceImp.selectAll());
			return "gonggaoUpdateSuccess";
		} else {
			return "gonggaoUpdateFail";
		}
	}

	// ��ѯ
	public String select() {
		session.put("gonggao", serviceImp.select(gonggao));
		return "gonggaoDetail";
	}

	// ��ѯ����
	public String selectAll() {
		session.put("gonggaoList", serviceImp.selectAll());
		return "gonggaoSelectAll";
	}
}
