package Quiz02;


public class ScoreMain {
	public static void main(String[] args) {
		ScoreInfo si = new ScoreInfoImpl();
		while(true) {
			
			int menu = si.menu();
			switch(menu) {
			case 1 : 
				si.input();
				break;
			case 2 :
				si.output();
				break;
			case 0 : 
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
