package Ex08.Service;

import java.util.Map;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public interface CommonService {
	public void WindowClose(ActionEvent e);
	public void showWindows(Stage s , String formPath, String title);
	public boolean isEmpty(Map<String,TextField> txtFldMap, String[] txtFldArr);
	public Map<String, TextField> getTextFieldInfo(Parent membershipForm, String[] txtFldArr);
	public void ErrorMsg(String title,String headerStr, String contentTxt);
	public void ErrorMsg(String headerStr, String contentTxt);
	public void ErrorMsg(String contentTxt);
}
