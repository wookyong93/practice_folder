package Ex01.Stage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StageEx07 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Text text = new Text(10,40,"Hello World!");
		text.setFont(new Font(40));
		
		Scene scene = new Scene(new Group(text));
		
		primaryStage.setTitle("Welcome to JavaFX");
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
