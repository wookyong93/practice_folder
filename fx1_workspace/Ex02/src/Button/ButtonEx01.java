package Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonEx01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane p = new Pane();
		
		//생성자로 버튼의 문자를 넣을 수 있다.
		Button btn = new Button("Button");
		
		p.getChildren().add(btn);
		p.setPrefSize(300, 200);
		
		primaryStage.setTitle("Button Ex");
		primaryStage.setScene(new Scene(p));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
