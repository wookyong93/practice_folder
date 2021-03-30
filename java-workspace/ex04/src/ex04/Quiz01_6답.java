package ex04;

import java.util.Scanner;

public class Quiz01_6답 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
			if(num>=0 && num<=100) {
				// 0~ 100까지의 수
				int tmp = num%10;
				String str =null;
				if(num<50) {
					str = "LOW";
				}else if (num>=50) 
				{// 50~100
					str = "HI";}
			
			if(tmp==0) {
				System.out.println(str);
					}else {
							for(int i=0;i<tmp;i++) 
							{
								System.out.println(str);
							}
			}
		}else {
				System.out.println("범위가 벗어났습니다.");
			}
	}
}
