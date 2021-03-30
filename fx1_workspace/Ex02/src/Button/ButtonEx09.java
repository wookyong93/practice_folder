package Button;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ButtonEx09 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane p = new BorderPane();
		HBox h = new HBox();
		
		Label lbl = new Label("Values");
		lbl.setFont(new Font("cambria",32));
		
		Button btn = new Button("Å¬¸¯");
		btn.setId("test");
		btn.setOnAction(e ->{
			lbl.setText(btn.getId());
		});
		h.getChildren().add(lbl);
		
		p.setTop(lbl);
		p.setCenter(btn);
		
		primaryStage.setTitle("Button Ex");
		primaryStage.setScene(new Scene(p,200,200));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
