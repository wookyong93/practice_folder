package Ex01.Group;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GoupEx01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g = new Group();
		
		Rectangle r = new Rectangle();
		//도형 = > 직사각형 
		
		r.setX(20); // X 축
		r.setY(20); // Y 축
		r.setWidth(100); // 넓이
		r.setHeight(10); // 높이
		r.setFill(Color.RED); // 도형 색
		
		g.getChildren().add(r);
		//Group 에 Rectangle 추가
		
		Scene scene = new Scene(g, 300,200);
		//scene 에 Group 추가
		primaryStage.setTitle("GroupEx");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
