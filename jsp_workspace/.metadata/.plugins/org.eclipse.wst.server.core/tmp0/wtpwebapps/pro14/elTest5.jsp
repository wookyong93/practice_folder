<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <jsp:useBean id="m1" class="sec01.ex01.MemberBean" scope="page"/>
   	<jsp:setProperty name="m1" property="name" value="이순신"/>
   	<jsp:useBean id="m2" class="java.util.ArrayList" scope="page"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현언어의 여러 가지 연산자들 </title>
</head>
<body>
	empty 연산자
	<h2>
	\${empty m1} : ${empty m1} <br>
	<%-- m1에 이순신 이란 값을 넣엇으므로 false --%>
	\${not empty m1} : ${not empty m1} <br><br>
	<%--m1에 이순신 이란 값이 있으므로 true --%>
	
	\${empty m2} : ${empty m2} <br>
	<%-- m2의 설정값이 없으므로 true --%>
	\${not empty m2} : ${not empty m2} <br><br>
	<%--m2의 설정 값이 없으므로 false --%>
	
	\${empty "hello"} : ${empty "hello"} <br>
	<%--"hello"라는 문자열의 값에 false --%>
	\${empty null} : ${empty null} <br>
	<%--값이 null 이면 값이 없으므로 true --%>
	\${empty ""} : ${empty ""} <br>
	<%--값이 없으므로 true --%>
	
	
	</h2>

</body>
</html>