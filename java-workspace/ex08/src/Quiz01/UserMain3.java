package Quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <User> list = new ArrayList<>();
		UserService3 us = new UserService3 ();
	
		
		while(true) {
			int menu = us.menu();
				switch(menu){
				case 1 :
					User u= us.input(list);
					if(u != null) {
					list.add(u);
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
