package Ex07BorderPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneEx01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane borderPane = new BorderPane();
		Button[] btn = new Button[5];
		String[] strbtn = {"TOP","Center","Bottom","Left","Right"};
		
		for(int i =0; i<btn.length;i++) {
			btn[i] =new Button(strbtn[i]);
		}
		borderPane.setTop(btn[0]);
		borderPane.setCenter(btn[1]);
		borderPane.setBottom(btn[2]);
		borderPane.setLeft(btn[3]);
		borderPane.setRight(btn[4]);
		primaryStage.setTitle("EX");
		primaryStage.setScene(new Scene(borderPane,300,100));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
