package Lable;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LabelEx08 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox h = new HBox(10);
		h.setPadding(new Insets(10));
		
		
		//글꼴과 글자크기 변경
		Label lbl1 = new Label("Label1");
		Label lbl2 = new Label("Label2");
		
		lbl1.setFont(new Font("Arial", 30));
		lbl2.setFont(new Font("Cambria",40));
		
		h.getChildren().addAll(lbl1,lbl2);
		h.setPrefSize(300, 200);
		primaryStage.setTitle("Label EX");
		primaryStage.setScene(new Scene(h));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
