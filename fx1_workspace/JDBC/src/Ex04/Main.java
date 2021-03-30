package Ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import Ex04.DAO.MemberServiceImpl;
import Ex04.DAO.Memberservice;
import Ex04.DTO.Member;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		Ex04.DAO.Memberservice memService = new Ex04.DAO.MemberServiceImpl();
		List<Member> memberList = new ArrayList<Member>();
		String id;
		boolean bl;
		while(true) {
			System.out.println("1. 회원 가입 2. 회원 수정 "
					+ "3. 회원 삭제 4. 회원 출력 5.회원 검색 0. 종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("아이디 입력 : ");
				member.setId(sc.next());
				bl = memService.checkId(member.getId());
				if (bl) {
					System.out.println("중복된 아이디가 있습니다.");
				} else {
					System.out.print("암호 입력 : ");
					member.setPwd(sc.next());
					System.out.print("이름 입력 : ");
					member.setName(sc.next());
					System.out.print("나이 입력 : ");
					member.setAge(sc.nextInt());
					System.out.println("입력되었습니다.");
					memService.insert(member);
				}
				break;
			case 2:
				System.out.print("수정할 아이디 입력 : ");
				member.setId(sc.next());
				bl = memService.checkId(member.getId());
				if(bl) {
					System.out.print("암호 입력 : ");
					member.setPwd(sc.next());
					System.out.print("이름 입력 : ");
					member.setName(sc.next());
					System.out.print("나이 입력 : ");
					member.setAge(sc.nextInt());
					
					memService.update(member);
				} else {
					System.out.println("수정할 아이디가 없습니다.");
				}
				break;
			case 3:
				System.out.print("삭제할 아이디 입력 : ");
				id = sc.next();
				bl = memService.checkId(id);
				if(bl) {
					memService.delete(id);
				} else {
					System.out.println("삭제할 아이디가 없습니다.");
				}
				break;
			case 4:
				memberList = memService.select();
				if(memberList.size() != 0) {
					for(Member m : memberList) {
						System.out.println("아이디 : " + m.getId());
						System.out.println("암호 : " + m.getPwd());
						System.out.println("이름 : " + m.getName());
						System.out.println("나이 : " + m.getAge());
					}
				} else {
					System.out.println("출력할 회원이 없습니다.");
				}
				break;
			case 5 : 
				if(memService.checkMember()) {
				System.out.print("검색할 ID 입력 : ");
				id =sc.next();
				memService.search(id);
				}else {
					System.out.println("가입된 회원이 없습니다.");
				}
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

