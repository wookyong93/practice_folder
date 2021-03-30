package Program.Main;

import Program.Controller.ScoreController;
import Program.Controller.ScoreControllerImpl;

public class Main {
	public static void main(String[] args) throws Exception {
		ScoreController ctrl = new ScoreControllerImpl();
		ctrl.start();
	}
}
