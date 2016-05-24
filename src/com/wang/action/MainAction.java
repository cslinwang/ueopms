package com.wang.action;

import java.util.List;
import java.util.Map;

import org.omg.CORBA.Request;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.sun.net.httpserver.HttpServer;
import com.wang.model.Gonggao;
import com.wang.model.Jxnr;
import com.wang.model.Kecheng;
import com.wang.model.Shijuan;
import com.wang.model.Shiti;
import com.wang.service.GonggaoServiceImp;
import com.wang.service.JxnrServiceImp;
import com.wang.service.KechengServiceImp;
import com.wang.service.MainServiceImp;
import com.wang.service.ShijuanServiceImp;
import com.wang.util.StaticMethod;

public class MainAction {
	private String ggid;
	private String kcid;
	private String jxnrid;
	private String sjid;
	private String yhm;

	public String getGgid() {
		return ggid;
	}

	public void setGgid(String ggid) {
		this.ggid = ggid;
	}

	public String getKcid() {
		return kcid;
	}

	public void setKcid(String kcid) {
		this.kcid = kcid;
	}

	public String getJxnrid() {
		return jxnrid;
	}

	public void setJxnrid(String jxnrid) {
		this.jxnrid = jxnrid;
	}

	public String getSjid() {
		return sjid;
	}

	public void setSjid(String sjid) {
		this.sjid = sjid;
	}

	public ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	private KechengServiceImp kechengServiceImp = (KechengServiceImp) ac
			.getBean("kechengServiceImp");
	private GonggaoServiceImp gonggaoServiceImp = (GonggaoServiceImp) ac
			.getBean("gonggaoServiceImp");
	private JxnrServiceImp jxnrServiceImp = (JxnrServiceImp) ac
			.getBean("jxnrServiceImp");
	private ShijuanServiceImp shijuanServiceImp = (ShijuanServiceImp) ac
			.getBean("shijuanServiceImp");
	private MainServiceImp mainServiceImp = (MainServiceImp) ac
			.getBean("mainServiceImp");
	public Map session = ActionContext.getContext().getSession();
	public Map request = (Map) ActionContext.getContext().get("request");

	public String main() {
		session.put("kechengList", kechengServiceImp.selectAll());
		session.put("gonggaoList", gonggaoServiceImp.selectAll());
		session.put("shijuanList", shijuanServiceImp.selectAll());
		System.out.println(shijuanServiceImp.selectAll());
		return "mainAction";
	}

	public String gonggao() {
		Gonggao gonggao = new Gonggao();
		gonggao.setGgid(Integer.valueOf(ggid));
		session.put("gg", gonggaoServiceImp.select(gonggao));
		return "ggAction";
	}

	public String kecheng() {
		Kecheng kc = new Kecheng();
		kc.setKcid(Integer.valueOf(kcid));
		session.put("jxnrList", jxnrServiceImp.selectAll());
		session.put("kc", kechengServiceImp.select(kc));
		System.out.println(kechengServiceImp.select(kc).getJs());
		return "kcAction";
	}

	public String jxnr() {
		Jxnr jxnr = new Jxnr();
		jxnr.setJxnrid(Integer.valueOf(jxnrid));
		session.put("jxnr", jxnrServiceImp.select(jxnr));
		return "jxnrAction";
	}

	public String juan() {
		Shijuan sj = new Shijuan();
		sj.setSjid(Integer.valueOf(sjid));
		session.put("sj", shijuanServiceImp.select(sj));
		session.put("stList", mainServiceImp.test(sj));
		return "juanAction";
	}

}
