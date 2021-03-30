package Ex04.StackPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

//stack : 바구니에 값을 넣는 형태 -FILO(first in last out)
//Queue : 원통에 겂을 넣는 형태 -FIFO (first in first out)
public class StackPaneEx01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane stack = new StackPane();
		stack.getChildren().addAll(new Rectangle(100,100,Color.YELLOW), new Label("Go!"));
				
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
