package Quiz;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Quiz02 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Pane pane1 = new Pane();
		
		Circle circle = new Circle(30,Color.BLACK);
		circle.relocate(220, 220);
		Rectangle recteangle = new Rectangle(300,300,Color.YELLOW);
		recteangle.relocate(100, 100);
		pane.getChildren().addAll(recteangle,circle);
		pane.setStyle("-fx-background-color:Blue");
		pane.setPrefSize(500, 500);
		
		
		Scene scene = new Scene(pane,500,500);
		primaryStage.setTitle("Pane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
