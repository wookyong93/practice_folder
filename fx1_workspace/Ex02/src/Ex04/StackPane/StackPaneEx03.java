package Ex04.StackPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPaneEx03 extends Application{


	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane stack = new StackPane();
		Rectangle rect = new Rectangle(100,100,Color.YELLOW);
		Label lb1 = new Label("Go!");
		
		//setMargin() 를 여백지정
		StackPane.setMargin(lb1, new Insets(100,8,8,8));
		StackPane.setMargin(rect, new Insets(50,8,8,8));
		stack.getChildren().addAll(rect,lb1);
				
				primaryStage.setTitle("StackPaneEx");
				primaryStage.setScene(new Scene(stack,300,250));
				primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
