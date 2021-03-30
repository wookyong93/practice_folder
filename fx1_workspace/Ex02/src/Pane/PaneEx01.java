package Pane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PaneEx01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		for(int i =0; i<5;i++) {
			Rectangle r= getRectangle(i*20,i*20,100,10, Color.RED);
			pane.getChildren().add(r);
		}
		Scene scene = new Scene(pane,300,200);
		primaryStage.setTitle("PaneEx");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	private Rectangle getRectangle(int i, int j, int k, int l, Color red) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.setX(i);
		r.setY(j);
		r.setWidth(k);
		r.setHeight(l);
		r.setFill(red);
		
		
		return r;
	}
	public static void main(String[] args) {
		launch(args);
	}
}
