package Ex06.Service;

import Ex06.Member;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class MembershipServiceImpl  implements MembershipService{

	@Override
	public void MembershipProc(Parent membershipForm) {
		// TODO Auto-generated method stub
	Member member = getMember(membershipForm);
	System.out.println(member.getName());
	System.out.println(member.getId());
	System.out.println(member.getPw());

	}

	private Member getMember(Parent membershipForm) {
		// TODO Auto-generated method stub\
		TextField nameTxt = (TextField) membershipForm.lookup("#txtName");
		TextField idTxt = (TextField) membershipForm.lookup("#txtId");
		TextField pwdTxt = (TextField) membershipForm.lookup("#txtPwd");
		
		Member member = new Member();
		member.setName(nameTxt.getText());
		member.setId(idTxt.getText());
		member.setPw(pwdTxt.getText());
		
		return member;
	}
}
