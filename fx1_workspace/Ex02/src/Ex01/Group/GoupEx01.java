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
		//���� = > ���簢�� 
		
		r.setX(20); // X ��
		r.setY(20); // Y ��
		r.setWidth(100); // ����
		r.setHeight(10); // ����
		r.setFill(Color.RED); // ���� ��
		
		g.getChildren().add(r);
		//Group �� Rectangle �߰�
		
		Scene scene = new Scene(g, 300,200);
		//scene �� Group �߰�
		primaryStage.setTitle("GroupEx");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
