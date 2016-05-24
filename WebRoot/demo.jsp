<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">

<title>百融api后台管理</title>
<!--icheck-->

<!--dashboard calendar-->
<link rel="stylesheet" type="text/css" href="css/reset.css" />
<link rel="stylesheet" type="text/css" href="css/index.css" />
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

<body style="font-family: '微软雅黑';">
	<div class="clearfix">
		<div class="left-side">

			<div class="op">
				<span>管理系统</span>
			</div>
			<div class="nav">
				<
				<!-- dl>

					<dt>
						<a  onclick="showHide('items1');" target="_self"><span>商户中心</span></a>
					</dt>
					<dd id="items1" style="display:none;">
						<ul>

							<li><a href='quanxian/quanxianadd.jsp' target='main'>添加权限</a>
							</li>
							<li><a href='quanxianSelectAllAction' target='main'>权限列表</a>
							</li>
						</ul>
					</dd>
				</dl> -->
				<li class="menu" id="2" onclick="showHide('items1');" target="_self"><span>商户中心</span>
					<i>+</i>
					<ul class="dis-none" id="items1" style="display:none;">
						<li><span>商品维护</span>
						</li>
						<li><span>商品维护</span>
						</li>
						<li><span>商品维护</span>
						</li>
					</ul></li>
				<li class="menu" id="3"><span>商户中心</span> 
					<ul class="dis-none">
						<li><span>商品维护</span>
						</li>
						<li><span>商品维护</span>
						</li>
						<li><span>商品维护</span>
						</li>
					</ul></li>

				</ul>




			</div>

		</div>
		<div class="right clearfix">
			<div class="header">
				<div class="uname">
					<span>无名氏</span> <i class="icon"></i>
					<div class="login-out dis-none" id="l_out">登出</div>
				</div>

			</div>
			<div class="title">
				<span>日志查询&nbsp;</span> <i>/</i> <em>&nbsp;xxx日志查询</em>
			</div>
			<div class="content dis-none" id="111">
				<div class="search">
					<input class="ser" type="text" name="" id="" value=""
						placeholder="地对地导弹" /> <input class="btn" type="button" name=""
						id="" value="搜索" style="border: 1px solid gainsboro;" />
				</div>
				<div>
					<table width="80%" border="1" cellspacing="50%" cellpadding="80">
						<tr class="tr">
							<th>Header</th>
							<th>Header</th>
							<th>Header</th>
							<th>Header</th>
						</tr>
						<tr class="tr">
							<td style="font-weight: none;">Data</td>
							<td>Data</td>
							<td>Data</td>
							<td>Data</td>
						</tr>
					</table>
				</div>

			</div>
			<div class="content dis-none" id="112"></div>
		</div>
		<div class="footer"></div>



	</div>
	<script src="js/jquery.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="js/index1.js">
		
	</script>
</body>
</html>
