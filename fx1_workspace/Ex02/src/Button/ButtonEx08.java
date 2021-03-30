package Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonEx08 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane bp = new Pane();
		Button btn = new Button("클릭");

		
		btn.setPrefSize(120, 40);
		btn.setLayoutX(20);
		btn.setLayoutY(20);
		btn.setOnAction(e -> {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("경고");
			alert.setHeaderText("버튼이벤트");
			alert.setContentText("버튼을 클릭하셨습니다.");
			alert.show();
		});
		
		
		//버튼 스타일 추가
		
		btn.setStyle("-fx-font : 22 arial; -fx-base : #b6e7c9");
		
		DropShadow shadow = new DropShadow();
		
		btn.addEventHandler(MouseEvent.MOUSE_ENTERED, e->{
				btn.setEffect(shadow);
		});
		btn.addEventHandler(MouseEvent.MOUSE_EXITED, e->{
				btn.setEffect(null);
			});
		
		bp.getChildren().add(btn);
		
		primaryStage.setTitle("Button Ex");
		primaryStage.setScene(new Scene(bp,160,80));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
