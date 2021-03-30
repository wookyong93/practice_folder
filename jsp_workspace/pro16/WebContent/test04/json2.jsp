<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSON 테스트</title>
<script src="http://code.jquery.com/jquery-latest.min.js">
</script>
<script>
$(function(){
	$("#checkjson").click(function(){
		var jsonStr='{"age":[22,33,44]}';
		//JSON 의 객체 표현은 {} , 배열값은 [] 로 표현한다.
		var jsonInfo= JSON.parse(jsonStr);
		var output="회원 나이<br>";
		output+="=============<br>"
		for(var i in jsonInfo.age){
			output+= jsonInfo.age[i]+"<br>";
		}
		$("#output").html(output);
	});
});
</script>
</head>
<body>
	<a id="checkjson" style="cursor:pointer">출력</a><br><br>
	<div id="output"></div>
</body>
</html>