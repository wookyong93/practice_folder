package Button;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonEx05 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Pane p = new Pane();
		Button btn = new Button("클릭");
		
		btn.setPrefSize(120,40);
		btn.setLayoutX(20);
		btn.setLayoutY(20);
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("경고");
				alert.setHeaderText("버튼 이벤트");
				alert.setContentText("버튼을 클릭했습니다.");
				alert.show();
			}
		});
		
		p.getChildren().add(btn);
		
		primaryStage.setTitle("Button Ex");
		primaryStage.setScene(new Scene(p,160,80));
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
