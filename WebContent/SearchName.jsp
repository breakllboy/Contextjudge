<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import ="dao.student"%>  
<%@ page import ="dao.AddMessageDao"%>  
<%@ page import ="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="K_qmx/bootstrap-3.3.7/css/bootstrap.min.css">
<script src="K_qmx/bootstrap-3.3.7/js/jquery.min.js"></script>
<script src="K_qmx/bootstrap-3.3.7/css/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="K_qmx/csses/search.css">
<title>修改学生信息</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="box">
			<div class="box-header">
				<h4 class="box-title">
					修改学生信息
				</h4>
				<form action="SearchName" method="post">	
               <!-- Servlet名字为SearchName --> 请输入学号：
               <input type="text" name="xuehao" > 
               <input type="submit" value="查询" /> 
               </form>
			</div>
			<div class="box-body">
				<div class="table-responsive">
					<table class="table table-hover mb-5">
					<thead>
						<tr>
							<th>序号</th>
							<th>姓名</th>
							<th>性别</th>
							<th>学号</th>
							<th>电话</th>
							<th>专业</th>
							<th>组别</th>
							<th>其他操作</th>
						</tr>
					</thead>
					<tbody>
					<%
			//新建一个AddMessageBean类的列表，名字为SearchName
			//getAttribute：将SearchName信息的值给SearchName
			List<student> SearchName=(List<student>)request.getAttribute("SearchName");
			if(SearchName!=null&&!SearchName.isEmpty()){
			for(student times : SearchName){
			%>
						<tr>
						<td><%=times.getId()%></td>
						<td><%=times.getName() %></td>
						<td><%=times.getSex() %></td>
						<td><%=times.getXuehao() %></td>
						<td><%=times.getPhone() %></td>
						<td><%=times.getXueyuan() %></td>
						<td><%=times.getMajor() %></td>
						<td><%=times.getZubie() %></td>
					    <td><a href="Update?userN=<%=times.getId()%>" class="btn1 btn-primary ll">修改</a>
			            </td>
			            <%
				}
				}
			%>
						</tr>
					</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>