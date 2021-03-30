package Quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz08_답 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		//Pane : 위차값
		//borderPane : vbox
		//GridPane : 좌표를 이용해서
		VBox v = new VBox(10);
		HBox h = new HBox(10);
		h.setPadding(new Insets(10));
		
		
		Button idBtn = new Button("ID");
		idBtn.setPrefSize(100,50);
		Button pwBtn = new Button("PW");
		pwBtn.setPrefSize(100,50);
		Button loginBtn = new Button("LOGIN");
		loginBtn.setPrefSize(70, 110);
		
		loginBtn.setOnAction(event ->{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("경고");
			alert.setHeaderText("로그인 시도");
			alert.setContentText("아직은 로그인 할 수 없습니다.");
			alert.show();
		});
		
		v.getChildren().addAll(idBtn,pwBtn);
		h.getChildren().addAll(v,loginBtn);
		
		
		primaryStage.setTitle("Button Qiz");
		primaryStage.setScene(new Scene(h));
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
