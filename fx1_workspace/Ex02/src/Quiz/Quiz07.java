package Quiz;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz07 extends Application{
	public void Mouseover(Label x){
		x.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				x.setScaleX(1.5);
				x.setScaleY(1.5);
				
			}
		});
		x.setOnMouseExited(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				x.setScaleX(1);
				x.setScaleY(1);
				
			}
		});
	}

	private static final Node lbl2 = null;
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox h = new HBox();
		h.setSpacing(30);
		Pane p = new Pane();
		
		
		
		Label lbl1 = new Label("Search");
		Image image = new Image(getClass().getResourceAsStream("/img/search.png"));
		lbl1.setFont(new Font(30));
		lbl1.setGraphic(new ImageView(image));
		lbl1.setTextFill(Color.BLUE);
		
		Label lbl2 = new Label("Valuese");
		lbl2.setFont(new Font(30));
		lbl2.setRotate(270);
		lbl2.setTranslateY(50);
		
		Label lbl3 = new Label("A lable that needs to be wrapped");
		lbl3.setWrapText(true);
		lbl3.setPrefSize(100,100);
		
		Mouseover(lbl1);
		Mouseover(lbl2);
		Mouseover(lbl3);
		
		h.getChildren().addAll(lbl1,lbl2,lbl3);
		
		
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(new Scene(h,600,200));
		primaryStage.show();
				
	}
	public static void main(String[] args) {
		launch(args);
	}
}
