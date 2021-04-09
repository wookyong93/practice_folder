<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=UTF-8");
    %>
    <c:set var="contextPath"  value="${pageContext.request.contextPath}"  /> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소 등록</title>
<style>
	input[type=text]{
		width: 90%;
		margin:2px;
		text-align: center;
	}
	
</style>
<script>
	function fn_process(){
		var frm = document.addressForm
		var name = frm.name;
		var age = frm.age;
		var phone = frm.phone;
		var address = frm.address;
		
		if(name.value=="" || name.length==0){
			alert('이름을 입력해주세요');
			name.focus();
		}else if(age.value=="" || age.length==0){
			alert('나이를 입력해주세요');
			age.focus();
		}else if(phone.value=="" || phone.length==0){
			alert('연락처를 입력해주세요');
			phone.focus();
		}else if(address.value=="" || address.length==0){
			alert('주소를 입력해주세요');
			address.focus();
		}else{
			frm.action = "${contextPath}/address/insertAddress.do";
			frm.method="post";
			frm.submit();
		}
	}
</script>
</head>
<body>
	<form name="addressForm">
		<table align="center" border="1" width="90%">
			<tr align="center" bgcolor="lightgreen">
				<th width="20%">이름</th><th width="10%">나이</th><th width="30%">연락처</th><th width="40%">주소</th>
			</tr>
			<tr align="center">
				<td><input type="text" name="name"/></td>
				<td><input type="text" name="age"/></td>
				<td><input type="text" name="phone"/></td>
				<td><input type="text" name="address"/></td>
			</tr>
			<tr>
			<td colspan="4" align="center">
			<input type="button" value="등록" onclick="fn_process()"/>
			 <input type="reset" value="초기화"/>
			 <input type="button" value="목록 이동" onclick="location.href='${contextPath}/address/addressList.do'"/>
		</table>
	
	</form>
</body>
</html>