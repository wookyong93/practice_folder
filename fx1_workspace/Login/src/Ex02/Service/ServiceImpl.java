package Ex02.Service;

import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class ServiceImpl implements Service{

	@Override
	public void LoginProc(Parent root) {
		// TODO Auto-generated method stub
		TextField idTxt = (TextField) root.lookup("#txtid");
		TextField pwTxt = (TextField) root.lookup("#txtpw");
		System.out.println("ID : "+idTxt.getText()+",PW : "+pwTxt.getText()+"�� �ԷµǾ����ϴ�.");
	}

	@Override
	public void CancelProc(Parent root) {
		// TODO Auto-generated method stub
		TextField idTxt = (TextField) root.lookup("#txtid");
		TextField pwTxt = (TextField) root.lookup("#txtpw");
		idTxt.clear();
		pwTxt.clear();
		
		idTxt.requestFocus();
		//idTxt�� Ŀ���� �̵��� �ȴ�.
		System.out.println("��� ������ ����");
	}

	@Override
	public void OpneMembershipForm() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� ���� ��ư�� ���Ƚ��ϴ�.");
	}

}
