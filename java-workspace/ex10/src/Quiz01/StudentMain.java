package Quiz01;

public class StudentMain {
	public static void main(String[] args) {
		StudentInfo si = new StudentInfoImpl();
		while(true) {
		int menu = si.menu();
			switch(menu) {
			case 1 : 
				si.Input();
				break;
			case 2 : 
				si.serch();
				break;
			case 3 : 
				si.outPut();
				break;
			case 4 : 
				si.modify();
				break;
			case 5 : 
				si.delete();
				break;
			case 0 :  
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("없는 메뉴입니다.");
			}
		}
	}
}
