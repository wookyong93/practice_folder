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
				System.out.println("����");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
}
