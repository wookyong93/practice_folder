<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <c:set var = "loginID" value="${loginID}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test_blog</title>
<script>
	function fn_login(){
		location.href="login.jsp";
	}
	window.onload=function(){
		action="list";
		submit();
	}
</script>
</head>
<body>
	<header>
		<h1>BLog Header입니다.</h1>
	</header>
	<aside>
		<c:if test="${loginID.equals('admin')}">
		<button onclick="location.href='wrtie.jsp'">글작성하기</button>
		</c:if>
		<button>최신 글 보러가기</button>
	</aside>
	<nav>
		<c:if test="${loginID == null }">
			<button onclick="fn_login()">Login</button>||<button>메인화면</button>
		</c:if>
		<c:if test="${loginID != null }">
			<button onclick="fn_login()">Logout</button>||<button>메인화면</button>
		</c:if>
	</nav>
	<section>
		<article>
			<c:choose>
				<c:when test="${list != null}">
					<c:forEach var="blog" itmes="${conlist}">
						${blog.articleNO}
						${blog.title}
						${blog.content}
						${blog.id}
						${blog.writeDate}
						
					</c:forEach>
				</c:when>
			</c:choose>
		</article>
	</section>
	<footer>
		<h1>footer</h1>
	</footer>
</body>
</html>