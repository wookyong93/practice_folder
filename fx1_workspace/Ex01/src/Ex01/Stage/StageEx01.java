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
		 // Scene�� �̿��ؼ� ũ�� ����
	      BorderPane root = new BorderPane();
	      // BorderPane -> Scene �� �����ϴ� ������
	      Scene scene = new Scene(root, 300, 200);
	      // Scene �� ȭ���� �����ϴ� ����
	      // new Scene(������, ����, ����)
	      
	      primaryStage.setTitle("primaryStage");
	      primaryStage.setScene(scene);
	      // setScene �� Stage �� Scene �� �߰��ϴ� �޼���

		primaryStage.show();
	}
}
