<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%
    	request.setCharacterEncoding("UTF-8");
    %>
    <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소록</title>
<style>
	.list {
		margin: o auto;
		text-align: center;
	}
</style>
</head>
<body>
	<div class="list">
	<table align="center" border="1"  width="80%">
		<tr align="center" bgcolor="lightgreen">
			<th width="15%">아이디</th><th width="30%">이름</th><th width="40%">연락처</th>
		</tr>
		<c:choose>
			<c:when test="${addressList.size() == 0 }">	
				<tr>
					<th colspan="3"><font size="20">등록된 주소 없음</font></th>
				</tr>
			</c:when>
			<c:when test="${addressList != null }">
				<c:forEach var="address" items="${addressList }">
				<tr>
					<td>${address.id }</td>
					<td><a href="${contextPath}/address/addressView.do?id=${address.id}">${address.name}</a></td>
					<td>${address.phone}</td>
				</tr>
				</c:forEach>
			</c:when>
		</c:choose>	
	</table>
	<br>
		<a href="${contextPath}/address/addressForm.do"> 주소 등록하기</a>
	</div>
</body>
</html>