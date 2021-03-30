package TextField;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextFieldEx02 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10));
		
		//�ؽ�Ʈ�ʵ忡 ���� ������ �ִ�.
//		TextField tf = new TextField("�����͸� �Է��ϼ���");
		TextField tf = new TextField();
		tf.setText("�����͸� �Է��ϼ���");
		//setText : ��
		
		TextField tf2 = new TextField();
		tf2.setPromptText("�����͸� �Է��ؾ� �մϴ�");
		//setPrompText : ���̵�
		tf2.setPrefSize(120, 40);
		
		hbox.getChildren().addAll(tf,tf2);
		
		hbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("TextField Ex");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
