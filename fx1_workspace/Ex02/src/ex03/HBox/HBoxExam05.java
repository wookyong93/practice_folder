package ex03.HBox;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class HBoxExam05 extends Application{
	public Pane getpane(String color,int x, int y) {
		Pane p = new Pane();
		p.setStyle(color);
		p.setPrefSize(x, y);
		
		return p;
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox h = new HBox();

		h.setSpacing(10);
		h.setPrefSize(30, 70);
		
		List<Pane> paneList = new ArrayList<Pane>();
		paneList.add(getpane("-fx-background-color:blue;", 200, 150));
		paneList.add(getpane("-fx-background-color:red;", 50, 550));
		
		for(Pane p  : paneList) {
			h.getChildren().add(p);
		}
		
		Scene s = new Scene(h);

				
		primaryStage.setTitle("HboxExam");
		primaryStage.setScene(s);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
