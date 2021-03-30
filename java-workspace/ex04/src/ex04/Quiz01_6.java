package ex04;

import java.util.Scanner;

public class Quiz01_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num =sc.nextInt();
			if(num>=0 && num<=100) {
				int var = num%10;
					if(num<50) {
							if(var >0) {
							for(int i=0;i<var;i++) {											
									System.out.print("LOW ");
								}
						}else if(var==0){
							System.out.print("LOW ");
						}
			}
			if(num>=50) {
				if(var >0) {
						for(int i=0;i<var;i++) {
							System.out.print("HI ");
						}
						}else if(var == 0) {
						System.out.print("HI ");
					}	
				}
			
			}else {
				System.out.println("입력이 잘못 되었습니다.");
				System.out.println("정수의 값은 0 ~ 100으로 입력해주세요");
			}
		}
			
	
}
