package com.wang.action;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.wang.model.Yonghu;
import com.wang.service.YonghuServiceImp;

public class YonghuAction implements ModelDriven<Yonghu> {
	private Yonghu yonghu = new Yonghu();

	public Yonghu getModel() {
		// TODO Auto-generated method stub
		return yonghu;
	}

	private String temp = "yonghu";
	public ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	private YonghuServiceImp serviceImp = (YonghuServiceImp) ac.getBean(temp
			+ "ServiceImp");
	public Map session = ActionContext.getContext().getSession();
	public Map request = (Map) ActionContext.getContext().get("request");

	// 登陆
	public String login() {
		yonghu = serviceImp.login(yonghu);
		if (yonghu == null) {
			return "loginFalse";
		} else if (yonghu.getQx().equals("管理员")) {
			session.put("yh", yonghu);
			session.put("userList", serviceImp.selectAll());
			return "manageLogin";
		} else {
			session.put("yh", yonghu);
			return "userLogin";
		}
	}

	// 前台 登陆
	public String comlogin() {
		yonghu = serviceImp.login(yonghu);
		if (yonghu == null) {
			return "loginFalse";
		} else {
			session.put("yh", yonghu);
			return "comLogin";
		}
	}

	// 增加
	public String add() {
		boolean isAdd = serviceImp.add(yonghu);
		if (isAdd) {

			session.put("userList", serviceImp.selectAll());
			return temp + "AddSuccess";
		} else {
			return temp + "AddFail";
		}
	}

	// 删除
	public String delet() {
		boolean idDelet = serviceImp.delete(yonghu);
		if (idDelet) {
			session.put("userList", serviceImp.selectAll());
			return temp + "DeletSuccess";
		} else {
			return temp + "DeletFail";
		}
	}

	// 修改
	public String update() {
		session.put("yonghu", serviceImp.select(yonghu));
		return temp + "Update";
	}

	public String updateSuccess() {
		boolean idUpdate = serviceImp.update(yonghu);
		if (idUpdate) {
			session.put("userList", serviceImp.selectAll());
			return temp + "UpdateSuccess";
		} else {
			return temp + "UpdateFail";
		}
	}

	// 查询
	public String select() {
		session.put("yonghu", serviceImp.select(yonghu));
		return temp + "Detail";
	}

	// 查询所有
	public String selectAll() {
		session.put("userList", serviceImp.selectAll());
		return temp + "SelectAll";
	}

	// 注册
	public String reg() {
		boolean isAdd = serviceImp.add(yonghu);
		if (isAdd) {
			session.put("yh", serviceImp.select(yonghu));
			return temp + "RegSuccess";
		} else {
			return temp + "RegFail";
		}
	}
}
