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

<title>My JSP 'ajxnr.jsp' starting page</title>

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

<jsp:include page="top.jsp" />
<div align="center">
	<table width=980 border=0 cellpadding=0 cellspacing=0 bgcolor="#FFFFFF">
		<tr>
			<td width=250 valign="top">

				<table width="243" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="8"></td>
					</tr>
				</table> <jsp:include page="leftlogin.jsp" /><br>
			</td>
			<td width="730" align="right" valign="top">
				<table width="100%" height="5" border="0" cellpadding="0"
					cellspacing="0" bgcolor="#FFFFFF">
					<tr>
						<td align="right"><a href="12" target="_blank"></a>
						</td>
					</tr>


					<tr>
						<td height="32" align="center" background="images/right_h1.gif">
							<table width="100%" border="0" cellspacing="0">
								<tr>
									<td width="5%">&nbsp;</td>
									<td width="63%" height="30"><font color="#ffffff"
										class="nav"><b></b> </font> &nbsp;&nbsp;首页->教学内容查看<font
										color="#ffffff">&nbsp;</font></td>
									<td width="32%"></td>
								</tr>
							</table></td>
					</tr>



					<tr>
						<td width="98%" height="23" align="center"><table
								width="100%" border="0" cellpadding="5" cellspacing="1"
								bgcolor="#A5C1D7">
								<tr>
									<td height="27" background="images/message_bg2.gif"><p
											style="margin-left: 35px">
											<strong><font color="#ffffff">详情</font> </strong>
									</td>
								</tr>
								<tr>
									<td bgcolor="#FFFFFF"><table border="0" cellpadding="0"
											cellspacing="5" width="630" bgcolor="#EEEEEE">
											<tr>
												<td align="center" bgcolor="#EEEEEE"><table border="0"
														cellpadding="0" cellspacing="0" width="100%"
														background="img/pattern.gif"
														style="border: 1px solid #C0C0C0">

														<tr>
															<td align=middle width=100 height=30>章节</td>
															<td height=30>${jxnr.zj }</td>

														</tr>
														<tr>
															<td align=middle width=100 height=30>内容</td>
															<td height=30>${jxnr.nr }</td>

														</tr>
														<tr>
															<td align=middle width=100 height=30>备注</td>
															<td height=30>${jxnr.bz }</td>

														</tr>


														<tr>
															<td height="30" align="right" width="100"></td>
															<td height="30" width="525">&nbsp;</td>
														</tr>


													</table>
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table></td>
		</tr>
	</table>
</div><jsp:include page="bottom.jsp" />
</html>
