<%@ page language="java" import="java.util.*,com.wang.model.Yonghu"
	pageEncoding="utf-8"%>
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

<title>My JSP 'top.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>
<body topmargin="0" leftmargin="0" rightmargin="0" bottommargin="0">
	<table width="980" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td width="249" height="95" rowspan="2"><img
				src="images/2350510.png" width="325" border="0"></td>
			<td align="center" height="48" width="731">&nbsp;</td>
		</tr>
		<tr>
			<td height="35" valign="bottom" width="731"><table border="0"
					cellpadding="0" cellspacing="0">
					<tr>
						<td width="95" height="35" align="center"
							background="images/topli_bg22.gif"><b><a
								href="mainAction"><font color="#FFFFFF" class="nav">首页</font>
							</a> </b></td>


						<td width="95" height="35" align="center"
							background="images/topli_bg22.gif"><b><a
								href="kecheng.jsp"><font color="#FFFFFF" class="nav">课程介绍</font>
							</a> </b></td>
						<td width="95" height="35" align="center"
							background="images/topli_bg22.gif"><b><a
								href="gonggao.jsp"><font color="#FFFFFF" class="nav">系统公告</font>
							</a> </b></td>
						<%
							if (session.getAttribute("yh") != null) {
								Yonghu yh = (Yonghu) session.getAttribute("yh");
						%>

						<td width="95" height="35" align="center"
							background="images/topli_bg22.gif"><b><a
								href="shijuan.jsp"><font color="#FFFFFF" class="nav">在线测试</font>
							</a> </b></td>
						<%
							if (yh.getQx().equals("管理员")) {
						%>

						<td width="95" height="35" align="center"
							background="images/topli_bg22.gif"><b><a
								href="login.jsp"><font color="#FFFFFF" class="nav">后台管理</font>
							</a> </b></td>
						<%
							}
							}
						%>
					</tr>
				</table></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="56" background="images/search_bg.gif"><table
								border="0" cellpadding="5" cellspacing="0">
								<form method="POST" name="searchform" action=".jsp">
									<tr>
										<td width="55" align="right"><img
											src="images/search_li.gif" width="34" height="36"></td>

										<td width="195" align="center"></td>
										<td width="112" align="center"></td>
										<td width="112" align="center"></td>
										<td width="268" align="center"><b><font
												style="font-size:12pt; font-family:Arial;color:#FFFF99;">服务热线：1234567890</font>
										</b></td>
									</tr>
								</form>
							</table></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<table width="980" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="5"></td>
		</tr>
	</table>
</html>
