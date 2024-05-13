<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
<link rel="stylesheet" href="css/employees.css">
<script type="text/javascript" src="script/employees.js"></script>
</head>
<body>
	<div id="wrap">
		<h1>게시글 등록</h1>
		<form action="EmployeesServlet" name="frm" method="post">
			<input type="hidden" name="command" value="employees_write">
			<table>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id" required>필수</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="text" name="pass" required> <!-- autocomplete(자동완성) "current-password" (안쓸때 off) -->
						*필수(게시물 수정,삭제 시 필요합니다.)</td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" required>필수</td>
				</tr>
				<tr>
					<th>권한</th>
					<td><select name="lev">
						<option value="A">운영자</option>
						<option value="B">일반인</option>
						</select>
						* 필수</td>
				</tr>
				<tr>
					<th>성별</th>
					<td><select name="gender">
						<option value="1">남자</option>
						<option value="2">여자</option>
						</select>
						* 필수</td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="phone" name="phone"></td>
				</tr>
			</table>
			<br><br>
			<input type="submit" value="등록" onclick="return employeesCheck()">
		<input type="reset" value="다시작성">
		<input type="button" value="목록" onclick="location.href='EmployeesServlet?command=employees_list'">
		</form>
	</div>
</body>
</html>