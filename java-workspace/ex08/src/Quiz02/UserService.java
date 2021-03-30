package Quiz02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
	
	List<User> list =new ArrayList<>();
	Scanner sc =new Scanner(System.in);
	public int menu() {
		System.out.println("1. 회원가입\n2. 회원검색\n3. 회원출력\n4. 회원탈퇴\n5. 전체탈퇴\n0. 프로그램종료");
		System.out.print("메뉴선택 : ");
		int menu = sc.nextInt();
		return menu;
	}
	public User input(List <User> list) {
		System.out.print("ID 입력 : ");
		String id = sc.next();
			if(list.size() != 0 ) {
				for(User u:list) {
					if(id.equals(u.getId())) {
						System.out.println("중복된 ID 입니다.");
						return null;
					}
				}
			}
			
				User u = new User();
				u.setId(id);
				System.out.print("PW 입력 : ");
				u.setPwd(sc.next());
				System.out.print("이름 입력 : ");
				u.setName(sc.next());
				System.out.print("나이 입력 : ");
				u.setAge(sc.nextInt());
				return u;
	}
	public void serch(List <User> list) {
		System.out.print("검색할 이름 : ");
		String name = sc.next();
			for(User u : list) {
				if(name.equals(u.getName())) {
					System.out.println("ID : "+u.getId());
					System.out.println("PW : "+u.getPwd());
					System.out.println("이름 : "+u.getName());
					System.out.println("나이 : "+u.getAge());
					return;
				}
			}System.out.println("ID가 존재 하지 않습니다.");
	}
	public void output(List<User> list) {
		for(User u : list) {
			System.out.println("ID : "+u.getId());
			System.out.println("PW : "+u.getPwd());
			System.out.println("이름 : "+u.getName());
			System.out.println("나이 : "+u.getAge());
			System.out.println();
		}
		
	}
	public void delete(List<User> list) {
		System.out.println("삭제할 아이디 입력 : ");
		String id = sc.next();
			for(User u : list) {
				if(id.equals(u.getId())) {
					System.out.println(id+"님을 삭제합니다.");
					list.remove(u);
					return;
				}
			}System.out.println("삭제할 ID 를 찾을 수 없습니다.");
	}
	public void deleteAll(List<User> list){
		String select;
		do {
		System.out.println("전체 삭제 합니다 . 삭제하시겠습니까 ? (y/n)");
		select = sc.next();
		if(select.equals("Y")|| select.equals("y")) {
			System.out.println("전체 삭제 합니다.");
			list.clear();
		}else if (select.equals("n")||select.equals("N")) {
			System.out.println("전체삭제를 취소합니다.");
		}else {
			System.out.println("잘못된 선택입니다.");
		}
		}while(!select.equals("Y") && !select.equals("y") && !select.equals("n") && !select.equals("N"));
	}
	
}
