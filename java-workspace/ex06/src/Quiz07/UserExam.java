package Quiz07;

public class UserExam {
	public static void main(String[] args) {
		UserInfo[] ui = new UserInfo[5];
		int count = 0;
		UserService us = new UserService();
	main : while(true) {
		int menu = us.menu();
		
			switch(menu) {
			case 1 :
				if(count == 5) {
					System.out.println("더이상 저장할 수 없습니다.");
				}else {
					ui[count]=us.input(count);
					count++;
				}
				break;
			case 2 :
				if(us.serch(ui, count))
					
					System.out.println("찾는 사용자가 없습니다.");
				break;
			case 3 : if(count == 0) {
				System.out.println("등록된 사용자가없습니다.");
			} else {
				us.output(ui, count);
			}
				break;
			case 0 : 
				System.out.println("종료 됩니다.");
				break main ;
			default : 
				System.out.println("없는 메뉴입니다.");
			}
		}
	}
}
