<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,ex01.*"
    isELIgnored="false"
    %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:useBean id="dao" class="ex01.BoardDAO"/>
    <jsp:useBean id="dto" class="ex01.BoardDTO"/>
    <% String id = request.getParameter("id");
    	String id_=(String)session.getAttribute("id_");
    	int no = Integer.parseInt(request.getParameter("no"));
    %>
    <c:set var="id" value="<%=id %>"/>
    <c:set var="id_" value="<%=id_ %>"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${id==id_||id=='admin' }">
	<%
		dao.viewDel(no);
	%>
	<script>alert('글이 삭제되었습니다.'); location.href="boardMain.jsp";</script>
</c:if>
<c:if test="${id!=id_&&id!='admin' }">
	<script>alert('글삭제는 관리자와 작성자만 가능합니다.'); location.href="boardMain.jsp";</script>
</c:if>
</body>
</html>