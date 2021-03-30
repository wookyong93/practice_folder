package ex02;

import java.util.Scanner;

public class Quiz05_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int num = sc.nextInt();
		System.out.println();
		System.out.println("===================================");
		System.out.println();	
//		if (num<=100 && num >= 90) {
//				System.out.println("당신은 A 입니다.");
//			}else if(num>=80 && num<=89){
//				System.out.println("당신은 B 입니다.");
//			}else if(num>=70 && num<=79){
//				System.out.println("당신은 C 입니다.");
//			}else if(num>=60 && num<=69){
//				System.out.println("당신은 D 입니다.");
//			}else if(num>=0 && num<=59){
//				System.out.println("당신은 F 입니다.");
//			}else {
//				System.out.println("잘못 입력 되었습니다.");
//			}
		if (num >=0 && num<=100) {
			if(num >= 90) {
				System.out.println("A학점");
			}else if (num>=80) {
					System.out.println("B학점");
			}else if(num>=70) {
						System.out.println("C학점");
			}else if(num >= 60) {
							System.out.println("D학점");
						}else {
							System.out.println("F학점");
						}
		}else {
			System.out.println("잘못된 점수입니다.");
		}
			
	}	
}	
