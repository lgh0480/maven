<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일목록</title>

</head>
<body>
	<div>
		<div align="center">
			<h1>파일내용</h1>
			<table border="1">
				<c:forEach var="file" items="${files }">
		
					<tr>
						<th width="70" align="center">파일내용</th>
						<td width="300">
							<textarea rows="7" cols="100" id="subject" name="subject">
								${file.subject }
							</textarea>
						</td>
					</tr>
					
					<tr>
						<th width="70" align="center">파일 첨부</th>
						<td width="300" onclick="getNum('${file.num}')">
							${file.filename }<input type="hidden" value="${file.downfile }">						
						</td>
					</tr>
				</c:forEach>
			</table>	
		</div>
	</div><br/>
		<form id="frm" name="frm" action="fileDownLoad.do" method="post">
			<input type="hidden" id="num" name="num">
		</form>
<script type="text/javascript">
	function getNum(n){
		frm.num.value = n
		frm.submit();
	}
</script>	
</body>
</html>