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
					System.out.print("ID 입력 : ");
					String id = sc.next();
					
					boolean b1 = true;
					for(User u : list) {
						if(id.equals(u.getId())) {
							System.out.println("동일한 ID 가 존재합니다.");
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
						System.out.println("찾는 id 가 없습니다");
					}
					break;
				case 3 :
					if(list.isEmpty()) {
						System.out.println("저장된 데이터가 없습니다.");
					}else {
					us.output(list);}
					break;
				case 4 : 
					if(us.remove(list)) {
						System.out.println("삭제할 id가 없습니다.");
					}
					break;
				case 0 : 
					System.out.println("프로그램 종료");
					return;
				default : 
					System.out.println("없는 메뉴 입니다.");
				}
		}
	}
}
