package Ex09.Service;

import java.util.List;

import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;

public class MembershipServiceImpl  implements MembershipService{
		@Override
	public boolean comparePw(String pw, String pwOk) {
		// TODO Auto-generated method stub
		if(pw.contentEquals(pwOk)) {
			return true;
		}
		return false;
	}

		@Override
		public void AddComboBox(Parent form, List<String> items) {
			// TODO Auto-generated method stub
			ComboBox<String> cmbAge = ((ComboBox<String>)form.lookup("#cmbAge"));
			
			if(cmbAge != null) {
				for(String item : items) {
					cmbAge.getItems().add(item);
				}
			}
		}

		@Override
		public String getComboBoxString(Parent membershipForm) {
			// TODO Auto-generated method stub
			ComboBox<String> cmbAge = (ComboBox<String>) membershipForm.lookup("#cmbAge");
			if(cmbAge == null) {
				return "";
			}
			return cmbAge.getValue().toString();
		}
		
		

		@Override
		public boolean isComboBox(Parent membershipForm) {
			// TODO Auto-generated method stub
			
			ComboBox<String> cmbAge = ((ComboBox<String>)membershipForm.lookup("#cmbAge"));
			
			if(cmbAge.getValue() == null) {
				cmbAge.requestFocus();
				return true;
			}
			return false;
		}

		@Override
		public int getGender(Parent membershipForm) {
			// TODO Auto-generated method stub
			
			RadioButton rdo = (RadioButton) membershipForm.lookup("#rdoMan");
			
			if(rdo.isSelected()) {
				return 0;// 남성일때
			}
			return 1;//여성일때
		}

		@Override
		public int getHobby(Parent membershipForm) {
			// TODO Auto-generated method stub
			int hobby =0;
			
			//#chkMusic 선택이 되면 1 을 더한다.
			//#chkSport 선택이 되면 2 를 더한다.
			//#chkMovie 선택이 되면 4 를 더한다.
			if(((CheckBox)membershipForm.lookup("#chkMusic")).isSelected()) {
				hobby += 1;
			}
			if(((CheckBox)membershipForm.lookup("#chkSport")).isSelected()) {
				hobby += 2;
			}
			if(((CheckBox)membershipForm.lookup("#chkMovie")).isSelected()) {
				hobby += 4;
			}
			
			return hobby;
		}
		
}
