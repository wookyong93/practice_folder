package Quiz02;

import java.util.List;
import java.util.Scanner;

public class UserChild extends UserParent{
public static void main(String[] args) {
	while(true) {
		int menu = service.menu();
//		 UserParent up = new UserParent();
		 UserChild uc = new UserChild();
		 switch(menu) {
		
         case 1:
            uc.input(list);
            break;
         case 2:
            uc.search(list);
            break;
         case 3:
            uc.output(list);
            break;
         case 4 : 
        	 uc.del(list);
			break;
		case 5 : 
			uc.allDel(list);
			break;
		case 0 : 
			System.out.println("���α׷��� �����մϴ�.");
			return;
		default : 
				System.out.println("���� �޴��Դϴ�.");
				
		}
	}
	
}
	Scanner sc = new Scanner(System.in);
	public void del(List <User> list) {
		System.out.println("������ ����� �̸� : ");
		String name = sc.next();
		
			for(User u : list) {
				if(name.equals(u.getName())) {
					System.out.println("����� �̸� : "+u.getName()+"�� ������ Ż���մϴ�.");
					list.remove(u);
					return;
				}
				
			}System.out.println("�߸��ԷµǾ����ϴ�.");
	}
		public void allDel(List<User> list) {
			list.clear();
			System.out.println("��ü ����� ������ �����Ͽ����ϴ�.");
		}
}
