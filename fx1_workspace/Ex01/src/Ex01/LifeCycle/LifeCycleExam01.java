package Ex01.LifeCycle;

import javafx.application.Application;
import javafx.stage.Stage;

public class LifeCycleExam01 extends Application{
	public LifeCycleExam01() {
		// TODO Auto-generated constructor stub
		System.out.println(Thread.currentThread().getName()+": 생성자 호출");
	}
	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
		System.out.println(Thread.currentThread().getName() +" : init 메서드 호출");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() +" : start 메서드 호출");
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName()+" : stop 메서드 호출");
		super.stop();
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+":main() 호출");
		launch(args);
	}
}
