package Lable;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LabelEx10 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane p = new Pane();
		
		Label lb1 = new Label("Values");
		lb1.setFont(new Font("Cambria",32));
		
		
		lb1.setRotate(48);
		lb1.setTranslateY(50);
		lb1.setTranslateX(50);
		
		lb1.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e ) {
				lb1.setScaleX(1.5);
				lb1.setScaleY(1.5);
			}
		
		});
		
		lb1.setOnMouseExited(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e ) {
				lb1.setScaleX(1);
				lb1.setScaleY(1);
			}
		
		});
		p.getChildren().add(lb1);
		p.setPrefSize(300, 200);
		
		primaryStage.setTitle("Label EX");
		primaryStage.setScene(new Scene(p));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
		
	}
}
