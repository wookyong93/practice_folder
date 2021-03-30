package Quiz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Quiz01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,500,200);
		primaryStage.setTitle("Quiz01");
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
