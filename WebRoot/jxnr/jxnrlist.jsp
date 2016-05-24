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

<title>My JSP 'jxnrlist.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- 引入 -->
<link href="./images/style.css" type=text/css rel=stylesheet>
<link href="./images/style.css " type=text/css rel=stylesheet>
<link rel="stylesheet" type="text/css" media="screen"
	href="./images/css/tinyTips.css" />
<!-- 核心标签库 -->
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
								color="#FFFFFF"><b>教学内容列表</b> </font>
							</td>
						</tr>
					</table>
					<TABLE cellSpacing=0 cellPadding=3 width="100%" align=center
						border=0>
						<TBODY>

							<tr align="center" bgcolor="#ebf0f7">
								<td width="9%" height="25">教学内容编号</td>
								<td width="9%" height="25">课程</td>
								<td width="9%" height="25">章节</td>
								<td width="9%" height="25">内容</td>
								<td width="9%" height="25">备注</td>
								<td width="10%">操作</td>
							</tr>

							<c:forEach var="jxnr" items="${jxnrList }">
								<tr align='center' bgcolor='#FFFFFF'
									onmouseover='this.style.background="#F2FDFF"'
									onmouseout='this.style.background="#FFFFFF"'>
									<td height="24">${jxnr.jxnrid }</td>
									<td height="24">${jxnr.kc }</td>
									<td height="24">${jxnr.zj }</td>
									<td height="24">${jxnr.nr }nr</td>
									<td height="24">${jxnr.bz }</td>
									<td><a href="jxnrupdate.jsp?jxnrid=${jxnr.jxnrid }">编辑</a>|
										<a href="jxnrdeleteAction?jxnrid=${jxnr.jxnrid }"
										onClick="javascript:if(confirm('是否删除')){return true;}else{return false;}">删除</a>|<a
										href="jxnrdetail.jsp?jxnrid=${jxnr.jxnrid }">查看</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table></td>
			</tr>
		</table>
		</div>
		</div>
	</form>
</body>
</html>
