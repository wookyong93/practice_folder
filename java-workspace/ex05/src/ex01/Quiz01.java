package ex01;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String id = "test";
		String pwd="1234";
		while(true) {
		System.out.print("id : ");
		String id2 = sc.next();
		System.out.print("pwd : ");
		String pwd2 = sc.next();
		if(id.equals(id2) && pwd.equals(pwd2)) {
			System.out.println("�α��� ����");
			break;
		}else if(id.equals(id2) && pwd != pwd2) {
		System.out.println("��ȣ Ʋ��");
		continue;
		}else if (id != id2 ) {
			
		System.out.println("���� ���̵��Դϴ�.");
		continue;
		}
	   }
	}
}
