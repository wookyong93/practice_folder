package Ex09.Service;

import java.util.List;
import javafx.scene.Parent;

public interface MembershipService {
	public boolean comparePw(String pw, String pwOk);
	public void AddComboBox(Parent form,List<String> items);
	public String getComboBoxString(Parent root);
	public boolean isComboBox(Parent root);
	public int getGender(Parent root);
	public int getHobby(Parent root);
	
	
}
