package Quiz02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserParent_�� {
	static UserService service = new UserService();
	static List<User> list =new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public void input(List<User> list) {
		service.input(list);
	}
	   public void search(List<User> list) {
		      if(list.size() == 0) {
		         System.out.println("�Էµ� ������ �����ϴ�.");
		      } else {
		         service.serch(list);
		      }
		   }
		   public void output(List<User> list) {
		      if (list.size() == 0) {
		         System.out.println("�Էµ� ������ �����ϴ�.");
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
	            System.out.println("���α׷� ����");
	            return;
	         default:
	            System.out.println("�߸� ���õ� �޴� �Դϴ�.");
	         }
	      }
	}
}
