package Ex05.Service;

import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class MembershipServiceImpl  implements MembershipService{

	@Override
	public void MembershipProc(Parent membershipForm) {
		// TODO Auto-generated method stub
		TextField nameTxt = (TextField)membershipForm.lookup("#txtName");
		System.out.println(nameTxt.getText());
	}

}
