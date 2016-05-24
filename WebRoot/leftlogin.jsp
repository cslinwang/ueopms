<%@ page language="java" import="java.util.*,com.wang.model.Yonghu" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'leftlogin.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<table width="243" border="0" cellpadding="0" cellspacing="1"
		bgcolor="#FED5BC">
		<tr>
			<td bgcolor="#FFFFFF"><table width="243" border="0"
					cellPadding="0" cellSpacing="0">
					<tr>
						<td height="36" align="center" background="images/loginh2.gif"><p
								class="nav">
								<strong>会员中心</strong>
						</td>
					</tr>
					<tr>
						<td align="center">

							<%
								if (session.getAttribute("yh") != null) {
							%><table border="0" cellpadding="0" cellspacing="0" width="92%">
								<tr>
									<td height="30" align="center">[欢迎您：${sessionScope.yh.yhm
										}| <a href="quit.jsp">退出登录</a>]</td>
								</tr>
								<tr>
									<td height="80" align="center"><p
											style="line-height: 150%">

											<a href="mychengji.jsp">我的成绩</a> <br>
									</td>
								</tr>
							</table> <%
 	} else {
 %>
							<table border="0" cellpadding="0" cellspacing="0" width="92%">
								<form method="POST" name="formlogin" action="ComLoginAction">
									<tr>
										<td height="30" align="center"><font color="#336699">用户名：
												<input name="yhm" size="16" maxlength="20"> </font></td>
									</tr>
									<tr>
										<td height="30" align="center"><font color="#336699">密
												码： <input name="mm" type="password" size="16" maxlength="12">
										</font></td>
									</tr>
									<tr>
										<td height="35" align="center"><input type=image
											border="0" src="images/loginok.gif"></td>
									</tr>
								</form>
							</table> <%
 	}
 %>
							<table width="92%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td height="28" align="center"><p>
											<img src="images/login_ti.gif" width="14" height="14"
												align="absmiddle"> 如果您不是会员，请先<a href="reg.jsp"
												target="">注册会员</a>
										</p>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td></a></td>
					</tr>
				</table></td>
		</tr>
	</table>
</body>
</html>
