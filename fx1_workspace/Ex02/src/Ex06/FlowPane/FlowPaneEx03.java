package Ex06.FlowPane;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneEx03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FlowPane flowPane = new FlowPane(Orientation.VERTICAL);
		
		List<Button> lstbtn = new ArrayList<Button>();
		//객체들의 column을 정렬할수 있다.
		flowPane.setColumnHalignment(HPos.RIGHT);
		
		for(int i =0; i<15 ; i++) {
			lstbtn.add(new Button("btn"+(i*i*i*10)));
			
			flowPane.getChildren().add(lstbtn.get(i));
		}
		
		primaryStage.setTitle("FlowPaneEx");
		primaryStage.setScene(new Scene(flowPane,300,250));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
