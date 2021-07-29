<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<table border ="1">
			<tr>
				<th width="150">아이디</th>
				<th width="150">패스워드</th>
				<th width="150">이름</th>
				<th width="200">나이</th>
				<th width="200">취미</th>
				
			</tr>
			<c:forEach var="member" items="${members }">
				<tr>
					<td align="center">${member.id }</td>
					<td align="center">${member.password }</td>
					<td align="center">${member.name }</td>
					<td align="center">${member.age }</td>
					<td align="center">${member.hobby }</td>
				</tr>	
			</c:forEach>
			
		</table>
	</div>	
</body>
</html>