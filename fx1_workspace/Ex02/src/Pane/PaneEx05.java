package Pane;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PaneEx05 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g = new Group();
		Pane pane = new Pane();
		
		VBox.setVgrow(g, Priority.NEVER);
		VBox.setVgrow(pane, Priority.NEVER);
		
		Rectangle rectangle1 = new Rectangle(100,100,Color.BLUE);
		rectangle1.relocate(100, 100);
		Rectangle rectangle2 = new Rectangle(100,100,Color.BLUE);
		rectangle2.relocate(100, 100);
		Rectangle rectangle3 = new Rectangle(100,100,Color.RED);
		rectangle3.relocate(200, 200);
		Rectangle rectangle4 = new Rectangle(100,100,Color.RED);
		rectangle4.relocate(200, 200);
		
		g.getChildren().addAll(rectangle1,rectangle3);
		pane.getChildren().addAll(rectangle2,rectangle4);
		VBox vbox = new VBox(pane,g);
		
		Scene scene = new Scene(vbox,400,500);
		primaryStage.setTitle("PaneEx");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
