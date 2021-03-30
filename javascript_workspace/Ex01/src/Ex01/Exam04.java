package Ex01;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int i = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int j=sc.nextInt();
	
		if(i>j) {
			System.out.println(i);
		}else {
			System.out.println(j);
		}
	
	}
}
