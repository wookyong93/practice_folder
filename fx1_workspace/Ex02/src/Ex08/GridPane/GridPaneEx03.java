package Ex08.GridPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneEx03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane gridPane = new GridPane();
		
		gridPane.setPadding(new Insets(20));
		
		Button btn = new Button("Button");
		GridPane.setRowIndex(btn, 0);
		GridPane.setColumnIndex(btn, 0);
		
		Label lb1 = new Label("Label");
		GridPane.setConstraints(lb1, 1, 1);
						
		gridPane.getChildren().addAll(btn,lb1);
		
		gridPane.add(new Button("col:1,row:0"), 1, 0);
		gridPane.add(new Button("col:0,row:1"), 0, 1);
		//add(°´Ã¼, column, row)
		
		primaryStage.setTitle("GridPane Ex");
		primaryStage.setScene(new Scene(gridPane,300,300));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
