<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$.ajax({
			url : '/AjaxTest/MemberListServlet.do', //요청페이지
			dataType: 'json',
			success:function(result){
				memberList(result);
				console.log(result);
				
			},
			error : function(reject) {
				console.log(reject);
			},
		});
	

		function memberList(data){
			for(let i=0; i<data.length; i++){
					console.log(data.length);
				let tr = $('<tr />').attr('id', data.id);
				for(let field of data){
					let id = $('<td />').text(field.id);
					let name = $('<td />').text(field.name);
					let phone = $('<td />').text(field.phone);
					let addr = $('<td />').text(field.addr);
					let birth = $('<td />').text(field.birth);
					
					$(tr).append(id, name, phone, addr, birth);				
					$('#emplist').append(tr);
				}
			}
		}
	//등록 부분 	
	$('#insert').click(function(event){
		event.preventDefault();
		let str = $('#frm').serialize();
		$.ajax({
			type: 'POST',
			url : 'MemberInsertServlet.do',
			data : str,
			dataType: 'json',
			success: function(data) {
				console.log(data);
				$('#id').val('');
				$('#name').val('');
				$('#phone').val('');
				$('#addr').val('');
				$('#birth').val('');	
			},
			error: function(suject){
				console.log(suject);
			}
		});
	});
});	
</script>
</head>
<body>
	
	<div align="center">
		<form id="frm" name="frm" >
		<table border="1">
			<tr>
				<th>아이디(이메일)</th>
				<td><input type="text" id="id" name="id"></td>
			</tr>
			<tr>
				<th>회원이름</th>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<th>연락처</th>
				<td><input type="text" id="phone" name="phone"></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" id="addr"name="addr"></td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td><input type="date" id="birth"name="birth"></td>
			</tr>
			
		</table>
			<div >
				<button id="insert">등록</button>
			</div>
		</form>
		<br>
		
		<div align="center">
			
			<table border="1">
				<thead>
					<tr>
						<th>아이디</th>
						<th>이름</th>
						<th>전화번호</th>
						<th>주소</th>
						<th>생년월일</th>
					</tr>
				</thead>
				<tbody id="emplist">
				</tbody>
			</table>
		</div>
	</div>
	
</body>
</html>