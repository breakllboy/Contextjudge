<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
      //获取绝对路径路径 
      String path = request.getContextPath();
      String basePath = request.getScheme() + "://"
                  + request.getServerName() + ":" + request.getServerPort()
                  + path + "/";
 %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath %>" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="icon" type="imges/x-icon" href="K_qmx/img/logo.png">
	<title>启明星</title>
	<link rel="stylesheet" type="text/css" href="K_qmx/bootstrap-3.3.7/css/bootstrap.min.css">
	<script src="K_qmx/bootstrap-3.3.7/js/jquery.min.js"></script>
	<script src="K_qmx/bootstrap-3.3.7/css/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="K_qmx/csses/qmx.css">
	<link rel="stylesheet" type="text/css" href="K_qmx/csses/hd.css">
</head>
<body>
	<div class="count-agileits" id="stats">
		<div class="box" style="top:20px;">
			<form role="form" action="<%= request.getContextPath() %>/Update" method="post" id="form1">
				<h2>修改信息</h2>
				<input type="hidden" class="form-control" id="id"  name="id" value="${student.id}">
				<div class="form-group">
					<label>姓名：</label>
					<input type="text" class="form-control" name="name" id="name" value="${student.name}">
					<div id="namesId"></div>
				</div>
			    <div class="form-group">
					<label>性别：</label>
					<input type="text" class="form-control radio-inline" name="sex" id = "sex" value="${student.sex}">
				</div>
				<div class="form-group">
					<label>学号：</label>
					<input type="text" class="form-control " name="xuehao" id="xuehao" value="${student.xuehao}">
					<div id="xuehaoId"></div>
				</div>			
				<div class="form-group">
					<label>联系电话：</label>
					<input type="text" class="form-control " name="phone" id="phone" value="${student.phone}">
					<div id="dianhuaId"></div>
				</div>
				<div class="form-group">
					<label>学院：</label>
					<input type="text" class="form-control " name="xueyuan" id="xueyuan" value="${student.xueyuan}">
					<div id="xueyuanId"></div>
				</div>
				
				<div class="form-group">
					<label>专业：</label>
					<input type="text" class="form-control " name="major" id="zhuanye" value="${student.major}">
					<div id="zhuanyeId"></div>
				</div>
				<div class="form-group">
					<label>选择组别：</label>
					<input type="text" class="form-control radio-inline" name="zubie" id = "zubie" value="${student.zubie}">
				</div>
				<input class="btn1 btn-primary" type="submit" value="确定修改"/>
			</form>
		</div>
	</div>
</body>
</html>