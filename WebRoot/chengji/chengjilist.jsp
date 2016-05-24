<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>My JSP 'chengjilist.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- 引入 -->
<link href="./images/style.css " type=text/css rel=stylesheet>
<link rel="stylesheet" type="text/css" media="screen"
	href="./css/tinyTips.css" />
<!-- 核心标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>

<form name="form" action="" method="post">
	<table class="border" width="98%" border="0" align="center"
		cellpadding="1" cellspacing="0">
		<tr>
			<td height="565" align="center" valign="top" class="bg_low"><table
					width="100%" height="25" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td align="center" valign="middle" class="bgtop"><font
							color="#FFFFFF"><b>成绩列表</b> </font>
						</td>
					</tr>
				</table>
				<TABLE cellSpacing=0 cellPadding=3 width="100%" align=center
					border=0>
					<TBODY>

						<tr align="center" bgcolor="#ebf0f7">
							<td width="9%" height="25">成绩编号</td>
							<td width="9%" height="25">试卷</td>
							<td width="9%" height="25">用户</td>
							<td width="9%" height="25">时间</td>
							<td width="9%" height="25">成绩</td>
							<td width="10%">操作</td>
						</tr>


						<c:forEach var="cj" items="${chengjiList }">
						<tr align='center' bgcolor='#FFFFFF'
							onmouseover='this.style.background="#F2FDFF"'
							onmouseout='this.style.background="#FFFFFF"'>
							<td height="24">${cj.cjid }</td>
							<td height="24">${cj.sjid }</td>
							<td height="24">${cj.yh }</td>
							<td height="24">${cj.sj }</td>
							<td height="24">${cj.cj }</td>
							<td><a href="chengjiupdate.jsp?cjid=${cj.cjid }">编辑</a>| <a
								href="chengjidelete.jsp?cjid=${cj.cjid }"
								onClick="javascript:if(confirm('是否删除')){return
									true;}else{return false;}">删除</a>|<a
								href="chengjidetail.jsp?cjid=${cj.cjid }">查看</a></td>
						</tr>
						</c:forEach>
					</TBODY>
				</TABLE></td>
		</tr>
	</table>
	</DIV>
	</div>
</form>
</body>
</html>
