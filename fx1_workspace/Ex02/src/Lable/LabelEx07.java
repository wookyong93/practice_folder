package Lable;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LabelEx07 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox h = new HBox(10);
		h.setPadding(new Insets(10));
		
		Label lb1 = new Label("A Label that needs to be wrapped");
		//ũ�⿡ ���缭 ���ڸ� ���(ĭ�� �ٸ� �Ʒ�ĭ�� ������ ���);
//		lb1.setWrapText(false); // default ��;
		lb1.setWrapText(true);//�Ʒ�ĭ ���
		
		h.getChildren().add(lb1);
		h.setPrefSize(200, 100);
		primaryStage.setTitle("Label EX");
		primaryStage.setScene(new Scene(h));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
