<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="java.util.*,java.sql.*,member.*,board.*"
    isELIgnored="false"
    %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:useBean id="bDao" class="board.BoardDAO"/>
    <jsp:useBean id="bDto" class="board.BoardDTO"/>
    <jsp:setProperty name="bDto" property="*"/>
    <%
    	request.setCharacterEncoding("UTF-8");
    	
    	
    	String command = request.getParameter("command");
    	if(command==null){
    		System.out.print("아무기능없음");
    	}else if(command.equals("write")){
    		System.out.print("글쓰기 실행");
    		bDto.setId((String)session.getAttribute("loginID")); 
    		bDao.write(bDto);
    		response.sendRedirect("boardMain.jsp");
    	}else if(command.equals("delete")){
    		int articleNo = Integer.parseInt(request.getParameter("articleNO"));
    		boolean result = bDao.deleteArticle(articleNo);
    		response.sendRedirect("boardMain.jsp");
    		
    	}else if(command.equals("modify")){
    		int articleNo = Integer.parseInt(request.getParameter("articleNo"));
    		bDto.setArticleNO(articleNo);
    		bDao.modify(bDto);
    	}
    	List<BoardDTO> articleList = bDao.aticleList();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<style>
	table{
		margin:auto;
		text-align: center;
		border-collapse: collapse;
	}
	th,td{
		border:1px solid black;
	}
	body{
		text-align:center;
	}
</style>
</head>
<body>
	<c:if test="${empty loginID}">
		<script>
		alert('로그인이 되어있지 않습니다. 로그인해주세요');
		location.href="login.jsp";
		</script>
	</c:if>
	<span>${loginID}님 환영합니다.</span>
	<a href="logout.jsp">로그아웃</a>
	<br><br>
	<table>
	<tr>
		<th width="15%">글번호</th>
		<th width="40%">제목</th>
		<th width="15%">작성자</th>
		<th width="15%">작성일</th>
	<tr>
	<c:forEach var="list" items="<%=articleList %>">
	<tr>
		<td>${list.articleNO}</td>
		<td><a href="view.jsp?articleNO=${list.articleNO}">${list.title}</a></td>
		<td>${list.id}</td>
		<td>${list.writeDate}</td>
	</tr>
	</c:forEach>
	</table>
	<br><br>
	<a href="writeForm.jsp"><input type="button" value="글 쓰기"></a>
</body>
</html>