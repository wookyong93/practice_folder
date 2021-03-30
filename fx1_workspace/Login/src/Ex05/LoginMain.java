package Ex05;

import Ex05.Service.CommonServiceImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		CommonServiceImpl comSrv = new CommonServiceImpl();
		comSrv.showWindows(primaryStage, "../Login.fxml", "Login");
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
