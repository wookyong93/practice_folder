package Ex09.TilePane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneEx01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
			TilePane tile = new TilePane();
			tile.setHgap(8);
			tile.setPrefColumns(4);
			//scene�� ũ�⸦ �������� ������ 4���� �÷��� �������� ���ش�.
			
			
			for(int i = 0 ; i<20;i++) {
				tile.getChildren().add(new ImageView("/img/tmp.jpg"));
			}
			
			primaryStage.setTitle("TilePane Ex");
			primaryStage.setScene(new Scene(tile));
			primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
