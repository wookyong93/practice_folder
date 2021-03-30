package Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonEx08 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane bp = new Pane();
		Button btn = new Button("Ŭ��");

		
		btn.setPrefSize(120, 40);
		btn.setLayoutX(20);
		btn.setLayoutY(20);
		btn.setOnAction(e -> {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("���");
			alert.setHeaderText("��ư�̺�Ʈ");
			alert.setContentText("��ư�� Ŭ���ϼ̽��ϴ�.");
			alert.show();
		});
		
		
		//��ư ��Ÿ�� �߰�
		
		btn.setStyle("-fx-font : 22 arial; -fx-base : #b6e7c9");
		
		DropShadow shadow = new DropShadow();
		
		btn.addEventHandler(MouseEvent.MOUSE_ENTERED, e->{
				btn.setEffect(shadow);
		});
		btn.addEventHandler(MouseEvent.MOUSE_EXITED, e->{
				btn.setEffect(null);
			});
		
		bp.getChildren().add(btn);
		
		primaryStage.setTitle("Button Ex");
		primaryStage.setScene(new Scene(bp,160,80));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
