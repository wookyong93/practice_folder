package ex03;

import java.util.Scanner;

public class Quiz02_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
//		if(num%6 == 2 || num%6 == 4) =(num%2 == 0){
//				System.out.println("2의 배수입니다.");
//			}else if(num%6 == 3){
//				System.out.println("3의 배수입니다.");
//			}else if(num%6 == 0) {
//				System.out.println("2와 3의 배수입니다.");
//			}else {
//				System.out.println("2와 3의 배수가아닙니다.");
//			}
		if(num%6 ==0) {
			System.out.println("2와 3의 배수입니다.");
		}else if (num%2 == 0) {
			System.out.println("2의 배수입니다.");
		}else if (num%3 == 0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("2나 3의 배수가 아닙니다.");
		}
	}
}
