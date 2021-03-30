package Quiz;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Quiz05_답 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screensize = tk.getScreenSize();
		
		int gabWidth = (screensize.width/2 -200);
		//1920 /2 = 960 -200 => 760
		//760*2 =>1520
		int gabHieght =(screensize.height/2 -200);
		//1080/2 =>540-200 =>340
		//340*2 => 680
		
		for(int i =0 ; i<3 ; i++) {
			for(int j =0; j<3 ; j++) {
				BorderPane root = new BorderPane();
				Scene scene = new Scene(root,400,400);
				primaryStage.setX(gabWidth*j);
				//0 , 760 , 1250 =>3번 반복
				primaryStage.setY(gabHieght*i);
				//0 =>3 번, 340=>3번, 680=>3
				primaryStage.setScene(scene);
				primaryStage.show();
				Thread.sleep(1000);
				primaryStage.hide();
				
			}
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
