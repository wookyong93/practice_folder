<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 주소창</title>
<style>
	#btn_modify{
		display: none;
	}
	input[type=text]{
		width: 90%;
		margin:2px;
		text-align: center
	}
</style>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
	function backToList(){
	    location.href="${contextPath}/address/addressList.do";
	 }
	function fn_update(){
		
		document.getElementById("name").disabled=false;
		document.getElementById("age").disabled=false;
		document.getElementById("phone").disabled=false;
		document.getElementById("address").disabled=false;
		document.getElementById("btn_modify").style.display ="block"
		document.getElementById("tr_btn").style.display="none";
	}
	function fn_modify(){
		var frm = document.frmView;
		frm.action="${contextPath}/address/modifyAddress.do";
		frm.method="POST"
		frm.submit();
	}
	function fn_delete(){
			var frm=document.frmView;
			var id = document.frmView.id.value;
			frm.action="${contextPath}/address/deleteAddress.do?id="+id;
			frm.submit();
	}
</script>
</head>
<body>
<form name="frmView">
	<table align="center" border="1" width="90%">
			<tr align="center" bgcolor="lightgreen">
				<th width="10%">ID</th><th width="20%">이름</th><th width="10%">나이</th><th width="30%">연락처</th><th width="40%">주소</th>
			</tr>
			<c:forEach var = "addressView" items="${addressView}">
			<tr align="center">
				<td><input type="text" name="id_" value="${addressView.id}"  readonly="readonly"/>
					<input type="hidden" name="id" value="${addressView.id}" />
				</td>
				<td><input type="text" name="name" value="${addressView.name}" id="name" disabled/></td>
				<td><input type="text" name="age" value="${addressView.age}" id="age"disabled/></td>
				<td><input type="text" name="phone"value="${addressView.phone}" id ="phone"disabled/></td>
				<td><input type="text" name="address" value="${addressView.address}" id="address"disabled/></td>
			</tr>
			</c:forEach>
			<tr id="btn_modify">
				<td  colspan="5" align="center">
					 <input type="button" value="수정적용" onclick="fn_modify()"/>
					 <input type="button" value="취소" onclick="backToList()"/>
			 	</td>
			 </tr>
			<tr id="tr_btn">
			<td colspan="5" align="center">
			<input type="button" value="수정" onclick="fn_update()"/>
			 <input type="reset" value="삭제" onclick="fn_delete()"/>
			 <input type="button" value="목록 이동" onclick="backToList()"/>
			 </td>
			 </tr>
		</table>
</form>
</body>
</html>