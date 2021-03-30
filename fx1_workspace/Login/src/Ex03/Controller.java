package Ex03;

import java.net.URL;
import java.util.ResourceBundle;

import Ex03.Service.LoginService;
import Ex03.Service.LoginServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	private Parent root ;
	private LoginService loginSrv;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		loginSrv =new LoginServiceImpl();
	}

	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}
	
	public void LoginProc() {
		loginSrv.LoginProc(root);
	}
	public void CancelProc(ActionEvent e) {
		loginSrv.CancelProc(e);
		
		
	}
	public void OpenMembershipForm() {
		loginSrv.OpneMembershipForm();
	}
	
}
