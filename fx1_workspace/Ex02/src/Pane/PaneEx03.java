package Pane;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PaneEx03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g = new Group();
		Pane pane = new Pane();
		
		Circle circle = new Circle(50,Color.BLUE);
		circle.relocate(20, 20);
		Rectangle rectangle = new Rectangle(100,100,Color.RED);
		rectangle.relocate(70, 70);
		
		pane.setStyle("-fx-background-color: black;");
		//css ȿ���� �� �� �ִ�. CSS - ȭ���� �ٹ̴� ���
		pane.setPrefSize(200, 200);
		//setPrefSize (����, ����)
		pane.getChildren().addAll(circle,rectangle);
		
		g.getChildren().add(pane);
		//Group �ȿ� pane �� �߰� 
		
		Scene scene = new Scene(g,500,500,Color.YELLOW);
		primaryStage.setTitle("PaneEx");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
