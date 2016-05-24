package com.wang.action;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.wang.model.Kecheng;
import com.wang.service.KechengServiceImp;

public class KechengAction implements ModelDriven<Kecheng> {
	private Kecheng kecheng = new Kecheng();

	public Kecheng getModel() {
		// TODO Auto-generated method stub
		return kecheng;
	}

	public ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	private KechengServiceImp serviceImp = (KechengServiceImp) ac
			.getBean("kechengServiceImp");
	public Map session = ActionContext.getContext().getSession();
	public Map request = (Map) ActionContext.getContext().get("request");

	// ����
	public String add() {
		boolean isAdd = serviceImp.add(kecheng);
		if (isAdd) {

			session.put("userList", serviceImp.selectAll());
			return "kechengAddSuccess";
		} else {
			return "kechengAddFail";
		}
	}

	// ɾ��
	public String delet() {
		boolean idDelet = serviceImp.delete(kecheng);
		if (idDelet) {
			session.put("kechengList", serviceImp.selectAll());
			return "kechengDeletSuccess";
		} else {
			return "kechengDeletFail";
		}
	}

	// �޸�
	public String update() {
		session.put("kecheng", serviceImp.select(kecheng));
		return "kechengUpdate";
	}

	public String updateSuccess() {
		boolean idUpdate = serviceImp.update(kecheng);
		if (idUpdate) {
			session.put("kechengList", serviceImp.selectAll());
			return "kechengUpdateSuccess";
		} else {
			return "kechengUpdateFail";
		}
	}

	// ��ѯ
	public String select() {
		session.put("kecheng", serviceImp.select(kecheng));
		return "kechengDetail";
	}

	// ��ѯ����
	public String selectAll() {
		session.put("kechengList", serviceImp.selectAll());
		return "kechengSelectAll";
	}
}
