package Quiz;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Quiz01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g = new Group();
		
		Circle circle = new Circle(100,Color.BLUE);
		Rectangle rectangle = new Rectangle(300,300,Color.RED);
		
		g.getChildren().addAll(rectangle,circle);
		rectangle.relocate(50, 50);
		circle.relocate(100, 100);
	
		
		Scene scene = new Scene(g,400,400);
		primaryStage.setTitle("Quiz01");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
