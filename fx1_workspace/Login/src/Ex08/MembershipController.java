package Ex08;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

import Ex08.Service.CommonService;
import Ex08.Service.CommonServiceImpl;
import Ex08.Service.MembershipService;
import Ex08.Service.MembershipServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class MembershipController extends Controller implements Initializable{
	private Parent root ;
	private CommonService comSrv;
	private MembershipService memSrv;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		comSrv = new CommonServiceImpl();
		memSrv = new MembershipServiceImpl();
	}

	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}
	public void CancelProc(ActionEvent e) {
		comSrv.WindowClose(e);
	}
	
	public void MembershipProc() {
		String[] txtFldArr = {"#txtName","#txtId","#txtPw","#txtPwOk"};
		
		Map<String,TextField> txtFldMap = comSrv.getTextFieldInfo(root,txtFldArr);
		
		if(comSrv.isEmpty(txtFldMap,txtFldArr)){
			System.out.println("비어있는 필드가 존재합니다.");
			return;
		}
		String pw = txtFldMap.get(txtFldArr[2]).getText();
		String pwOk = txtFldMap.get(txtFldArr[3]).getText();
		
		if(!memSrv.comparePw(pw,pwOk)) {
			System.out.println("암호가 다릅니다.");
						return;
		}
		
		Member member = new Member();
		member.setName(txtFldMap.get(txtFldArr[0]).getText());
		member.setId(txtFldMap.get(txtFldArr[1]).getText());
		member.setPw(pw);
		System.out.println(member.getName());
		System.out.println(member.getId());
		System.out.println(member.getPw());
		
	}
}
