package Ex05.Service;

import Ex05.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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

	

}
