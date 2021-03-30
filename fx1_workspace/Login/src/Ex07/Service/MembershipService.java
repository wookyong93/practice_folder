package Ex07.Service;

import java.util.Map;

import Ex07.Member;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public interface MembershipService {
	public Map getTextFieldInfo(Parent membershipForm, String[] txtFldArr);

	public boolean isEmpty(Map<String, TextField> txtFldMap, String[] txtFldArr);

	public boolean comparePw(String pw, String pwOk);
	
	
}
