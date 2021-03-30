package Ex05.AnchoarPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneEx01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		AnchorPane anchorPane = new AnchorPane();
		
		ListView<String> list = new ListView<String>();
		
		AnchorPane.setTopAnchor(list, 10.0);
		AnchorPane.setLeftAnchor(list, 10.0);
		AnchorPane.setRightAnchor(list, 60.0);
		AnchorPane.setBottomAnchor(list, 10.0);
		
		Button button = new Button("Add");
		
		AnchorPane.setTopAnchor(button, 10.0);
		AnchorPane.setRightAnchor(button, 10.0);
		
		anchorPane.getChildren().addAll(list,button);
		primaryStage.setTitle("anchorPaneEx");
		primaryStage.setScene(new Scene(anchorPane,300,250));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
