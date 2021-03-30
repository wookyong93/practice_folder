package RadioButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RadioButtonEx01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		//라디오 버튼 : 어러개 선택 중 하나만 선택하는 용도로 사용
		//체크 박스 : 여러개의 선택 중 여러개를 선택하는 용도로 사용
		HBox hbox = new HBox(10);
		
		RadioButton rb1 = new RadioButton("rb1");
		RadioButton rb2 = new RadioButton("rb2");
		
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
