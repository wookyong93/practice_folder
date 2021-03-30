package Quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Quiz06 extends Application{
	public Pane getPane(String color,int x ,int y) {
		Pane p = new Pane();
		p.setStyle(color);
		p.setPrefSize(x, y);
		return p ;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox v = new VBox();
		v.setSpacing(20);
		v.setPadding(new Insets(20));
		HBox h = new HBox();
		h.setSpacing(20);
		h.setPadding(new Insets(20, 0, 20, 0));
		
		Pane p1 = new Pane();
		p1.setStyle("-fx-background-color:pink;");
		p1.setPrefSize(250, 100);
		Pane p2 = new Pane();
		p2.setStyle("-fx-background-color:gray;");
		p2.setPrefSize(250, 100);
		Pane p3 = new Pane();
		p3.setStyle("-fx-background-color:green;");
		p3.setPrefSize(120, 120);
		Pane p4 = new Pane();
		p4.setStyle("-fx-background-color:black;");
		p4.setPrefSize(120, 120);
		Pane p5 = new Pane();
		p5.setStyle("-fx-background-color:red;");
		p5.setPrefSize(250, 250);
		Pane p6 = new Pane();
		p6.setStyle("-fx-background-color:orange;");
		p6.setPrefSize(250, 100);
		
		h.getChildren().addAll(p3,p4);
		v.getChildren().addAll(p1,p2,h,p5,p6);
		
		HBox main = new HBox();
		main.getChildren().add(v);
		Scene s = new Scene(main,Color.YELLOW);
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(s);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
