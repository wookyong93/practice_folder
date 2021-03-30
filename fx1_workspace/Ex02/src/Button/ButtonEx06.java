package Button;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonEx06 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox v = new VBox();
		Pane lp = new Pane();
		Pane bp = new Pane();
		Button btn = new Button("클릭");
		Label lbl = new Label("버튼을 누르세요");
		
		btn.setPrefSize(120, 40);
		btn.setLayoutX(20);
		btn.setLayoutY(20);
		bp.getChildren().add(btn);
		
		lbl.setLayoutY(20);
		lbl.setPrefWidth(160);
		lbl.setAlignment(Pos.CENTER);
		
		lp.getChildren().add(lbl);
		
//		이벤트 추가
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent event) {
//				// TODO Auto-generated method stub
//				lbl.setText("클릭되었습니다.");
//			}
//		});
		
		//람다식  => 간단식 
		btn.setOnAction(e ->{
			lbl.setText("클릭되었습니다.");
		});
		v.getChildren().addAll(lp,bp);
		
		primaryStage.setTitle("Button Ex");
		primaryStage.setScene(new Scene(v,160,120));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
