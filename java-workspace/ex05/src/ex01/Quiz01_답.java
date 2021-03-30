package ex01;

import java.util.Scanner;

public class Quiz01_답 {
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
//				System.out.println("로그인 성공");
//			}else {
//				System.out.println("암호 틀림");
//			}
//		}else {
//			System.out.println("없는 아이디");
//		}
		if(id.equals(log_id)&&pwd.equals(log_pwd)) {
			System.out.println("로그인성공");
		}else if(id.equals(log_id) && !pwd.equals(log_pwd)) {
			System.out.println("암호 틀림");
		}else {
			System.out.println("없는 아이디");
		}
	}
}
