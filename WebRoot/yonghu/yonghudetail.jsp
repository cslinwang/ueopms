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

<title>My JSP 'yonghudetail.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="./images/style.css" type=text/css rel=stylesheet>
<link rel="stylesheet" type="text/css" media="screen"
	href="./css/tinyTips.css" />

</head>

<body>
	<form name="form" action="" method="post">
		<div class=formzone>
			<DIV class=searchzone>

				<TABLE height=30 cellSpacing=0 cellPadding=0 width="100%" border=0>
					<TBODY>
						<TR>
							<TD height=30>用户详细信息</TD>
							<TD align=right colSpan=2>&nbsp;</TD>
						</TR>
					</TBODY>
				</TABLE>
			</DIV>
			<div class=tablezone>
				<div class=noticediv id=notice></div>
				<TABLE cellSpacing=0 cellPadding=2 width="100%" align=center
					border=0>
					<TBODY>

						<tr>
							<td align=middle width=100 height=30>用户名</td>
							<td height=30>${yonghu.yhm }</td>

						</tr>
						<tr>
							<td align=middle width=100 height=30>密码</td>
							<td height=30>${yonghu.mm }</td>

						</tr>
						<tr>
							<td align=middle width=100 height=30>姓名</td>
							<td height=30>${yonghu.xm }</td>

						</tr>
						<tr>
							<td align=middle width=100 height=30>权限</td>
							<td height=30>${yonghu.qx }</td>

						</tr>
						<tr>
							<td align=middle width=100 height=30>电话</td>
							<td height=30>${yonghu.dh }</td>

						</tr>
						<tr>
							<td align=middle width=100 height=30>地址</td>
							<td height=30>dz</td>

						</tr>

					</TBODY>
				</TABLE>
			</div>
			<DIV class=adminsubmit>
				&nbsp;&nbsp; <INPUT class="button" type="button" value="返回"
					onClick="history.go(-1)" />
			</div>
		</div>
	</form>

</body>
</html>
