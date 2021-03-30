package Quiz02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserParent_답 {
	static UserService service = new UserService();
	static List<User> list =new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public void input(List<User> list) {
		service.input(list);
	}
	   public void search(List<User> list) {
		      if(list.size() == 0) {
		         System.out.println("입력된 정보가 없습니다.");
		      } else {
		         service.serch(list);
		      }
		   }
		   public void output(List<User> list) {
		      if (list.size() == 0) {
		         System.out.println("입력된 정보가 없습니다.");
		      } else {
		         service.output(list);
		      }
		   }
	public static void main(String[] args) {
		 UserParent up = new UserParent();
		 
	      while(true) {
	         int menu = service.menu();
	         
	         switch(menu) {
	         case 1:
	            up.input(list);
	            break;
	         case 2:
	            up.search(list);
	            break;
	         case 3:
	            up.output(list);
	            break;
	         case 0:
	            System.out.println("프로그램 종료");
	            return;
	         default:
	            System.out.println("잘못 선택된 메뉴 입니다.");
	         }
	      }
	}
}
