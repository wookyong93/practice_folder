<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,ex01.*"
    isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:useBean id="Bdto" class="ex01.BoardDTO"/>
    <jsp:useBean id="Bdao" class="ex01.BoardDAO"/> 
    <%request.setCharacterEncoding("UTF-8");
    String id=request.getParameter("id");
    int no = Integer.parseInt(request.getParameter("no"));
    List view = Bdao.viewBoard(no);
    %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 게 시 글 </title>

</head>
<body>
	<table align="center" width="800" border="1">
	<c:forEach var="view" items="<%=view %>">
	<tr align="center">
		<th width="10%">글 번호</th>
		<th width="60%">글 제목</th>
		<th width="10%">작성자 ID</th>
		<th width="10%">작성일</th>
	</tr>
	<tr align="center">
		<th>${view.articleNO}</th>
		<th>${view.title}</th>
		<th>${view.id}</th>
		<th>${view.writeDate}</th>
	</tr>
	<tr align="center">
		<th colspan="4">글 내 용</th>
	</tr>
	<tr align="left-top">
		<td colspan="4" width="80%" height="400">${view.content}</td>
	</tr>
	<tr align="left">
		<td colspan="4" width="80%">이미지파일 : ${view.imageFileName}
		
		</td>
	</tr>
	</c:forEach>
	</table>
	<form align="center"> <input type="button" value="삭제" 
	onclick="fn_del();"/> 
	<input type="button" value="돌아가기" onclick="location.href='boardMain.jsp'"/> </form>
	<script>
function fn_del(){
	location.href= "viewDel.jsp?no=<%=no %>&id=<%=id%>";
}
</script>
</body>
</html>