package Ex02;

import java.net.URL;
import java.util.ResourceBundle;

import Ex02.Service.Service;
import Ex02.Service.ServiceImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	private Parent root ;
	private Service loginSrv;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		loginSrv =new ServiceImpl();
	}

	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}
	
	public void LoginProc() {
		loginSrv.LoginProc(root);
	}
	public void CancelProc() {
		loginSrv.CancelProc(root);
		
		
	}
	public void OpenMembershipForm() {
		loginSrv.OpneMembershipForm();
	}
	
}
