package Quiz03;

public class Exam {
	
	public static void main(String[] args) {
		
		UserScoreInfo usi = new UserScore();
		
		while(true) {
			
				int menu =usi.menu();
				
				switch(menu) {
				
				case 1 : 
					usi.input();
					break;
					
				case 2 : 
					usi.output();
					break;
					
				case 0 : 
					System.out.println("���α׷� ����");
					return;
					
				default : 
					System.out.println("���� �޴� �Դϴ�.");
				}
				
		}
		
	}
	
}
