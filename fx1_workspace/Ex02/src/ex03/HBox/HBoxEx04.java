package ex03.HBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBoxEx04 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox h = new HBox();
//		VBox v = new VBox();

		h.setSpacing(10);
		h.setPrefSize(30, 70);
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		
		p1.setStyle("-fx-background-color: blue;");
		p1.setPrefSize(200, 150);
		p2.setStyle("-fx-background-color:red;");
		p2.setPrefSize(50, 50);
		
		h.getChildren().addAll(p1,p2);
		
		h.setHgrow(p1, Priority.ALWAYS);
		h.setHgrow(p2, Priority.ALWAYS);
//		
//		h.setHgrow(p1, Priority.NEVER);
//		h.setHgrow(p2, Priority.NEVER);
//		v.getChildren().addAll(p1,p2);
		Scene s = new Scene(h);
//		Scene s = new Scene(v);
				
		primaryStage.setTitle("HboxExam");
		primaryStage.setScene(s);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
