<%@ page contentType="text/html; charset=gb2312" language="java"
	import="java.sql.*,com.wang.model.*" errorPage=""%>
<%@ page import="com.wang.util.*"%>
<%
	DBO db = new DBO();
	request.setCharacterEncoding("gb2312");
	ResultSet rs = null;
	String sql = "";
%>
<jsp:include page="top.jsp" />
<div align="center">
	<table width=980 border=0 cellpadding=0 cellspacing=0 bgcolor="#FFFFFF">
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
										class="nav"><b></b>
									</font> &nbsp;&nbsp;<font color="#ffffff">试卷信息</font>
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

												<th>试卷</th>
												<th>成绩</th>
												<th>时间</th>
												<th>操作</th>
											</tr>
											<%
												db.open();
												sql = "select a.*,b.shijuan from chengji a,shijuan b where 1=1 and a.sjid=b.sjid";
												Yonghu yh = (Yonghu) session.getAttribute("yh");
												
												sql += " and a.yh='" + yh.getYhid().toString() + "'";
												rs = db.query(sql);
												int i = 1;
												while (rs.next()) {
											%>
											<tr>
												<td class="list_data_text"><div align="center"><%=i%></div>
												</td>

												<td class="list_data_text"><div align="center"><%=rs.getString("shijuan")%></div>
												</td>
												<td class="list_data_text"><div align="center"><%=rs.getString("cj")%></div>
												</td>
												<td class="list_data_text"><div align="center"><%=rs.getString("sj")%></div>
												</td>
												<td><div align="center">
														<a
															href="onedati.jsp?keyid=<%=rs.getString("sjid")%>&sj=<%=rs.getString("sj")%>">答题</a>
													</div>
												</td>
											</tr>
											<%
												i++;
												}
											%>
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