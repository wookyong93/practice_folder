package TextField;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextFieldEx01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10));
		
		TextField tf = new TextField();
		
		hbox.getChildren().add(tf);
		
		hbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("TextField Ex");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
