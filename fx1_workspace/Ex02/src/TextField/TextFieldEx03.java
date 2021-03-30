package TextField;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextFieldEx03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10));
		
		//텍스트필드에 값을 넣을수 있다.
//		TextField tf = new TextField("데이터를 입력하세요");
		TextField tf = new TextField();
		//setText : 값
		
		TextField tf2 = new TextField();
		//setPrompText : 가이드
		tf.setPrefSize(150,80);
		tf.setAlignment(Pos.TOP_LEFT);
		
		tf2.setPrefSize(150, 40);
		
		hbox.getChildren().addAll(tf,tf2);
		
		hbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("TextField Ex");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
