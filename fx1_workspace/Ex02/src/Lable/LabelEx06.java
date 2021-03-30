package Lable;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LabelEx06 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox h = new HBox(10);
		h.setPadding(new Insets(10));
		
	
		Label lb1 = new Label("Search");
		Image image = new Image(getClass().getResourceAsStream("/img/search.png"));
		//이미지 추가-생성자를 이용하지 않아도 추가 할 수 있다.
		lb1.setGraphic(new ImageView(image));
		lb1.setTextFill(Color.RED);
		
		
		h.getChildren().add(lb1);
		h.setPrefSize(300, 200);
		primaryStage.setTitle("Label ex");
		primaryStage.setScene(new Scene(h));
		primaryStage.show();
}

public static void main(String[] args) {
	launch(args);
}
}
