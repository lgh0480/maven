<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>layout영역</title>

</head>
<body>
<div align="center">
	<table border="1">
		<tr>
			<td colspan="2"><tiles:insertAttribute name="header" /></td>
		</tr>
		<tr>
			<td><tiles:insertAttribute name="sidebar" /></td>
			<td><tiles:insertAttribute name="body" /></td>
		</tr>
		<tr>
			<td colspan="2"><tiles:insertAttribute name="footer" /></td>
		</tr>
	</table>
</div>	
</body>
</html>