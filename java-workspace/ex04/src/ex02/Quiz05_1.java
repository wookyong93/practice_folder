package ex02;

import java.util.Scanner;

public class Quiz05_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		System.out.println();
		System.out.println("===================================");
		System.out.println();	
//		if (num<=100 && num >= 90) {
//				System.out.println("����� A �Դϴ�.");
//			}else if(num>=80 && num<=89){
//				System.out.println("����� B �Դϴ�.");
//			}else if(num>=70 && num<=79){
//				System.out.println("����� C �Դϴ�.");
//			}else if(num>=60 && num<=69){
//				System.out.println("����� D �Դϴ�.");
//			}else if(num>=0 && num<=59){
//				System.out.println("����� F �Դϴ�.");
//			}else {
//				System.out.println("�߸� �Է� �Ǿ����ϴ�.");
//			}
		if (num >=0 && num<=100) {
			if(num >= 90) {
				System.out.println("A����");
			}else if (num>=80) {
					System.out.println("B����");
			}else if(num>=70) {
						System.out.println("C����");
			}else if(num >= 60) {
							System.out.println("D����");
						}else {
							System.out.println("F����");
						}
		}else {
			System.out.println("�߸��� �����Դϴ�.");
		}
			
	}	
}	
