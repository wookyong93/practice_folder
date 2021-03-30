package ComboBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ComboBoxEx01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10));
		
		ComboBox<String> cb = new ComboBox<String>();
		cb.getItems().addAll("크라이밍","서핑","바이크","바둑");
		cb.setValue("취미");
		
		hbox.getChildren().add(cb);
		hbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("ComboBox EX");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
