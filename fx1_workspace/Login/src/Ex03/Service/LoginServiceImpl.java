package Ex03.Service;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginServiceImpl implements LoginService{

	@Override
	public void LoginProc(Parent root) {
		// TODO Auto-generated method stub
		TextField idTxt = (TextField) root.lookup("#txtid");
		TextField pwTxt = (TextField) root.lookup("#txtpw");
		System.out.println("ID : "+idTxt.getText()+",PW : "+pwTxt.getText()+"가 입력되었습니다.");
	}

	@Override
	public void CancelProc(ActionEvent e) {
		// TODO Auto-generated method stub
		Parent root =(Parent) e.getSource();
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
		}

	@Override
	public void OpneMembershipForm() {
		// TODO Auto-generated method stub
		System.out.println("회원 가입 버튼을 눌렸습니다.");
	}

}
