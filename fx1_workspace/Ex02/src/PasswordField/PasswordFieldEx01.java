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
		
		//Ŀ�� ��ġ ����
		pf.setAlignment(Pos.BOTTOM_RIGHT);
		pf.setPrefSize(100, 50);
		//�ʵ� ũ�� ����
//		pf.setText("��ȣ�� �Է��ϼ���");
//		//�ʵ� �� ����
		pf.setPromptText("��ȣ�� �Է��ϼ���");
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
