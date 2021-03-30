package Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonEx03 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane p = new Pane();
		
		Button btn = new Button("Button");
		
		//버튼 위치 지정
		btn.setLayoutX(90);
		btn.setLayoutY(80);
		
		btn.setPrefSize(120, 40);

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
