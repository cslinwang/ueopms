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

<title>My JSP 'yonghulist.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>

<body>
<%-- <jsp:forward page="quanxianSelectAllAction.action"></jsp:forward>  --%>
	<form name="form" action="" method="post">
		<table class="border" width="98%" border="0" align="center"
			cellpadding="1" cellspacing="0">
			<tr>
				<td height="565" align="center" valign="top" class="bg_low"><table
						width="100%" height="25" border="0" cellpadding="0"
						cellspacing="0">
						<tr>
							<td align="center" valign="middle" class="bgtop"><font
								color="#FFFFFF"><b>用户列表</b> </font></td>
						</tr>
					</table>
					<TABLE cellSpacing=0 cellPadding=3 width="100%" align=center
						border=0>
						<TBODY>

							<tr align="center" bgcolor="#ebf0f7">
								<td width="9%" height="25">权限编号</td>
								<td width="9%" height="25">权限</td>
								<td width="10%">操作</td>
							</tr>
							<%
								int i = 1;
							%>
							<c:forEach var="qx" items="${quanxianList }">
								<tr align='center' bgcolor='#FFFFFF'
									onmouseover='this.style.background="#F2FDFF"'
									onmouseout='this.style.background="#FFFFFF"'>
									<td height="24"><%=i%></td>
									<td height="24">${qx.qx }</td>
									<td><a href="quanxianUpdateAction?qxid=${qx.qxid }">编辑</a>|
										<a href="quanxiandeleteAction?qxid=${qx.qxid }"
										onClick="javascript:if(confirm('是否删除')){return true;}else{return false;}">删除</a>|<a
										href="quanxianDetailAction?qxid=${qx.qxid }">查看</a>
									</td>
									<%
										i++;
									%>
								</tr>
							</c:forEach>
						</TBODY>
					</TABLE>
				</td>
			</tr>
		</table>
		</DIV>


		</div>
	</form>

</body>
</html>
