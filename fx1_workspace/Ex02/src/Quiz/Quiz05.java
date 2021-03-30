package Quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz05 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox h = new HBox();
		h.setPadding(new Insets(20));
		h.setSpacing(20);
		VBox v1 = new VBox();
		v1.setSpacing(20);
		
		Pane p1 = new Pane();
		p1.setStyle("-fx-background-color:red");
		p1.setPrefSize(600, 100);
		Pane p2 = new Pane();
		p2.setStyle("-fx-background-color:black");
		p2.setPrefSize(600, 100);
		Pane p3 = new Pane();
		p3.setStyle("-fx-background-color:blue");
		p3.setPrefSize(200, 220);
		v1.getChildren().addAll(p1,p2);
		h.getChildren().addAll(v1,p3);
		
		Scene s = new Scene(h);
		
		h.setHgrow(p3, Priority.NEVER);
		primaryStage.setScene(s);
		primaryStage.setTitle("Quiz");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
