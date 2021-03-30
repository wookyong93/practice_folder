package Quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz08 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane p = new Pane();
		p.setPadding(new Insets(20));
		
		Button btn1 = new Button("id");
		btn1.setPrefSize(200, 40);
		btn1.setLayoutX(20);
		btn1.setLayoutY(20);
		
		Button btn2 = new Button("pw");
		btn2.setPrefSize(200, 40);
		btn2.setLayoutX(20);
		btn2.setLayoutY(80);
		Button btn3 = new Button("Login");
		btn3.setPrefSize(80, 100);
		btn3.setLayoutX(240);
		btn3.setLayoutY(20);
		btn3.setOnAction(e->{
			Alert al = new Alert(AlertType.INFORMATION);
			al.setTitle("경고");
			al.setHeaderText("로그인 시도");
			al.setContentText("아직은 로그인을 할 수 없습니다.");
			al.show();
		});
		
		p.getChildren().addAll(btn1,btn2,btn3);
		
		primaryStage.setTitle("Button Quiz");
		primaryStage.setScene(new Scene(p));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
