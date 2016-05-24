package com.wang.action;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.wang.model.Chengji;
import com.wang.service.ChengjiServiceImp;

public class ChengjiAction implements ModelDriven<Chengji> {
	private Chengji chengji = new Chengji();

	public Chengji getModel() {
		// TODO Auto-generated method stub
		return chengji;
	}

	public ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	private ChengjiServiceImp serviceImp = (ChengjiServiceImp) ac
			.getBean("chengjiServiceImp");
	public Map session = ActionContext.getContext().getSession();
	public Map request = (Map) ActionContext.getContext().get("request");

	// 增加
	public String add() {
		boolean isAdd = serviceImp.add(chengji);
		if (isAdd) {

			session.put("chengjiList", serviceImp.selectAll());
			return "chengjiAddSuccess";
		} else {
			return "chengjiAddFail";
		}
	}

	// 删除
	public String delet() {
		boolean idDelet = serviceImp.delete(chengji);
		if (idDelet) {
			session.put("chengjiList", serviceImp.selectAll());
			return "chengjiDeletSuccess";
		} else {
			return "chengjiDeletFail";
		}
	}

	// 修改
	public String update() {
		session.put("chengji", serviceImp.select(chengji));
		return "chengjiUpdate";
	}

	public String updateSuccess() {
		boolean idUpdate = serviceImp.update(chengji);
		if (idUpdate) {
			session.put("chengjiList", serviceImp.selectAll());
			return "chengjiUpdateSuccess";
		} else {
			return "chengjiUpdateFail";
		}
	}

	// 查询
	public String select() {
		session.put("chengji", serviceImp.select(chengji));
		return "chengjiDetail";
	}

	// 查询所有
	public String selectAll() {
		session.put("chengjiList", serviceImp.selectAll());
		System.out.println(serviceImp.selectAll().size());
		return "chengjiSelectAll";
	}
}
