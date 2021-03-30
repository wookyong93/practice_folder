package Ex07.Service;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
	public void openMembershipForm() {
		// TODO Auto-generated method stub
		Stage membershipForm = new Stage();
		CommonService comSrv = new CommonServiceImpl();
		comSrv.showWindows(membershipForm, "../membership.fxml", "회원가입창");
		
	}

	



}
