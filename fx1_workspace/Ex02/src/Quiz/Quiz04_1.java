package Quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz04_1 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox vbox = new VBox();
		
		HBox h1 = new HBox();
		h1.setPadding(new Insets(10));
		// padding 을 줄때 위 오른쪽 아래 왼쪽 순으로 지정할 수 있다.
		//그냥 숫자만 쓰면 4방향을 모두 같은 값으로 처리한다.
		h1.setSpacing(10);
		//HBOX 내에 있는 객체간의 간격이 10씩 떨어지는 것
		
		HBox h2 = new HBox();
		h2.setPadding(new Insets(10));
		// padding 을 줄때 위 오른쪽 아래 왼쪽 순으로 지정할 수 있다.
		//그냥 숫자만 쓰면 4방향을 모두 같은 값으로 처리한다.
		h2.setSpacing(10);
		//HBOX 내에 있는 객체간의 간격이 10씩 떨어지는 것
		
		Pane p1 = new Pane();
		p1.setStyle("-fx-background-color : blue;");
		p1.setPrefSize(200, 150);
		
		Pane p2 = new Pane();
		p2.setStyle("-fx-background-color:red");
		p2.setPrefSize(200, 150);
		
		Pane p3 = new Pane();
		p3.setStyle("-fx-background-color:black");
		p3.setPrefSize(300, 200);
		
		h1.getChildren().addAll(p1,p2,p3);
		Pane p4 = new Pane();
		p4.setStyle("-fx-background-color : blue;");
		p4.setPrefSize(200, 150);
		
		Pane p5 = new Pane();
		p5.setStyle("-fx-background-color:red");
		p5.setPrefSize(200, 150);
		
		Pane p6 = new Pane();
		p6.setStyle("-fx-background-color:black");
		p6.setPrefSize(300, 200);
		
		h2.getChildren().addAll(p4,p5,p6);
		
		vbox.getChildren().addAll(h1,h2);
		
		Scene scene = new Scene(vbox);
		primaryStage.setTitle("HBox Quiz");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
