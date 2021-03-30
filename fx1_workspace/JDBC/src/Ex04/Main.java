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
			System.out.println("1. ȸ�� ���� 2. ȸ�� ���� "
					+ "3. ȸ�� ���� 4. ȸ�� ��� 5.ȸ�� �˻� 0. ����");
			System.out.print("���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("���̵� �Է� : ");
				member.setId(sc.next());
				bl = memService.checkId(member.getId());
				if (bl) {
					System.out.println("�ߺ��� ���̵� �ֽ��ϴ�.");
				} else {
					System.out.print("��ȣ �Է� : ");
					member.setPwd(sc.next());
					System.out.print("�̸� �Է� : ");
					member.setName(sc.next());
					System.out.print("���� �Է� : ");
					member.setAge(sc.nextInt());
					System.out.println("�ԷµǾ����ϴ�.");
					memService.insert(member);
				}
				break;
			case 2:
				System.out.print("������ ���̵� �Է� : ");
				member.setId(sc.next());
				bl = memService.checkId(member.getId());
				if(bl) {
					System.out.print("��ȣ �Է� : ");
					member.setPwd(sc.next());
					System.out.print("�̸� �Է� : ");
					member.setName(sc.next());
					System.out.print("���� �Է� : ");
					member.setAge(sc.nextInt());
					
					memService.update(member);
				} else {
					System.out.println("������ ���̵� �����ϴ�.");
				}
				break;
			case 3:
				System.out.print("������ ���̵� �Է� : ");
				id = sc.next();
				bl = memService.checkId(id);
				if(bl) {
					memService.delete(id);
				} else {
					System.out.println("������ ���̵� �����ϴ�.");
				}
				break;
			case 4:
				memberList = memService.select();
				if(memberList.size() != 0) {
					for(Member m : memberList) {
						System.out.println("���̵� : " + m.getId());
						System.out.println("��ȣ : " + m.getPwd());
						System.out.println("�̸� : " + m.getName());
						System.out.println("���� : " + m.getAge());
					}
				} else {
					System.out.println("����� ȸ���� �����ϴ�.");
				}
				break;
			case 5 : 
				if(memService.checkMember()) {
				System.out.print("�˻��� ID �Է� : ");
				id =sc.next();
				memService.search(id);
				}else {
					System.out.println("���Ե� ȸ���� �����ϴ�.");
				}
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

