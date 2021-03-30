package Ex08.Service;

import java.util.HashMap;
import java.util.Map;

import Ex08.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class CommonServiceImpl implements CommonService {

	@Override
	public void WindowClose(ActionEvent e) {
		// TODO Auto-generated method stub
		Parent root =(Parent)e.getSource();
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
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
	public void showWindows(Stage s, String formPath, String title) {
		// TODO Auto-generated method stub	
		FXMLLoader loader = new FXMLLoader(getClass().getResource(formPath));
		
		Parent root = null;
		try {
			root = loader.load();
			s.setScene(new Scene(root));
			s.setTitle(title);
		}catch(Exception e ) {
			e.printStackTrace();
		}
		Controller crt1 = loader.getController();
		crt1.setRoot(root);
		
		s.show();
	}
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
	public void ErrorMsg(String title, String headerStr, String contentTxt) {
		// TODO Auto-generated method stub
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(title);
		alert.setHeaderText(headerStr);
		alert.setContentText(contentTxt);
		alert.show();
	}
	@Override
	public void ErrorMsg(String headerStr, String contentTxt) {
		// TODO Auto-generated method stub
		ErrorMsg("Error",headerStr,contentTxt);
	}
	@Override
	public void ErrorMsg(String contentTxt) {
		// TODO Auto-generated method stub
		ErrorMsg("Error","Error Header",contentTxt);
	}

	

}
