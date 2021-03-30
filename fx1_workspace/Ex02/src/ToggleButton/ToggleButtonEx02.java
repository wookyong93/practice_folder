package ToggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ToggleButtonEx02 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(10);
		ToggleButton tb = new ToggleButton("",new ImageView("/img/magi.png"));
		ToggleButton tb2 = new ToggleButton();
		tb2.setGraphic(new ImageView("/img/magi.png"));
		
		
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
