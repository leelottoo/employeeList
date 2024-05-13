/**
 * 
 */

 function employeesCheck(){
	 if(document.frm.pass.value.length < 4){
		 alert("비밀번호는 4글자 이상이어야 합니다.");
		 frm.pass.focus();
		 return false;
	 }
	 return true;
 }
 