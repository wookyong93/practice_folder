package Ex05.Service;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

public interface CommonService {
	public void WindowClose(ActionEvent e);
	public void showWindows(Stage s , String formPath, String title);
	
}
