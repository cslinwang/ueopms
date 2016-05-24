<%@ page language="java" import="java.util.*,com.wang.model.Yonghu"
	pageEncoding="UTF-8"%>
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

<title>My JSP 'test.jsp' starting page</title>

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
				<td width=250 valign="top">

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
											class="nav"><b></b> </font> &nbsp;&nbsp;首页->试卷详情<font
											color="#ffffff">&nbsp;</font>
										</td>
										<td width="32%"></script></td>
									</tr>
								</table>
							</td>
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

															<form method="post" action="shijuancheck.jsp">
																<tr>
																	<th>试卷</th>
																	<td>${sj.shijuan }</td>
																</tr>
																<tr>
																	<th>内容</th>
																	<td>${sj.nr }</td>
																</tr>
																<tr>
																	<th>时间</th>
																	<td>${sj.sj } <br />
																		<hr></td>
																</tr>
																<tr>
																	<td height="30" align="right" width="100" colspan="2"
																		style="text-align: left;"><font size="39">试题</font>
																	</td>
																</tr>

																<tr>

																	<td height="30" width="525" colspan="2"><c:forEach
																			var="st" items="${stList }">
																			<%
																				int i = 1;
																			%> 
 
 																			第<%=i%>题，${st.st}<br />
 																			${st.ms }<br /> 
 																			回答
 																			 <c:if test="${st.lx=='填空' }">
																				<input type="text" name="hd${st.stid }">
																			</c:if>
																			<c:if test="${st.lx=='判断' }">
																				<select name="hd${st.stid }">
																					<option value="对">对</option>
																					<option value="错">错</option>
																				</select>
																			</c:if>
																			<c:if test="${st.lx=='选择' }">

																				<select name="hd${st.stid }">

																					<option value="A">A</option>

																					<option value="B">B</option>
																					<option value="C">C</option>

																					<option value="D">D</option>
																				</select>
																			</c:if>
																			<hr>
																			<%
																				i++;
																			%>
																		</c:forEach></td>

																</tr>
																<tr>

																	<td height="30" align="right">&nbsp;</td>
																	<td height="30"><input type="submit" name="Submit"
																		value="提交" /> <input type="reset" name="Submit2"
																		value="重置" /></td>
																</tr>
																<input type="hidden" name="yh" value="${yh.yhid }">
																<input type="hidden" name="sj" value="${sj.sjid }">
															</form>

														</table></td>
												</tr>
											</table>
										</td>
									</tr>
								</table></td>
						</tr>
					</table></td>
			</tr>
		</table>
	</div><jsp:include page="bottom.jsp" />
</body>
</html>
