package Ex07BorderPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneEx02 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane  borderPane = new BorderPane();
		Pane topPane = new Pane();
		FlowPane centerPane = new FlowPane();
		VBox vbox = new VBox();
		
		topPane.setStyle("-fx-background-color: linear-gradient(to bottom,BBBBCC 0% , #AAAAAA 100%);");
		topPane.setPrefSize(620, 120);
		
		vbox.setStyle("-fx-background-color : linear-gradient(to left,#E4F7BA 0%, #6B9900 100%);");
		vbox.setPrefSize(180, 560);
		
		borderPane.setTop(topPane);
		borderPane.setCenter(centerPane);
		borderPane.setLeft(vbox);
		
		primaryStage.setTitle("BorderPane EX");
		primaryStage.setScene(new Scene(borderPane,640,480));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
