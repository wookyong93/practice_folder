package ToggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ToggleButtonEx01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(10);
		ToggleButton tb = new ToggleButton("Toggle btn");
		ToggleButton tb2 = new ToggleButton();
		tb2.setText("Toggle btn2");
		
		hbox.getChildren().addAll(tb,tb2);
		hbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("ToggleButton Ex");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
