package ex01;

import java.util.Scanner;

public class RefExam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 이름 : ");
		String name1 = sc.next();
		System.out.println("두번쨰 이름 : ");
		String name2 = sc.next();
		
		if(name1 == name2 ) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
	}
}
