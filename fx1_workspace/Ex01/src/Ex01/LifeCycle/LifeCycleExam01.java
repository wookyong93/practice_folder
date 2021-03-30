package Ex01.LifeCycle;

import javafx.application.Application;
import javafx.stage.Stage;

public class LifeCycleExam01 extends Application{
	public LifeCycleExam01() {
		// TODO Auto-generated constructor stub
		System.out.println(Thread.currentThread().getName()+": ������ ȣ��");
	}
	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
		System.out.println(Thread.currentThread().getName() +" : init �޼��� ȣ��");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() +" : start �޼��� ȣ��");
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName()+" : stop �޼��� ȣ��");
		super.stop();
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+":main() ȣ��");
		launch(args);
	}
}
