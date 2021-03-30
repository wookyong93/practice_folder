package ex03;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 10 ;
		int num2 = 0;
		if(num2!=0) {
			System.out.println(num1/num2);
		}else {
			System.out.println("나눌 수 없습니다.");
		}
		System.out.println("정수 입력 : ");
		
		int var = sc.nextInt();
		if(var !=0) {
			System.out.println("");
		}
	}
}
