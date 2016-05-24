<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<title>My JSP 'bottom.jsp' starting page</title>

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
	<table width=980 border=0 align="center" cellpadding=0 cellspacing=0>
		<tr>
			<td height=5 colspan=5></td>
		</tr>
		<tr>
			<td colspan=5 align=center><table width="100%" border="0"
					cellspacing="0" cellpadding="0">
					<tr>
						<td height="34" align="center" background="images/foot_bg.gif">



						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="10"></td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td width=255 align=center><p
					style='line-height: 150%; margin: 10px'>欢迎来到大学英语课后练习管理系统
			</td>
			<td width=1 bgcolor="#C7F1F3"></td>
			<td width=4></td>

			<p></p>
			<td width="73" align="center"><a href="#top"></a></td>
		</tr>
	</table>
	<table width="980" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="10"></td>
		</tr>
	</table>
</body>
</html>
