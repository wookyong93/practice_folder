package RadioButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RadioButtonEx02 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		HBox hbox = new HBox(10);
		
		RadioButton rb1 = new RadioButton("rb1");
		RadioButton rb2 = new RadioButton("rb2");
		
		//토글 - 라디오버튼을 그룹화 하는것
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		
		hbox.getChildren().addAll(rb1,rb2);
		hbox.setPrefSize(300, 200);
		primaryStage.setTitle("RadioButton Ex");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
