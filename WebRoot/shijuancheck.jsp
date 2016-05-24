<%@ page contentType="text/html; charset=gb2312" language="java"
	import="java.sql.*"%>
<%@ page import="com.wang.util.*"%>
<%
	DBO db = new DBO();
	request.setCharacterEncoding("utf-8");
	String sj = (String) request.getParameter("sj");
	String yh = (String) request.getParameter("yh");
	String sql = "select b.*  from juan a,shiti b where a.st=b.stid and a.sj='"
			+ sj + "'";
	ResultSet rs = null;
	db.open();
	rs = db.query(sql);
	String a = "";
	String b = "";
	String c = "";//每题得分
	int d = 0;
	int all = 0;
	String flag = "";
	String time = StaticMethod.getStringDate();
	while (rs.next()) {
		a = (String) request.getParameter("hd" + rs.getString("stid"));//获得前台答案
		flag = "错";
		b = rs.getString("da");
		c = rs.getString("f");
		System.out.println(b);
		System.out.println(a);
		if (a != null) {
			if (a.equals(b)) {
				d = Integer.parseInt(c);
				all = all + d;
				flag = "对";
				
			}
		} else {
			a = "";
		}
		sql = " insert into dati(sj,st,da,dc,shijian,yh) values('" + sj
				+ "','" + rs.getString("stid") + "','" + a + "','"
				+ flag + "','" + time + "','" + yh + "')";
		db.open();
		db.update(sql);
	}

	sql = "insert into chengji(sjid,yh,sj,cj) values('" + sj + "','"
			+ yh + "','" + time + "','" + all + "')";
	db.open();
	db.update(sql);
	db.close();
	//out.println("all="+all);
	out.println("<script>");
	out.println("alert('提交成功得分," + all + " !');");
	out.println("window.location='mychengji.jsp'");
	out.println("</script>");
%>
