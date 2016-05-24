package com.wang.action;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.wang.model.Jxnr;
import com.wang.service.JxnrServiceImp;

public class JxnrAction implements ModelDriven<Jxnr> {
	private Jxnr jxnr = new Jxnr();

	public Jxnr getModel() {
		// TODO Auto-generated method stub
		return jxnr;
	}

	public ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	private JxnrServiceImp serviceImp = (JxnrServiceImp) ac
			.getBean("jxnrServiceImp");
	public Map session = ActionContext.getContext().getSession();
	public Map request = (Map) ActionContext.getContext().get("request");

	// ����
	public String add() {
		boolean isAdd = serviceImp.add(jxnr);
		if (isAdd) {

			session.put("jxnrList", serviceImp.selectAll());
			return "jxnrAddSuccess";
		} else {
			return "jxnrAddFail";
		}
	}

	// ɾ��
	public String delet() {
		System.out.println(jxnr.getJxnrid());
		boolean idDelet = serviceImp.delete(jxnr);
		if (idDelet) {
			session.put("jxnrList", serviceImp.selectAll());
			return "jxnrDeletSuccess";
		} else {
			return "jxnrDeletFail";
		}
	}

	// �޸�
	public String update() {
		session.put("jxnr", serviceImp.select(jxnr));
		return "jxnrUpdate";
	}

	public String updateSuccess() {
		boolean idUpdate = serviceImp.update(jxnr);
		if (idUpdate) {
			session.put("jxnrList", serviceImp.selectAll());
			return "jxnrUpdateSuccess";
		} else {
			return "jxnrUpdateFail";
		}
	}

	// ��ѯ
	public String select() {
		session.put("jxnr", serviceImp.select(jxnr));
		return "jxnrDetail";
	}

	// ��ѯ����
	public String selectAll() {
		
		session.put("jxnrList", serviceImp.selectAll());
		return "jxnrSelectAll";
	}
}
