<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/employees.css">
<script type="text/javascript" src="script/employees.js"></script>
</head>
<body>
<div id="wrap">
	<h1>게시글 상세보기</h1>
		<table>
			<tr>
				<th>아이디</th>
				<td>${employees.id}</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>${employees.pass}</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${employees.name}</td>
			</tr>
			<tr>
				<th>권한</th>
				<td>${employees.lev eq 'A' ? '관리자' : '일반인'}</td>
			</tr>
			<tr>
				<th>성별</th>
				<td>${employees.gender eq '1' ? '남자' : '여자'}</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td>${employees.phone}</td>
			</tr>
			<tr>
				<th>가입일</th>
				<td>${employees.enter}"</td>
			</tr>
		</table>
		<br><br>
		<input type="button" value="수정" onclick="open_win('EmployeesServlet?command=employees_check_pass_form&id=${employees.id}','update')">
		<input type="button" value="삭제" onclick="open_win('EmployeesServlet?command=employees_check_pass_form&id=${employees.id}','delete')">
		<input type="button" value="목록" onclick="location.href='EmployeesServlet?command=employees_list'">
		<input type="button" value="등록" onclick="location.href = 'EmployeesServlet?command=employees_write_form'">
	</div>
</body>
</html>