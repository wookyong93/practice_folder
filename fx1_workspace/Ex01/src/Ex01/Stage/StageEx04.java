package Ex01.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StageEx04	extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		 BorderPane root = new BorderPane();
		 Scene scene = new Scene(root,300,200);
		 
		 primaryStage.setTitle("First_window");
		 primaryStage.setScene(scene);
		 primaryStage.show();
		 
		 Thread.sleep(2000);
		 //시간 딜레이 : 2초 대기
		 primaryStage.setIconified(true);
		 //최소화
		 Thread.sleep(2000);
		 //시간딜레이
		 primaryStage.setIconified(false);
		 //원래대로
	}
public static void main(String[] args) {
	launch(args);
}
}
