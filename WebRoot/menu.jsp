<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>
<%
	request.setCharacterEncoding("gb2312");
	String qx = "";
	if (session.getAttribute("qx") != null) {
		qx = (String) session.getAttribute("qx");
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link href="css/css_menu.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<title>无标题文档</title>

<script language="javascript">
	function getObject(objectId) {
		if (document.getElementById && document.getElementById(objectId)) {
			// W3C DOM
			return document.getElementById(objectId);
		} else if (document.all && document.all(objectId)) {
			// MSIE 4 DOM
			return document.all(objectId);
		} else if (document.layers && document.layers[objectId]) {
			// NN 4 DOM.. note: this won't find nested layers
			return document.layers[objectId];
		} else {
			return false;
		}
	}

	function showHide(objname) {
		var obj = getObject(objname);
		if (obj.style.display == "none") {
			obj.style.display = "block";
		} else {
			obj.style.display = "none";
		}
	}
</script>
</head>
<base target="main" />
<body>
	<div class="infobox"></div>
	<div class="menu">
		<%
			
		%>
		<!-- Item 1 Strat -->
		<dl>

			<dt>
				<a href="###" onclick="showHide('items1');" target="_self">权限管理</a>
			</dt>
			<dd id="items1" style="display:none;">
				<ul>

					<li><a href='quanxian/quanxianadd.jsp' target='main'>添加权限</a>
					</li>
					<li><a href='quanxianSelectAllAction' target='main'>权限列表</a>
					</li>
				</ul>
			</dd>
		</dl>
		<!-- Item 1 End -->
		<!-- Item 1 Strat -->
		<dl>

			<dt>
				<a href="###" onclick="showHide('items2');" target="_self">用户管理</a>
			</dt>
			<dd id="items2" style="display:none;">
				<ul>

					<li><a href='yonghu/yonghuadd.jsp' target='main'>添加用户</a>
					</li>
					<li><a href='yonghuSelectAllAction' target='main'>用户列表</a>
					</li>
				</ul>
			</dd>
		</dl>
		<!-- Item 1 End -->
		<!-- Item 1 Strat -->
		<dl>

			<dt>
				<a href="###" onclick="showHide('items3');" target="_self">课程管理</a>
			</dt>
			<dd id="items3" style="display:none;">
				<ul>

					<li><a href='kecheng/kechengadd.jsp' target='main'>添加课程</a>
					</li>
					<li><a href='kechengSelectAllAction' target='main'>课程列表</a>
					</li>
				</ul>
			</dd>
		</dl>
		<!-- Item 1 End -->
		<!-- Item 1 Strat -->
		<dl>

			<dt>
				<a href="###" onclick="showHide('items4');" target="_self">教学内容管理</a>
			</dt>
			<dd id="items4" style="display:none;">
				<ul>

					<li><a href='jxnr/jxnradd.jsp' target='main'>添加教学内容</a>
					</li>
					<li><a href='jxnrSelectAllAction' target='main'>教学内容列表</a>
					</li>
				</ul>
			</dd>
		</dl>
		<!-- Item 1 End -->

		<!-- Item 1 Strat -->
		<dl>

			<dt>
				<a href="###" onclick="showHide('items7');" target="_self">试题管理</a>
			</dt>
			<dd id="items7" style="display:none;">
				<ul>

					<li><a href='shiti/shitiadd.jsp' target='main'>添加试题</a>
					</li>
					<li><a href='shitiSelectAllAction' target='main'>试题列表</a>
					</li>
				</ul>
			</dd>
		</dl>
		<!-- Item 1 End -->
		<!-- Item 1 Strat -->
		<dl>

			<dt>
				<a href="###" onclick="showHide('items8');" target="_self">试卷管理</a>
			</dt>
			<dd id="items8" style="display:none;">
				<ul>

					<li><a href='shijuan/shijuanadd.jsp' target='main'>添加试卷</a>
					</li>
					<li><a href='shijuanSelectAllAction' target='main'>试卷列表</a>
					</li>
				</ul>
			</dd>
		</dl>
		<!-- Item 1 End -->
		<!-- Item 1 Strat -->
		<dl>

			<dt>
				<a href="###" onclick="showHide('items9');" target="_self">卷管理</a>
			</dt>
			<dd id="items9" style="display:none;">
				<ul>

					<li><a href='juan/juanadd.jsp' target='main'>添加卷</a>
					</li>
					<li><a href='juanSelectAllAction' target='main'>卷列表</a>
					</li>
				</ul>
			</dd>
		</dl>
		<!-- Item 1 End -->
		<!-- Item 1 Strat -->
		<dl>

			<dt>
				<a href="###" onclick="showHide('items10');" target="_self">成绩管理</a>
			</dt>
			<dd id="items10" style="display:none;">
				<ul>


					<li><a href='chengjiSelectAllAction' target='main'>成绩列表</a>
					</li>
				</ul>
			</dd>
		</dl>
		<!-- Item 1 End -->
		<!-- Item 1 Strat -->
		<dl>

			<dt>
				<a href="###" onclick="showHide('items11');" target="_self">答题管理</a>
			</dt>
			<dd id="items11" style="display:none;">
				<ul>


					<li><a href='datiSelectAllAction' target='main'>答题列表</a>
					</li>
				</ul>
			</dd>
		</dl>
		<!-- Item 1 End -->
		<!-- Item 1 Strat -->
		<dl>

			<dt>
				<a href="###" onclick="showHide('items12');" target="_self">公告管理</a>
			</dt>
			<dd id="items12" style="display:none;">
				<ul>

					<li><a href='gonggao/gonggaoadd.jsp' target='main'>添加公告</a>
					</li>
					<li><a href='gonggaoSelectAllAction' target='main'>公告列表</a>
					</li>
				</ul>
			</dd>
		</dl>
		<!-- Item 1 End -->
	</div>
</body>
</html>
