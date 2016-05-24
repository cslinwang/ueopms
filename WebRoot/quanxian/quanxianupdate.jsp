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

<title>My JSP 'quanxianupdate.jsp' starting page</title>

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
<script language="javascript">
	function checkDo() {
		if (form.qx.value == "") {
			alert("权限不能为空");
			return false;
			form.qx.focus();
		}

		form.action = "quanxianUpdateSuccessAction";
		form.submit();
	}
</script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>

<body>
	<form name="form" action="" method="post">
		<div class=formzone>
			<DIV class=searchzone>

				<TABLE height=30 cellSpacing=0 cellPadding=0 width="100%" border=0>
					<TBODY>
						<TR>
							<TD height=30>权限修改</TD>
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
							<td align=middle width=100 height=30>权限</td>
							<td height="30"><input type="text" class="input"
								style="FONT-SIZE: 12px; WIDTH: 300px" name=qx value="${quanxian.qx }">
							</td>
						</tr>

					</TBODY>
				</TABLE>
			</div>
			<input type="hidden" name="qxid" value="${quanxian.qxid }">
			<DIV class=adminsubmit>
				<input type="button" value="保存" name="B1" class="button"
					style="width:60px" onclick="checkDo()" /> &nbsp;&nbsp; <input
					type="reset" value="取消" style="width:60px" name="chanel"
					class="button" />
			</div>
		</div>
	</form>
</body>
</html>
