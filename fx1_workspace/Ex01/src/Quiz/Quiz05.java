package Quiz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Quiz05 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane();
		Scene scene =  new Scene(root,600,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Quiz05");
		
			for(int i = 0 ; i<3;i++) {
					for(int j = 0; j<3;j++) {
					primaryStage.setX(j*650);
					primaryStage.setY(i*350);
					primaryStage.show();
					 
					Thread.sleep(1000);
					primaryStage.hide();
					}
			}
		}
	public static void main(String[] args) {
		launch(args);
	}
}
