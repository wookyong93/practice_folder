package Quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain_�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <User> list = new ArrayList<>();
		UserService_��  us = new UserService_��();
	
		
		while(true) {
			int menu = us.menu();
				switch(menu){
				case 1 :
					String id = us.check();
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
					System.out.println("======����� �˻� ======");
					if(list.size() ==0) {
						System.out.println("����� ������ �����ϴ�.");
					}else{us.serch(list);}
					break;
				case 3 :
					System.out.println("======����� ��� ======");
					if(list.size()==0) {
						System.out.println("����� ������ �����ϴ�.");
					}else{us.output(list);}
					break;
				case 4 : 
					System.out.println("======����� ���� ======");
					if(list.size()==0) {
						System.out.println("����� ������ �����ϴ�.");
					}else{us.remove(list);}
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
