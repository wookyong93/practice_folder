package ToggleButton;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ToggleButtonEx04 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox();
		
		ToggleGroup group = new ToggleGroup();
		
		ToggleButton tb1 = new ToggleButton("minor");
		tb1.setToggleGroup(group);
		tb1.setSelected(true);
		tb1.setPrefSize(70, 30);
		
		ToggleButton tb2 = new ToggleButton("major");
		tb2.setToggleGroup(group);
		tb2.setPrefSize(70, 30);
		
		ToggleButton tb3 = new ToggleButton("critical");
		tb3.setToggleGroup(group);
		tb3.setPrefSize(70, 30);
		
		tb1.setUserData(Color.LIGHTGREEN);
		tb2.setUserData(Color.LIGHTBLUE);
		tb3.setUserData(Color.SALMON);
		
		Rectangle rect = new Rectangle(210,50, Color.LIGHTGREEN);
		
		hbox.getChildren().addAll(tb1,tb2,tb3);

		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

			@Override
			public void changed(ObservableValue<? extends Toggle> ov, Toggle oldValue, Toggle newValue) {
				// TODO Auto-generated method stub
				if(newValue == null) {
					rect.setFill(Color.WHITE);
				}else {
					rect.setFill((Color)group.getSelectedToggle().getUserData());
				}
			}
		
		});
		
		tb1.setStyle("-fx-base: lightgreen;");
		tb2.setStyle("-fx-base : lightblue;");
		tb3.setStyle("-fx-base : salmon;");
		VBox vbox = new VBox();
		vbox.getChildren().addAll(hbox,rect);
		vbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("ToggleButton EX");
		primaryStage.setScene(new Scene(vbox));
		primaryStage.show();
		
				
	}

	public static void main(String[] args) {
		
		launch(args);
	}
}
