package ex04;

import java.util.Scanner;

public class Quiz01_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("별 갯수 입력 : ");
		 int num = sc.nextInt();
			for(int i = 1 ;i <= num ;i ++) {
				System.out.print('☆');
			}
			System.out.println();
			System.out.print("반복 횟수 입력 : ");
			int num1 = sc.nextInt();
			
			String H = "Hello";
			for(int i = 1 ; i <= num1 ; i++) {
			// int i = 1 :시작 i<= num1 : 입력한만큼의 반복 i++ : 반복할때마다 올라가는 갯수 
				System.out.println(H);//1 ~ num1 까지의 반복 출력
				// ex > num =8 이면 8번 반복 되어 출력;
			}
	}
}
