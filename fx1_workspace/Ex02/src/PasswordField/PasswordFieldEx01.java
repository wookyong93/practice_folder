package PasswordField;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PasswordFieldEx01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10));
		
		PasswordField pf = new PasswordField();
		
		//커서 위치 변경
		pf.setAlignment(Pos.BOTTOM_RIGHT);
		pf.setPrefSize(100, 50);
		//필드 크기 지정
//		pf.setText("암호를 입력하세요");
//		//필드 값 설정
		pf.setPromptText("암호를 입력하세요");
		hbox.getChildren().add(pf);
		hbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("PasswordField Ex");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
