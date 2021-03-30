package Quiz;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Quiz03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g =new Group();
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		Pane p3 = new Pane();
		
		Circle c = new Circle(70,Color.BLUE);
		c.relocate(25, 25);
		Rectangle r = new Rectangle(150,150,Color.RED);
		r.relocate(100, 100);
		p1.getChildren().addAll(c,r);
		p1.setStyle("-fx-background-color : black;");
		p1.setPrefSize(300, 300);
		p1.setLayoutX(25);
		p1.setLayoutY(25);
		
		
		Ellipse e = new Ellipse(150,150,75,25);
		p2.getChildren().add(e);
		p2.setStyle("-fx-background-color : yellow");
		p2.setPrefSize(300, 300);
		p2.setLayoutX(375);
		p2.setLayoutY(25);
		
		p3.setStyle("-fx-background-color:red");
		p3.setPrefSize(650,300 );
		p3.setLayoutX(25);
		p3.setLayoutY(375);
		
		g.getChildren().addAll(p1,p2,p3);
		Scene scene = new Scene(g,700,700,Color.BLUE);
		primaryStage.setTitle("Pane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
				
	}
	public static void main(String[] args) {
		launch(args);
	}
}
