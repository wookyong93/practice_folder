package Ex09;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

import Ex09.DAO.DatabaseService;
import Ex09.DAO.DatabaseServiceImpl;
import Ex09.Service.CommonService;
import Ex09.Service.CommonServiceImpl;
import Ex09.Service.MembershipService;
import Ex09.Service.MembershipServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MembershipController extends Controller implements Initializable{
	private Parent root ;
	private CommonService comSrv;
	private MembershipService memSrv;
	private DatabaseService dataSrv;
	
	public boolean isEmpty(Map<String,TextField> txtFldMap, String[] txtFldArr) {
		// TODO Auto-generated method stub
	
		if(comSrv.isEmpty(txtFldMap, txtFldArr)) {
			comSrv.ErrorMsg("Input Error","TextField Empty", "�Է�â�� �����͸� �Է��ϼ���");
			return true;
		}
		String pw = txtFldMap.get(txtFldArr[2]).getText();
		String pwOk = txtFldMap.get(txtFldArr[3]).getText();
		
		if(!memSrv.comparePw(pw,pwOk)) {
			comSrv.ErrorMsg("Different Password", "�Է��� ��ȣ�� �ٸ��ϴ�.");
						return true;
		}
		if(memSrv.isComboBox(root)) {
			comSrv.ErrorMsg("���ɴ븦 �����ϼ���");
			return true;
		}
		
		
		return false;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		comSrv = new CommonServiceImpl();
		memSrv = new MembershipServiceImpl();
		try {
			dataSrv = new DatabaseServiceImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void CancelProc(ActionEvent e) {
		comSrv.WindowClose(e);
	}

	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}
	public void MembershipProc() {
		String[] txtFldArr = {"#txtName","#txtId","#txtPw","#txtPwOk"};
		
		Map<String,TextField> txtFldMap = comSrv.getTextFieldInfo(root,txtFldArr);
		
		if(isEmpty(txtFldMap,txtFldArr)){
			return;
		}
		
		
		Member member = new Member();
		member.setName(txtFldMap.get(txtFldArr[0]).getText());
		member.setId(txtFldMap.get(txtFldArr[1]).getText());
		member.setPw(txtFldMap.get(txtFldArr[2]).getText());
		
		member.setAge(memSrv.getComboBoxString(root));
		member.setGender(memSrv.getGender(root));
		member.setHobby(memSrv.getHobby(root));
		System.out.println(member.getName());
		System.out.println(member.getId());
		System.out.println(member.getPw());
		System.out.println(member.getAge());
		if(member.isGender() == 0) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		int hobby = member.getHobby();
		String str = "��� : ";
		if(hobby == 0) {
			str+="����";
		}
		if(hobby >= 4) {
			str+="��ȭ ";
			hobby -= 4;
		}
		if(hobby>= 2) {
			str +="������ ";
			hobby -= 2;
		}
		if(hobby == 1 ) {
			str+= "����";
		}
		System.out.println(str);
		
		dataSrv.insert(member);
		
		
		
		
//		switch(member.getHobby()) {
//		case 1 :
//			System.out.println(" ����");
//			break;
//		case 2 :
//			System.out.println("������");
//			break;
//		case 3 : 
//			System.out.println("����, ������");
//			break;
//		case 4 : 
//			System.out.println("��ȭ");
//			break;
//		case 5 :
//			System.out.println("����, ��ȭ");
//			break;
//		case 6 :
//			System.out.println("������, ��ȭ");
//			break;
//		case 7 :
//			System.out.println("����, ������, ��ȭ");
//			break;
//		default:
//			System.out.println("��� ����");
//		}
		
		
		
		
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
		
	}
	
	public void checkId() {
		TextField fldId = (TextField) root.lookup("#txtId");
		
		if(dataSrv.checkId(fldId.getText())) {
			comSrv.ErrorMsg("SignFail", "Please ID check", "������ ID�� �����մϴ�.");
				return;
		}
	}
}
