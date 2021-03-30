package ex02;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int var1 = sc.nextInt();
		
		if (var1 > 0 ) {
			System.out.println("입력하신 값은 양수 입니다.");
		}else if(var1 < 0) {
			System.out.println("입력하신 값은 음수 입니다.");	
		}else if(var1 == 0) {
			System.out.println("입력하신 0은 양수도 음수도 아닙니다.");
		}

	}
	
}
