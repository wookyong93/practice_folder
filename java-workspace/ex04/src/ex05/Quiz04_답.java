package ex05;

import java.util.Scanner;

public class Quiz04_답 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	while(true) {	
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
			if(num>=1 && num<=9) {
				System.out.print("한자리수는 입력할 수 없습니다.");
			}else if(num ==0){
				System.out.println("종료합니다.");
				break;
			} else {
				while(true) {
					System.out.print(num%10);
					num /= 10 ;
					if(num ==0) {
						break;
					}
				}
			}System.out.println();
		}
	}
}
