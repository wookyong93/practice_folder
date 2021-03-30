<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="ex01.*"
    isELIgnored="false"
    %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <jsp:useBean id="dao" class="ex01.ExMemberDAO"/>
    
    <%
  		request.setCharacterEncoding("UTF-8");
    	String id_ = request.getParameter("user_id");
    	boolean result = dao.idChk(id_);
    %>
    <c:set var= "result" value="<%=result %>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<c:if test="${result == false}">
	<script>alert('가입가능한 아이디 입니다.');location.href="memberForm.jsp?id_='<%=id_ %>'"</script>
	</c:if>
	<c:if test="${result == true}">
	<script>alert('중복된 ID가 있습니다.');location.href='memberForm.jsp'</script>
	</c:if>
</body>
</html>