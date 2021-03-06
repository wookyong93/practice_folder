package Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonEx04 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane p = new Pane();
		
		Button btn = new Button();
		//버튼 이미지 넣기
		btn.setGraphic(new ImageView("/img/SmileReRe.png"));
		
		//버튼 위치 지정
		btn.setLayoutX(90);
		btn.setLayoutY(80);
		
		btn.setPrefSize(120, 40);

		p.getChildren().add(btn);
		p.setPrefSize(400, 400);
		
		primaryStage.setTitle("Button Ex");
		primaryStage.setScene(new Scene(p));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
