package Ex07.Service;

import java.util.HashMap;
import java.util.Map;

import Ex07.Member;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class MembershipServiceImpl  implements MembershipService{

	@Override
	public Map<String, TextField> getTextFieldInfo(Parent membershipForm, String[] txtFldArr) {
		// TODO Auto-generated method stub
		Map<String,TextField> txtFldMap = new HashMap<String,TextField>();
		
		for(int i =0;i<txtFldArr.length;i++) {
					TextField txtFld = 
							(TextField)membershipForm.lookup(txtFldArr[i]);
					txtFldMap.put(txtFldArr[i], txtFld);	
		}
		return txtFldMap;
	}

	@Override
	public boolean isEmpty(Map<String,TextField> txtFldMap, String[] txtFldArr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<txtFldArr.length;i++) {
				TextField txtFld = (TextField) txtFldMap.get(txtFldArr[i]);
				if(txtFld.getText().isEmpty()) {
					txtFld.requestFocus();
					return true;
				}
		}
		return false;
	}

	@Override
	public boolean comparePw(String pw, String pwOk) {
		// TODO Auto-generated method stub
		if(pw.contentEquals(pwOk)) {
			return true;
		}
		return false;
	}

	
	
}
