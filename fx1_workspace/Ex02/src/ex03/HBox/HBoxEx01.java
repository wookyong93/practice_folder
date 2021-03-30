package ex03.HBox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBoxEx01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
//		HBox h = new HBox(10);
		VBox v = new VBox(10);
		
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		
		p1.setStyle("-fx-background-color: blue;");
		p1.setPrefSize(200, 150);
		p2.setStyle("-fx-background-color:red;");
		p2.setPrefSize(200, 150);
		
//		h.getChildren().addAll(p1,p2);
		v.getChildren().addAll(p1,p2);
//		Scene s = new Scene(h);
		Scene s = new Scene(v);
				
		primaryStage.setTitle("HboxExam");
		primaryStage.setScene(s);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
