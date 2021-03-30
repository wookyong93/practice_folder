package Ex08.GridPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneEx05 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane gridPane = new GridPane();
		
		gridPane.setPadding(new Insets(20));
		//padding 값 설정
		gridPane.setHgap(50);
		//오른쪽 간격
		gridPane.setVgap(10);
		//아래 간격
		Button btn = new Button("Button");
		GridPane.setRowIndex(btn, 0);
		GridPane.setColumnIndex(btn, 0);
		
		Label lb1 = new Label("Label");
		GridPane.setConstraints(lb1, 1, 1);
						
		gridPane.getChildren().addAll(btn,lb1);
		
		gridPane.add(new Button("col:1,row:0"), 1, 0);
		gridPane.add(new Button("col:0,row:1"), 0, 1);
		//add(객체, column, row)
		
		FlowPane pane =new FlowPane();
		pane.getChildren().add(new Button("mergo col(0),row(2)"));
		pane.setAlignment(Pos.CENTER);
		pane.setStyle("-fx-background-color : black;");
		gridPane.add(pane,0,2,2,1);
		//add(객체,column,row,columnspan,rowspan)
		//span  :  병합 , rowspan : 행 병합  , columnspan  : 열병합
		
		primaryStage.setTitle("GridPane Ex");
		primaryStage.setScene(new Scene(gridPane,300,300));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
