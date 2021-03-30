<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSON 연습</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
	$(function(){
		$("#checkjson").click(function(){
			var jsonStr='{"name":"박지성","age":25,"gender":"남자","nickname":"날썐돌이"}';
			var jsonObj=JSON.parse(jsonStr);
			var output="회원정보<br>";
			output+= "==========<br>";
			output+= "이름  : "+jsonObj.name+"<br>";
			output+= "나이  : "+jsonObj.age+"<br>";
			output+= "성별  : "+jsonObj.gender+"<br>";
			output+= "별명  : "+jsonObj.nickname+"<br>";
			$("#output").html(output);
			
		});
	});
</script>
</head>
<body>
	<a id="checkjson" style="cursor:pointer">출력</a>
	<div id="output"></div>
</body>
</html>