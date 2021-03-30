package Quiz;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz04_답 extends Application {


	   @Override
	   public void start(Stage primaryStage) throws Exception {
	      // TODO Auto-generated method stub
	      VBox vbox = new VBox();
	      
	      List<HBox> hList = new ArrayList<HBox>();
	      List<Pane> pList = new ArrayList<Pane>();

	      hList.add(getHBox(10,10)); // hList[0];
	      hList.add(getHBox(10,10)); // hList[1];
	      
	      // hList[0]
	      pList.add(getPane("-fx-background-color:blue;", 200, 150));
	      pList.add(getPane("-fx-background-color:red;", 200, 150));
	      pList.add(getPane("-fx-background-color:black;", 300, 200));
	      // hList[1]
	      pList.add(getPane("-fx-background-color:blue;", 200, 150));
	      pList.add(getPane("-fx-background-color:red;", 200, 150));
	      pList.add(getPane("-fx-background-color:black;", 300, 200));
	      
//	      System.out.println(pList.size()); // 6
//	      System.out.println(hList.size()); // 2
//	      System.out.println(pList.size() / hList.size()); // 3
	      
//	      for(int i=0;i<hList.size();i++) { // 2번 실행
//	         for(int j=0; j< (pList.size()/hList.size());j++) { // 3번 실행
//	            hList.get(i).getChildren().add(pList.get(j+(pList.size()/hList.size())*i));
//	         }
//	      }
	      
	      for (int i=0;i<pList.size();i++) { // 6번 실행
	         hList.get(i/3).getChildren().add(pList.get(i));
	      }
	      
	      for (HBox h : hList) {
	         vbox.getChildren().add(h);
	      }
	      
	      Scene scene = new Scene(vbox);
	      
	      primaryStage.setTitle("HBox Quiz");
	      primaryStage.setScene(scene);
	      primaryStage.show();
	      
	   }
	   
	   private HBox getHBox(int i, int j) {
	      // TODO Auto-generated method stub
	      HBox h = new HBox();
	      h.setPadding(new Insets(i));
	      h.setSpacing(j);
	      return h;
	   }

	   private Pane getPane(String string, int i, int j) {
	      // TODO Auto-generated method stub
	      Pane p = new Pane();
	      p.setStyle(string);
	      p.setPrefSize(i, j);
	      return p;
	   }

	   public static void main(String[] args) {
	      launch(args);
	   }
}
