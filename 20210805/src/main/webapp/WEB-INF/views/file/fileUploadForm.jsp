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
		<div>
		<h1>여기는 upload폼 영역</h1>
			<div>
				<form id="frm" name="frm" action="fileUpload.do" enctype="multipart/form-data" method="post">
					<div>
						<table border="1">
							<tr>
								<th width="100" align="center">내용</th>
								<td width="400">
									<textarea rows="7" cols="80" id="subject" name="subject"></textarea>
								</td>
							</tr>
							<tr>
								<th width="100">파일</th>
								<td width="400">
									<input type="file" id="fileName" name="fileName" size="60">
									
								</td>
							</tr>	
						</table>
					</div><br/>
					<div>
						<input type="submit" value="파일전송">
					</div>
				</form> 
			</div>		
		</div>
	</div>
</body>
</html>