package Ex08;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

import Ex08.Service.CommonService;
import Ex08.Service.CommonServiceImpl;
import Ex08.Service.LoginService;
import Ex08.Service.LoginServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class LoginController extends Controller implements Initializable{
	private Parent root ;
	private LoginService loginSrv;
	private CommonService comSrv;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		loginSrv =new LoginServiceImpl();
		comSrv = new CommonServiceImpl();
	}

	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}
	
	public void LoginProc() {
		//아이디 , 패스워드 입력 여부 확인
		String[] txtFldArr = {"#txtId","#txtPw"};
		Map<String,TextField> txtFldMap =comSrv.getTextFieldInfo(root, txtFldArr);
		
		if(comSrv.isEmpty(txtFldMap, txtFldArr)) {
//			System.out.println("입력창이 비어있습니다.");
			comSrv.ErrorMsg("입력창이 비었습니다.");
			return;
		}
		loginSrv.LoginProc(root);
		
	}
	public void CancelProc(ActionEvent e) {
		comSrv.WindowClose(e);
	}
	public void OpenMembershipForm() {
		loginSrv.openMembershipForm();
	}
}
