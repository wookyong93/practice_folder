package ex01;

import java.util.Scanner;

public class Quiz01_�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = "test";
		String pwd = "1234";
		System.out.print("id : ");
		String log_id = sc.next();
		System.out.print("pwd : ");
		String log_pwd = sc.next();
		
//		if(id.equals(log_id)) {
//			if(pwd.equals(log_pwd)) {
//				System.out.println("�α��� ����");
//			}else {
//				System.out.println("��ȣ Ʋ��");
//			}
//		}else {
//			System.out.println("���� ���̵�");
//		}
		if(id.equals(log_id)&&pwd.equals(log_pwd)) {
			System.out.println("�α��μ���");
		}else if(id.equals(log_id) && !pwd.equals(log_pwd)) {
			System.out.println("��ȣ Ʋ��");
		}else {
			System.out.println("���� ���̵�");
		}
	}
}
