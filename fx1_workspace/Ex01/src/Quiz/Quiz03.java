package Quiz;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Quiz03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Text text = new Text(120,140,"Infiscap world!");
		text.setFont(new Font(35));
		
		Scene scene = new Scene(new Group(text),400,350);
		//BorderPane �� ��� ������ �⺻���̶� ,Text �� ��ǥ���� �����ϰԵȴ�.
		//Scene scene = new Scene(new BorderPane(text),400,350);
		primaryStage.setTitle("Qiuz03");
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
