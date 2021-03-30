package Ex04.StackPane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPaneEx02	extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane stack = new StackPane();
		Rectangle rect = new Rectangle(100,100,Color.YELLOW);
		Label lb1 = new Label("Go!");
		
		//Pos. ��ǥ �̿��ϸ� ���ϴ� ��ġ�� ��ü�� �̵���ų �� �ִ�.
		
//		StackPane.setAlignment(lb1, Pos.TOP_LEFT);
		StackPane.setAlignment(lb1, Pos.BOTTOM_RIGHT);
		stack.getChildren().addAll(rect,lb1);
				
				primaryStage.setTitle("StackPaneEx");
				//Scene scene = new Scene(stack,300,250);
				//primaryStage.setScene(scene);
				primaryStage.setScene(new Scene(stack,300,250));
				primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
