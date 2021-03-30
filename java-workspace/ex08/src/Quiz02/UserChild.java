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
			System.out.println("프로그램을 종료합니다.");
			return;
		default : 
				System.out.println("없는 메뉴입니다.");
				
		}
	}
	
}
	Scanner sc = new Scanner(System.in);
	public void del(List <User> list) {
		System.out.println("삭제할 사용자 이름 : ");
		String name = sc.next();
		
			for(User u : list) {
				if(name.equals(u.getName())) {
					System.out.println("사용자 이름 : "+u.getName()+"님 계정을 탈퇴합니다.");
					list.remove(u);
					return;
				}
				
			}System.out.println("잘못입력되었습니다.");
	}
		public void allDel(List<User> list) {
			list.clear();
			System.out.println("전체 사용자 정보를 삭제하였습니다.");
		}
}
