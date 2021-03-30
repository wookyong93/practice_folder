package CheckBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChecBoxEx03 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(10));
		
		CheckBox chk1 = new CheckBox();
		CheckBox chk2 = new CheckBox();
		
		//뮨자를 따로 지정
		chk1.setText("게임");
		chk2.setText("오락");
		
		// 기본 값이 되는걸 미리 선택이 가능하다.
		chk2.setSelected(true);
		
		vbox.getChildren().addAll(chk1,chk2);
		vbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("CheckBox Ex");
		primaryStage.setScene(new Scene(vbox));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
