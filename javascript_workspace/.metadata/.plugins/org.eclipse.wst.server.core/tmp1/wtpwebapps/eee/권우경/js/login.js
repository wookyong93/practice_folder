/**
 * 
 */
function login(){
	var id= document.getElementById('id').value;
	var pwd = document.getElementById('pwd').value;
	
	if(id =='user' && pwd=='1234'){
		location.href = "main.html";
	}else {
		alert('아이디나 암호가 잘못되었습니다.')
	}
}
function endPro(){
	window.close();
}
function join(){
	location.href = "joinPage.html";
}