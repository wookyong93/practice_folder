<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현언어의 여러가지 연산자들</title>
</head>
<body>
<h2>여러 가지 산술 연산자</h2>
<h1>
\${10+10} : ${10+10}<br>
\${20-10} : ${20-10}<br>
\${10*10} : ${10*10}<br>
\${100/9} : ${100/9}<br>
<%-- \${100div9} : ${100div9}<br> 
나누기는 div 로 표현할 수도 있다.--%>
\${100%9} : ${100%9}<br>
<%--\${100mod9} : ${100mod9}<br> --%>
</h1>
</body>
</html>