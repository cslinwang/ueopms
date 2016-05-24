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

<title>My JSP 'kechenglist.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="./images/style.css" type=text/css rel=stylesheet>
<link rel="stylesheet" type="text/css" media="screen"
	href="./css/tinyTips.css" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>

<body>
	<form name="form" action="" method="post">
		<table class="border" width="98%" border="0" align="center"
			cellpadding="1" cellspacing="0">
			<tr>
				<td height="565" align="center" valign="top" class="bg_low"><table
						width="100%" height="25" border="0" cellpadding="0"
						cellspacing="0">
						<tr>
							<td align="center" valign="middle" class="bgtop"><font
								color="#FFFFFF"><b>课程列表</b> </font>
							</td>
						</tr>
					</table>
					<TABLE cellSpacing=0 cellPadding=3 width="100%" align=center
						border=0>
						<TBODY>

							<tr align="center" bgcolor="#ebf0f7">
								<td width="9%" height="25">课程编号</td>
								<td width="9%" height="25">课程</td>
								<td width="9%" height="25">教学内容</td>
								<td width="9%" height="25">图片</td>
								<td width="9%" height="25">介绍</td>
								<td width="10%">操作</td>
							</tr>
							</img>
							<c:forEach var="kc" items="${kechengList }">
								<tr align='center' bgcolor='#FFFFFF'
									onmouseover='this.style.background="#F2FDFF"'
									onmouseout='this.style.background="#FFFFFF"'>
									<td height="24">${kc.kcid }</td>
									<td height="24">${kc.kc }</td>
									<td height="24">${kc.jxnr }</td>
									<td height="24"><img src="./upload/${kc.tp }"
										width="
										50" height="50" />
									</td>
									<td height="24">${kc.js }</td>
									<td><a href="kechengupdate.jsp?kcid=${kc.kcid }">编辑</a>| <a
										href="kechengdeleteAction?kcid=${kc.kcid }>"
										onClick="javascript:if(confirm('是否删除')){return true;}else{return false;}">删除</a>|<a
										href="kechengdetail.jsp?kcid=${kc.kcid }">查看</a>
									</td>
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
