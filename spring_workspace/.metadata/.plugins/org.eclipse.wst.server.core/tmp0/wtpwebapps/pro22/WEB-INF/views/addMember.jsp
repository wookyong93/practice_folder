<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<c:set var="result" value="${result}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
alert('가입을 축하드립니다.');
location.href="${contextPath}/member/listMembers.do";
</script>
</head>
<body>
	<c:if test="${result == 1 }">
		<script>
	alert('가입을 축하드립니다.');
	location.href="${contextPath}/member/listMembers.do";
	</script>
	</c:if>
	<c:if test="${result != 1 }">
	<script>
		alert('중복된 ID 가 있습니다.');
		location.href="${contextPath}/member/listMembers.do";
	</script>
	</c:if>
</body>
</html>