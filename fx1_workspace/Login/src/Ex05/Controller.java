package Ex05;

import java.net.URL;
import java.util.ResourceBundle;

import Ex05.Service.LoginService;
import Ex05.Service.LoginServiceImpl;
import Ex05.Service.MembershipService;
import Ex05.Service.MembershipServiceImpl;
import Ex05.Service.CommonService;
import Ex05.Service.CommonServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	private Parent root ;
	private LoginService loginSrv;
	private CommonService comSrv;
	private MembershipService memSrv;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		loginSrv =new LoginServiceImpl();
		comSrv = new CommonServiceImpl();
		memSrv = new MembershipServiceImpl();
		
	}

	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}
	
	public void LoginProc() {
		loginSrv.LoginProc(root);
	}
	public void CancelProc(ActionEvent e) {
		comSrv.WindowClose(e);
	}
	public void OpenMembershipForm() {
		loginSrv.openMembershipForm();
	}
	public void MembershipProc() {
		memSrv.MembershipProc(root);
	}
}
