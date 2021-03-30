package Quiz;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz04 extends Application {
	public Pane getPane(String color,int x, int y) {
		Pane p = new Pane();
		p.setStyle(color);
		p.setPrefSize(x, y);
		return p;
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox h1 = new HBox();
		HBox h2 = new HBox();
		VBox v = new VBox();
		h1.setSpacing(20);
		h1.setPadding(new Insets(20));
		h2.setSpacing(20);
		h2.setPadding(new Insets(20));
		v.setSpacing(10);
		
		
		
		List<Pane> list = new ArrayList<Pane>();
		
		list.add(getPane("-fx-background-color : blue;",200,200));
		list.add(getPane("-fx-background-color : red;",200,200));
		list.add(getPane("-fx-background-color : black;",300,200));
		
				for(Pane p :list) {
				h1.getChildren().add(p);
				h2.getChildren().add(p);
				}
				v.getChildren().addAll(h2,h1);
				
		Scene s = new Scene(v);
		primaryStage.setTitle("Quiz01");
		primaryStage.setScene(s);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
