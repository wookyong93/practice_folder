package Ex01.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StageEx05 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		 BorderPane root = new BorderPane();
		 Scene scene = new Scene(root,300,200);
		 
		 primaryStage.setTitle("First_window");
		 primaryStage.setScene(scene);
		 
		 primaryStage.show();
		 
		 Thread.sleep(2000);
		 primaryStage.hide();
		 
		 Thread.sleep(2000);
		 primaryStage.setX(100);
		 //ȭ���� X ��ǥ 10 ��ġ, ������
		 primaryStage.setY(200);
		 //ȭ���� Y ��ǥ 10 ��ġ
		 primaryStage.show();
		 
		
		 
		 
	}
public static void main(String[] args) {
	launch(args);
}
}
