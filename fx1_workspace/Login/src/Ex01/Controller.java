package Ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	private Parent root ;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}
	
	public void LoginProc() {
		TextField txtField1 = (TextField) root.lookup("#txtid");
		TextField txtField2 = (TextField) root.lookup("#txtpw");
		System.out.println("ID : "+txtField1.getText()+",PW : "+txtField2.getText()+"�� �ԷµǾ����ϴ�.");
	}
	public void CancelProc() {
		
		TextField txtField1 = (TextField) root.lookup("#txtid");
		TextField txtField2 = (TextField) root.lookup("#txtpw");
		txtField1.clear();
		txtField2.clear();
		System.out.println("��� ������ ����");
	}
	public void OpenMembershipForm() {
		TextField txtField1 = (TextField) root.lookup("#txtid");
		Button membershipBtn = (Button) root.lookup("#membershipBtn");
		System.out.println(membershipBtn.getId());
		System.out.println("ȸ������ �Ǿ����ϴ�.");
	}
	
}
