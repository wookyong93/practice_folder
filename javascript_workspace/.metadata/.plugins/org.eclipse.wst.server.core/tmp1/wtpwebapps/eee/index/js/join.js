/**
 * 
 */
function idCheck(){
	var id = document.getElementById('id').value;
	
	if(id == 'user'){
		alert('중복된 아이디 입니다. 다시 입력하세요');
		document.getElementById('id').value = '';
		document.getElementById('id').focus();
	}
	else{
		alert('사용가능한 아이디 입니다.')
		document.getElementById('pwd1').focus();
	}
}
function pwCheck(){
	var pwd1 = document.getElementById('pwd1').value;
	var pwd2 = document.getElementById('pwd2').value;
	var check = document.getElementById('check');
	
	if(pwd1 == pwd2){
		check.innerHTML ='일치';
	}else{
		check.innerHTML ='불일치';
		document.getElementById('pwd1').value = '';
		document.getElementById('pwd2').value = '';
		pwd1.focus();
	}
	
}
function cancel(){
	alert('회원가입을 취소하셨습니다.')
	location.href = 'index.html';
}
function join(){
	var id = document.getElementById('id').value;
	var pwd1 = document.getElementById('pwd1').value;
	var pwd2 = document.getElementById('pwd2').value;
	
	if(id ==''){
		alert('아이디를 입력하세요');
		document.getElementById('id').focus
	}else if(pwd1 != pwd2 || pwd1 == ''||pwd2 == ''){
		alert('암호를확인하세요');
		document.getElementById('pwd1').value = '';
		document.getElementById('pwd2').value = '';
		pwd1.focus();
	}else {
		alert('회원가입이 완료되었습니다.');
		location.href ='index.html';
	}
	
}