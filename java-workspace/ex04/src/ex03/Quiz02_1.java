package ex03;

import java.util.Scanner;

public class Quiz02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		if(num != 0) {
		switch(num%6) {
			case 0 : 
				System.out.println("2와 3의 배수 입니다.");
				break;
			case 2 :
			case 4 :
				System.out.println("2의 배수 입니다.");
				break;
			//동일문자열을 출력할때 case 번호를 둘다 써줄수있다.
				
			case 3:
				System.out.println("3의 배수 입니다.");
				break;
			
			default:
				System.out.println("2와 3의 배수가 아닙니다.");
			}
		} else {
			System.out.println("0은 배수가 아닙니다.");
		}
	
			switch(num%6) {
				case 0 : 
					if(num == 0) {
						System.out.println("0은 배수가 아닙니다.");
					}else {
					System.out.println("2와 3의 배수 입니다.");
					}
					break;
				case 2 :
				case 4 :
					System.out.println("2의 배수 입니다.");
					break;
				//동일문자열을 출력할때 case 번호를 둘다 써줄수있다.
					
				case 3:
					System.out.println("3의 배수 입니다.");
					break;
				
				default:
					System.out.println("2와 3의 배수가 아닙니다.");
				}
		
	}
}
	