package Quiz;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Quiz02 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Text text = new Text(100,100,"Infiscap world!");
		//    new Text(x축 , y 축 , 입력 문자)
		text.setFont(new Font(20));
		//setfont(new font(폰트 크기))
		Scene scene = new Scene(new Group(text));
		//new scene(구성원,가로크기, 세로크기 )
		//scene (그룹으로 구성원 설정)
		primaryStage.setTitle("Quiz02");
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
