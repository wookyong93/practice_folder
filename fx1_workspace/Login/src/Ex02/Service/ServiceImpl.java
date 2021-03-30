package Ex02.Service;

import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class ServiceImpl implements Service{

	@Override
	public void LoginProc(Parent root) {
		// TODO Auto-generated method stub
		TextField idTxt = (TextField) root.lookup("#txtid");
		TextField pwTxt = (TextField) root.lookup("#txtpw");
		System.out.println("ID : "+idTxt.getText()+",PW : "+pwTxt.getText()+"가 입력되었습니다.");
	}

	@Override
	public void CancelProc(Parent root) {
		// TODO Auto-generated method stub
		TextField idTxt = (TextField) root.lookup("#txtid");
		TextField pwTxt = (TextField) root.lookup("#txtpw");
		idTxt.clear();
		pwTxt.clear();
		
		idTxt.requestFocus();
		//idTxt로 커서가 이동이 된다.
		System.out.println("모든 데이터 제거");
	}

	@Override
	public void OpneMembershipForm() {
		// TODO Auto-generated method stub
		System.out.println("회원 가입 버튼을 눌렸습니다.");
	}

}
