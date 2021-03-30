package ex05;

import java.util.Scanner;

public class WhileExam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {//무한반복에 많이 사용됨 
			System.out.print("종료하려면 0 입력 : ");
			int i=sc.nextInt();
			if(i ==0) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
