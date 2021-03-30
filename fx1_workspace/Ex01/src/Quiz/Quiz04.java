package Quiz;



import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Quiz04 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		 
		 int frameWidth = 200;
		 int frameHeight = 100;
		 	BorderPane root = new BorderPane();
			 Scene scene = new Scene(root,frameWidth,frameHeight);
			 
			 Toolkit tk = Toolkit.getDefaultToolkit();
			 Dimension screensize = tk.getScreenSize();
			 int screenWidth = screensize.width;
			 int screenhight = screensize.height;
			 
			int gabWidth =(screenWidth/2 - frameWidth/2)/30;
			int gabheigth =(screenhight/2 - frameHeight/2)/30;
			
			 primaryStage.setTitle("Quiz04");
			 primaryStage.setScene(scene);
			 
			 for(int i = 0; i<6 ; i++) {
				 root = new BorderPane();
				 scene = new Scene(root,frameWidth*(i+1),frameHeight*(i+1));
				 primaryStage.setScene(scene);
				
				 primaryStage.setX(gabWidth*i);
				 primaryStage.setY(gabheigth*i);
				 
				 
				 
				 primaryStage.show();
				 
				 
				 Thread.sleep(2000);
				 primaryStage.hide(); 
			 }
	}
	public static void main(String[] args) {
		launch(args);
	}
}
