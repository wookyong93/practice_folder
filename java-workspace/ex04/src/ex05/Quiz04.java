package ex05;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		int in=0;
		Scanner sc = new Scanner(System.in);
	while(true) {	
		System.out.print("정수 입력 : ");
		int num =sc.nextInt();
		int i = 0;
			if(num >= 10) {
				while(num > 0) {
					i =num%10;
					System.out.print(i);
					num = num/10;
					if (num == 0) {
						System.out.println();
						System.out.print("종료하려면 0 입력 : ");
						num =sc.nextInt();
						break;
					}
				}
			}else {
					System.out.println("한자리 수는 입력할 수 없습니다.");
			}
		}
	}
}

