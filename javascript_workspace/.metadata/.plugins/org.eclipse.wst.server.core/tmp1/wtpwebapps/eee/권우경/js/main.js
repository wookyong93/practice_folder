/**
 * 
 */
function mypage(){
		location.href='mypage.html';
	}
	function logout(){
		confirm('정말 로그아웃 하시겠습니까?')
		if(true){
			location.href='login.html';
		}
	}
	function search(){
		var searchTxt = document.getElementById('searchTxt').value;
		alert(searchTxt+'의 대한 검색이 완료되었습니다.')
		searchTxt.value ='';
	}
	function balladeInfo(){
		
	location.href='balladeInfo.html';
	}