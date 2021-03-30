package Lable;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LabelEx05 extends Application{

		@Override
		public void start(Stage primaryStage) throws Exception {
			// TODO Auto-generated method stub
			HBox h = new HBox(10);
			h.setPadding(new Insets(10));
			
			//Label  이미지 추가
			
			Image image = new Image(getClass().getResourceAsStream("/img/search.png"));
			Label lb1 = new Label("", new ImageView(image));
			
			
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
