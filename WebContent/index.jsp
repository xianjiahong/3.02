<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>姓名</th>
			<th>学号</th>
			<th>性别</th>
			<th>年龄</th>
		</tr>
		<c:forEach var="s" items="${list }">
		<tr>
			<td>${s.name }</td>
			<td>${s.sno }</td>
			<td>${s.sex }</td>
			<td>${s.age}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>