<%@ page contentType="text/html; charset=gb2312" language="java"
	import="java.sql.*" errorPage=""%>
<%@ page import="com.wang.util.*"%>
<%
	request.setCharacterEncoding("gb2312");//设置页面字符集
	DBO db = new DBO();//初始数据链接
	/*
	 课程信息添加页面
	 */
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<LINK href="../images/style.css" type=text/css rel=stylesheet>
<link rel="stylesheet" type="text/css" media="screen"
	href="../css/tinyTips.css" />

<script language="javascript">
	function checkDo() {
		if (form.kc.value == "") {
			alert("课程不能为空");
			return false;
			form.kc.focus();
		}

		if (form.jxnr.value == "") {
			alert("教学内容不能为空");
			return false;
			form.jxnr.focus();
		}

		if (form.tp.value == "") {
			alert("图片不能为空");
			return false;
			form.tp.focus();
		}

		if (form.js.value == "") {
			alert("介绍不能为空");
			return false;
			form.js.focus();
		}

		form.action = "kechengdo.jsp";
		form.submit();
	}
</script>

</head>
<body>
	<form name="form" action="" method="post">
		<div class=formzone>
			<DIV class=searchzone>

				<TABLE height=30 cellSpacing=0 cellPadding=0 width="100%" border=0>
					<TBODY>
						<TR>
							<TD height=30>课程添加</TD>
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
							<td align=middle width=100 height=30>课程</td>
							<td height=30><input type="text" class="input"
								style="FONT-SIZE: 12px; WIDTH: 300px" name="kc" value="">
							</td>
						</tr>
						<tr>
							<td align=middle width=100 height=30>教学内容</td>
							<td height=30><textarea name="jxnr" cols="80" rows="5"></textarea>
							</td>
						</tr>
						<tr>
							<td align=middle width=100 height=30>图片</td>
							<td height=30><input type="text" class="input"
								style="FONT-SIZE: 12px; WIDTH: 300px" name="tp" value="">
							<iframe id="ifr" name="ifr" width="400" height="40"
									frameborder="no" scrolling="no" src="fileupload.jsp?kname=tp"></iframe>
							</td>
						</tr>
						<tr>
							<td align=middle width=100 height=30>介绍</td>
							<td height=30><textarea name="js" cols="80" rows="5"></textarea>
							</td>
						</tr>

					</TBODY>
				</TABLE>
			</div>
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
