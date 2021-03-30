package Quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain_답 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <User> list = new ArrayList<>();
		UserService_답  us = new UserService_답();
	
		
		while(true) {
			int menu = us.menu();
				switch(menu){
				case 1 :
					String id = us.check();
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
					System.out.println("======사용자 검색 ======");
					if(list.size() ==0) {
						System.out.println("저장된 정보가 없습니다.");
					}else{us.serch(list);}
					break;
				case 3 :
					System.out.println("======사용자 출력 ======");
					if(list.size()==0) {
						System.out.println("저장된 정보가 업습니다.");
					}else{us.output(list);}
					break;
				case 4 : 
					System.out.println("======사용자 삭제 ======");
					if(list.size()==0) {
						System.out.println("저장된 정보가 업습니다.");
					}else{us.remove(list);}
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
