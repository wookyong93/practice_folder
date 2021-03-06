package Ex01.Group;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GruopEx03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g = new Group();
		
		Circle circle = new Circle(50,Color.BLUE);
		//new circle(반지름,색)
		circle.relocate(20, 20);
		//x축 , y축
		Rectangle rectangle = new Rectangle(100,100,Color.RED);
		//넓이 , 높이 , 색상
		rectangle.relocate(70, 70);
		//X축 , Y 축
//		g.getChildren().add(rectangle);
//		g.getChildren().add(circle);
//		g.getChildren().addAll(circle,rectangle);
		g.getChildren().addAll(rectangle,circle);
		
		circle.relocate(50, 50);
		rectangle.relocate(100, 100);

		
		Scene scene = new Scene(g,300,200);
		primaryStage.setTitle("GroupEx");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
