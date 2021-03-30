package Quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService3 {
	Scanner sc = new Scanner(System.in);
	List<User> list = new ArrayList<>();
	
		public int menu() {
			System.out.println("1. 회원가입\n2. 회원검색\n3. 회원출력\n4. 회원탈퇴\n0.프로그램 종료");
			System.out.print("메뉴선택 : ");
			int menu =sc.nextInt();
			return menu;
		}
		public User input(List <User> list){
			System.out.print("ID 입력 : ");
			String id = sc.next();
			if(list.size() !=0) {
				for(User u : list) {
					if(id.equals(u.getId())) {
						System.out.println("중복된 ID 입니다.");
						return null;
					}
				}
			}
			User u= new User();
			
			u.setId(id);
			System.out.print("PW 입력 : ");
			u.setPw(sc.next());
			System.out.print("이름 입력 : ");
			u.setName(sc.next());
			System.out.print("나이 입력 : ");
			u.setAge(sc.nextInt());
			System.out.print("이메일 입력 : ");
			u.setEmail(sc.next());
			
			return u;
		}		
		public void serch(List<User> list) {
			System.out.print("검색할 id 입력 : ");
			String id = sc.next();
				for(User u : list) {
					if(id.equals(u.getId())) {
						System.out.println("ID : " + u.getId());
						System.out.println("PW : " + u.getPw());
						System.out.println("이름 : "+u.getName());
						System.out.println("나이 : "+u.getAge()+"세");
						System.out.println("이메일 : "+u.getEmail());
						return;
					}
				}System.out.println("찾는 id가 업습니다.");
		}
		
		public void remove(List<User> list) {
			System.out.print("탈퇴할 id 입력 : ");
			String id =sc.next();
			
				for(User u : list) {
					if(id.equals(u.getId())) {
						System.out.println("id : " + u.getId()+"의 정보를 삭제합니다.");
						list.remove(u);
					return;
					}
				}System.out.println("탈퇴할 id 가 업습니다.");
		}
		public void output(List<User> list) {
			for(User u : list) {
				System.out.println("ID : " + u.getId());
				System.out.println("PW : " + u.getPw());
				System.out.println("이름 : "+u.getName());
				System.out.println("나이 : "+u.getAge()+"세");
				System.out.println("이메일 : "+u.getEmail());
				System.out.println("===========================");
			}
		}
}
