package Quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <User> list = new ArrayList<>();
		UserService  us = new UserService();
		
		while(true) {
			int menu = us.menu();
				switch(menu){
				case 1 : 
					System.out.print("ID �Է� : ");
					String id = sc.next();
					
					boolean b1 = true;
					for(User u : list) {
						if(id.equals(u.getId())) {
							System.out.println("������ ID �� �����մϴ�.");
							b1 = false;
							break;
						}
					}
					if(b1){
						list.add(us.input(id));
					}
					break;
				case 2 :  
					if(us.serch(list)) {
						System.out.println("ã�� id �� �����ϴ�");
					}
					break;
				case 3 :
					if(list.isEmpty()) {
						System.out.println("����� �����Ͱ� �����ϴ�.");
					}else {
					us.output(list);}
					break;
				case 4 : 
					if(us.remove(list)) {
						System.out.println("������ id�� �����ϴ�.");
					}
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
