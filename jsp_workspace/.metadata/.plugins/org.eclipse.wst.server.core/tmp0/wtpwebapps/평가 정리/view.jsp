<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,member.*,board.*"
    isELIgnored="false"
    %>
    <jsp:useBean id="bDao" class="board.BoardDAO"/>
    <jsp:useBean id="bDto" class="board.BoardDTO"/>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%request.setCharacterEncoding("UTF-8");
    	int articleNO = Integer.parseInt(request.getParameter("articleNO"));
    	bDto = bDao.selectArticleNO(articleNO);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글</title>
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
<script>
	function idCheck(){
		var loginId = '${loginID}';
		var writeId = '<%=bDto.getId()%>';
		if(loginId==writeId || loginId=='admin'){
			var check =confirm("삭제하시겠습니까?")
			if(check==true){
				alert('삭제 됩니다.');
			location.href="boardMain.jsp?command=delete&articleNO=<%=bDto.getArticleNO()%>";
			}else{
				alert('삭제를 취소하였습니다.')
			}
			}else{
			alert('삭제는 관리자 및 작성자만 가능합니다.');
		}
	}
	function modify(){
		var loginId='${loginID}';
		var writeId='<%=bDto.getId()%>';
		if(loginId==writeId){
			var check=confirm("수정하시겠습니까 ? ");
			if(check == true){
				location.href='modifyBoard.jsp?articleNO=<%=articleNO %>' ;
			}else{
				alert('수정이 취소되었습니다.');
			}
		}else{
			alert('작성자만 수정이 가능합니다.');
		}
	}
</script>
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
	<tr>
		<td><%=bDto.getArticleNO() %></td>
		<td><%=bDto.getTitle() %></td>
		<td><%=bDto.getId() %></td>
		<td><%=bDto.getWriteDate() %></td>
	</tr>
	<tr>
		<td colspan ="4">
			<%=bDto.getContent() %>
		</td>
	</tr>
	</table>
	<br><br>
	<c:set var="write" value="<%=bDto.getId() %>"/>
	
	
	<c:if test="${(loginID == write) || (loginID=='admin')}">
		
			<c:if test="${loginID == write }">
			<input type="button" value="수정" onclick ="modify()"/>
		</c:if>
		
		<input type="button" value="삭제" onclick ="idCheck()"/>
	</c:if>
	
	<input type="button" value="목록" onclick="location.href='boardMain.jsp'"/>
</body>
</html>