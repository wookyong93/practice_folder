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
					System.out.println("���̻� ������ �� �����ϴ�.");
				}else {
					ui[count]=us.input(count);
					count++;
				}
				break;
			case 2 :
				if(us.serch(ui, count))
					
					System.out.println("ã�� ����ڰ� �����ϴ�.");
				break;
			case 3 : if(count == 0) {
				System.out.println("��ϵ� ����ڰ������ϴ�.");
			} else {
				us.output(ui, count);
			}
				break;
			case 0 : 
				System.out.println("���� �˴ϴ�.");
				break main ;
			default : 
				System.out.println("���� �޴��Դϴ�.");
			}
		}
	}
}
