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

<title>My JSP 'kecheng.jsp' starting page</title>

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

<body>
	<jsp:include page="top.jsp" />
	<div align="center">
		<table width=980 border=0 cellpadding=0 cellspacing=0
			bgcolor="#FFFFFF">
			<tr>
				<td width=250 valign="top"><!--#include file="inlog.asp"-->
					<table width="243" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="8"></td>
						</tr>
					</table> <jsp:include page="leftlogin.jsp" /><br></td>
				<td width="730" align="right" valign="top">
					<table width="100%" height="5" border="0" cellpadding="0"
						cellspacing="0" bgcolor="#FFFFFF">
						<tr>
							<td align="right"><a href="12" target="_blank"></a></td>
						</tr>


						<tr>
							<td height="32" align="center" background="images/right_h1.gif">
								<table width="100%" border="0" cellspacing="0">
									<tr>
										<td width="5%">&nbsp;</td>
										<td width="63%" height="30"><font color="#ffffff"
											class="nav"><b></b> </font> &nbsp;&nbsp;<font color="#ffffff">培训信息</font>
										</td>
										<td width="32%"></script></td>
									</tr>
								</table>
							</td>
						</tr>


						<tr>
							<td width="100%" align="center">


								<table width="100%" border="0" cellpadding="0" cellspacing="1"
									bgcolor="#E7E7E7">


									<tr>
										<td height="134" align="center" bgcolor="#FFFFFF"><table
												border="0" cellpadding="0" cellspacing="0" width="100%"
												background="img/pattern.gif"
												style="border: 1px solid #C0C0C0">
												<tr>
													<td height="30" colspan="8">&nbsp;</td>
												</tr>
												<tr>
													<th>序号</th>

													<th>标题</th>

													<th>操作</th>
												</tr>
												<%
													int i = 1;
												%>
												<c:forEach var="kc" items="${kechengList }">
													<tr>
														<td class="list_data_text"><div align="center"><%=i%></div>
															<%
																i++;
															%>
														</td>

														<td class="list_data_text"><div align="center">${kc.kc
																}></div>
														</td>

														<td><div align="center">
																<a href="kcAction?kcid=${kc.kcid }">详细</a>
															</div>
														</td>
													</tr>
												</c:forEach>
											</table></td>
									</tr>



								</table>
							</td>
						</tr>

						<tr>
							<td width="98%" height="23" align="center">&nbsp;</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div><jsp:include page="bottom.jsp" />
</body>
</html>
