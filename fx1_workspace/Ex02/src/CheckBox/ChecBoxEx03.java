package CheckBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChecBoxEx03 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(10));
		
		CheckBox chk1 = new CheckBox();
		CheckBox chk2 = new CheckBox();
		
		//���ڸ� ���� ����
		chk1.setText("����");
		chk2.setText("����");
		
		// �⺻ ���� �Ǵ°� �̸� ������ �����ϴ�.
		chk2.setSelected(true);
		
		vbox.getChildren().addAll(chk1,chk2);
		vbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("CheckBox Ex");
		primaryStage.setScene(new Scene(vbox));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
