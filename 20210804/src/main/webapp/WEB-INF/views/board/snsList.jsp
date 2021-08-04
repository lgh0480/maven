<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>게시글 목록</h1>
		<div>
			<c:forEach var="sns" items="${snsList }">
				<div onclick="getId('${sns.SNo }')">
					제목 ${sns.STitle } : ${sns.SWriter }
					 
				</div>
				 <br/>
			</c:forEach>
			<form name="frm" id="frm" action="snsSelect.do">
				<input type="hidden" id="sno" name="sno">
			</form>
		</div>
	</div>
	<script>
		function getId(n){
			frm.sno.value = n;
			frm.submit();
		}
	</script>
</body>
</html>