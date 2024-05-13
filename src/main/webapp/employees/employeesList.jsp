<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<link rel="stylesheet" type="text/css" href="css/employees.css">
</head>
<body>
	<div id="wrap">
		<h1>게시판 목록</h1>
		<table class="list">
			<tr>
				<td colspan="5" class="td1">
				<a href="EmployeesServlet?command=employees_write_form">정보 등록</a></td>
			</tr>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>권한</th>
				<th>성별</th>
				<th>전화번호</th>
			</tr>
			<c:forEach var="employees" items="${employeesList}">
				<tr>
					<td><a href="EmployeesServlet?command=employees_view&id=${employees.id}">${employees.id}</a></td>
					<td>${employees.name}</td>
					<td>${employees.lev}</td>
					<td>${employees.gender}</td>
					<td>${employees.phone}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>