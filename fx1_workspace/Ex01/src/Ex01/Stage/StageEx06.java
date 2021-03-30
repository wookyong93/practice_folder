package Ex01.Stage;



import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StageEx06 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		 BorderPane root = new BorderPane();
		 Scene scene = new Scene(root,300,200);
		 
		 primaryStage.setTitle("First_window");
		 primaryStage.setScene(scene);
		 
		 primaryStage.show();
		 
		 Thread.sleep(2000);
		 Toolkit tk = Toolkit.getDefaultToolkit();
		 //화면의 해상도를 가져오기
		 Dimension screenSize = tk.getScreenSize();
		 //가져온 해상도 즉 스크린 사이즈를 저장
		 System.out.println("넓이 : "+screenSize.width);
		 System.out.println("높이 : "+screenSize.height);
		 
		 
		 primaryStage.setX(screenSize.width/2 - 150);
		 primaryStage.setY(screenSize.height/2 - 100);
		 primaryStage.show();
		 
		 
		
		 
		 
	}
public static void main(String[] args) {
	launch(args);
}
}
