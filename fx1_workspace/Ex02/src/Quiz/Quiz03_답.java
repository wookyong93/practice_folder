package Quiz;

import Ex01.Group.GrouopEx02;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Quiz03_´ä extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Group g = new Group();
		
		Pane p1 = new Pane();
		p1.setStyle("-fx-background-color : black;");
		p1.setLayoutX(20);
		p1.setLayoutY(20);
		p1.setPrefSize(220, 220);
		
		Circle c = new Circle(65,65,50,Color.BLUE);
		Rectangle r = new Rectangle(100, 100, Color.RED);
		r.relocate(70, 70);
		p1.getChildren().addAll(c,r);
		
		Pane p2 = new Pane();
		p2.setStyle("-fx-background-color : yellow;");
		p2.setLayoutX(260);
		p2.setLayoutY(20);
		p2.setPrefSize(220, 220);
		
		Ellipse e = new Ellipse(110, 110, 80, 30);
		p2.getChildren().add(e);
		
		Pane p3 = new Pane();
		p3.setStyle("-fx-background-color : red;");
		p3.setLayoutX(20);
		p3.setLayoutY(260);
		p3.setPrefSize(460, 220);
		
		g.getChildren().addAll(p1,p2,p3);
		
		Scene s = new Scene(g,500,500,Color.BLUE);
		
		primaryStage.setTitle("Pane Quiz");
		primaryStage.setScene(s);
		primaryStage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
