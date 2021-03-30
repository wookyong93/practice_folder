package Ex09;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.ResourceBundle;

import Ex09.DAO.DatabaseService;
import Ex09.DAO.DatabaseServiceImpl;
import Ex09.Service.CommonService;
import Ex09.Service.CommonServiceImpl;
import Ex09.Service.LoginService;
import Ex09.Service.LoginServiceImpl;
import Ex09.Service.MembershipService;
import Ex09.Service.MembershipServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController extends Controller implements Initializable{
	private Parent root ;
	private LoginService loginSrv;
	private CommonService comSrv;
	private MembershipService memSrv;
	private DatabaseService dataSrv;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		loginSrv =new LoginServiceImpl();
		comSrv = new CommonServiceImpl();
		memSrv = new MembershipServiceImpl();
		try {
			dataSrv = new DatabaseServiceImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
				comSrv.ErrorMsg("입력창이 비었습니다.");
				return;
			}
			if(dataSrv.select(txtFldMap.get("#txtId").getText(),txtFldMap.get("#txtPw").getText())) {
				comSrv.ErrorMsg("Success", "로그인 성공", txtFldMap.get("#txtId").getText() + "님이 로그인 하셨습니다.");
			}else {
				comSrv.ErrorMsg("Fail", "로그인 실패", "로그인에 실패하셨습니다. 다시 입력 해주세요");
				return;
			}
			loginSrv.LoginProc(txtFldMap.get("#txtId").getText());
		}
	public void CancelProc(ActionEvent e) {
		comSrv.WindowClose(e);
	}
	public void OpenMembershipForm() {
		Stage membershipForm = new Stage();
		CommonService comSrv = new CommonServiceImpl();
		Parent from = comSrv.showWindows(membershipForm, "../membership.fxml", "회원가입창");
		
		String[] items = {"20대 미만","20대","30대","40대","50대","60대 이상"};
		memSrv.AddComboBox(from,Arrays.asList(items));
		}
	
	
}
