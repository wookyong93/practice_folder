package ex01;

import java.util.Scanner;

public class RefExam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �̸� : ");
		String name1 = sc.next();
		System.out.println("�ι��� �̸� : ");
		String name2 = sc.next();
		
		if(name1 == name2 ) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
	}
}
