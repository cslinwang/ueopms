package com.wang.action;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.wang.model.Quanxian;
import com.wang.service.QuanxianServiceImp;

public class QuanxianAction implements ModelDriven<Quanxian> {
	private Quanxian quanxian = new Quanxian();

	public Quanxian getModel() {
		// TODO Auto-generated method stub
		return quanxian;
	}

	public ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	private QuanxianServiceImp serviceImp = (QuanxianServiceImp) ac
			.getBean("quanxianServiceImp");
	public Map session = ActionContext.getContext().getSession();
	public Map request = (Map) ActionContext.getContext().get("request");

	// ����
	public String add() {
		boolean isAdd = serviceImp.add(quanxian);
		if (isAdd) {

			session.put("quanxianList", serviceImp.selectAll());
			return "quanxianAddSuccess";
		} else {
			return "quanxianAddFail";
		}
	}

	// ɾ��
	public String delet() {
		boolean idDelet = serviceImp.delete(quanxian);
		if (idDelet) {
			session.put("quanxianList", serviceImp.selectAll());
			return "quanxianDeletSuccess";
		} else {
			return "quanxianDeletFail";
		}
	}

	// �޸�
	public String update() {
		session.put("quanxian", serviceImp.select(quanxian));
		return "quanxianUpdate";
	}

	public String updateSuccess() {
		boolean idUpdate = serviceImp.update(quanxian);
		if (idUpdate) {
			session.put("quanxianList", serviceImp.selectAll());
			return "quanxianUpdateSuccess";
		} else {
			return "quanxianUpdateFail";
		}
	}

	// ��ѯ
	public String select() {
		session.put("quanxian", serviceImp.select(quanxian));
		return "quanxianDetail";
	}

	// ��ѯ����
	public String selectAll() {
		session.put("quanxianList", serviceImp.selectAll());
		return "quanxianSelectAll";
	}
}
