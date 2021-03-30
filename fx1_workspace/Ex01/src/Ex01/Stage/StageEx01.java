package Ex01.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StageEx01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		 // Scene을 이용해서 크기 조절
	      BorderPane root = new BorderPane();
	      // BorderPane -> Scene 을 구성하는 구성원
	      Scene scene = new Scene(root, 300, 200);
	      // Scene 은 화면을 구성하는 단위
	      // new Scene(구성원, 넓이, 높이)
	      
	      primaryStage.setTitle("primaryStage");
	      primaryStage.setScene(scene);
	      // setScene 은 Stage 에 Scene 을 추가하는 메서드

		primaryStage.show();
	}
}
