package Ex01.Group;

import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

public class GrouopEx02 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g  = new Group();
		
		for(int i =0; i<5 ;i++) {
			Rectangle r =gabRectangle(i*20, i*20, 100 , 10,Color.RED);
			g.getChildren().add(r);
		}
		Scene scene = new Scene(g,300,200);
		primaryStage.setTitle("GroupEx");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public Rectangle gabRectangle(int i, int j, int k, int l, Color red) {
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










