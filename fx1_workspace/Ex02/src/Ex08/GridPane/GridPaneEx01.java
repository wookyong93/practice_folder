package Ex08.GridPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneEx01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane gridPane = new GridPane();
		
		Button btn = new Button("Button");
		GridPane.setRowIndex(btn, 0);
		GridPane.setColumnIndex(btn, 0);
		
		Label lb1 = new Label("Label");
		GridPane.setConstraints(lb1, 1, 1);
		
		
		Button btn2 = new Button("TEST");
		GridPane.setRowIndex(btn2, 1);
		GridPane.setColumnIndex(btn2, 0);
		gridPane.getChildren().addAll(btn,lb1,btn2);
		
		primaryStage.setTitle("GridPane Ex");
		primaryStage.setScene(new Scene(gridPane,300,300));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
