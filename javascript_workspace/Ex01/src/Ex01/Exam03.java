package Ex01;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번쨰 정수 입력 :");
		int i = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int j = sc.nextInt();
		
		System.out.println("두 값의 합 : " +(i+j));
	}
}
