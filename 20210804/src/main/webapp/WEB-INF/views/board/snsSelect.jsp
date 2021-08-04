<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>글 상세보기</h1>
		<div>
			글제목 : ${snsDetail[0].STitle }, 작성자: ${snsDetail[0].SWriter }<br>
			글내용 : ${snsDetail[0].SContents } 			
		</div>
		<hr>
		<div>
			<h1>댓글</h1>
			<table border="1">
				<tr>	
					<th>댓글작성자</th>
					<td>${snsDetail[0].CName }</td>
				</tr>
				<tr>	
					<th>댓글내용</th>
					<td>${snsDetail[0].CSubject }</td>
				</tr>
				<tr>	
					<th>댓글 작성자 아이디</th>
					<td>${snsDetail[0].CId }</td>
				</tr>	
				</tr>
			</table>
		</div>
	</div>
</body>
</html>