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
		 //ȭ���� �ػ󵵸� ��������
		 Dimension screenSize = tk.getScreenSize();
		 //������ �ػ� �� ��ũ�� ����� ����
		 System.out.println("���� : "+screenSize.width);
		 System.out.println("���� : "+screenSize.height);
		 
		 
		 primaryStage.setX(screenSize.width/2 - 150);
		 primaryStage.setY(screenSize.height/2 - 100);
		 primaryStage.show();
		 
		 
		
		 
		 
	}
public static void main(String[] args) {
	launch(args);
}
}
