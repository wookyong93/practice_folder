<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,java.sql.*,ex01.*"
    isELIgnored="false"%>
    <jsp:useBean id="Bdao" class="ex01.BoardDAO"/>
    <jsp:useBean id="Bdto" class="ex01.BoardDTO"/>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
  		request.setCharacterEncoding("UTF-8");
    	List list=Bdao.boardList(Bdto);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<script>

</script>
</head>
<body>
<form name="frmBoard" style="text-align:center">
 <h1 >회 원 게 시 판</h1>
<table align="center" width = "800" border="1">
	<tr align="center">
		<th width="10%">글번호</th><th width="70%">글 제목</th><th width="10%">작성자 ID </th><th width="10">작성일</th>
	</tr>
	
	<c:forEach var="bList" items="<%=list %>">
	
	<tr align="center">
		<th>${bList.articleNO}</th>
		<td><a href="boardView.jsp?no=${bList.articleNO}&title=${bList.title}&id=${bList.id}" 
		style="text-decoration: none;">${bList.title}</a></td>
		<td>${bList.id}</td>
		<td>${bList.writeDate}</td>
	</tr>
	
	</c:forEach>
</table>
<br><br>
<input type="button" value="글쓰기" onclick="location.href='addView.jsp'"/>
</form>

</body>
</html>