package Quiz;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Quiz02_´ä extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g = new Group();
		Pane p = new Pane();
		
		p.setStyle("-fx-background-color : yellow;");
		p.setPrefSize(200, 200);
		p.setLayoutX(100);
		p.setLayoutY(100);
		
		Ellipse ellipse = new Ellipse(100,100,75,25);
		ellipse.setFill(Color.BLACK);
		
		p.getChildren().add(ellipse);
		g.getChildren().add(p);
		
		Scene scene = new Scene(g,400,400,Color.BLUE);
		primaryStage.setTitle("Quiz02");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
