package ex04;

import java.util.Scanner;

public class Quiz01_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.print("1~9까지의 정수 입력 : ");
		
			int num =sc.nextInt();
			if(num>0 && num<10) {
				for (int i = num ; i <=10 ; i++)
				{
					System.out.print(i+" ");
				}
			}else {
				System.out.println("입력한값을 처리할 수 없습니다.");
				System.out.println("1~9까지의 수만 입력해주세요.");
			}
			System.out.println();
			System.out.println("=====================================");
			System.out.print("\n1~9까지의 정수 입력 : ");
			int num1 = sc.nextInt();
		
			if(num1 >0 && num1<10) {
				System.out.print("10~19까지의 정수 입력 : ");
				int num2 = sc.nextInt();
				if(num2>=10 && num2<20) {
					for (int i = num1; i <= num2 ; i++)
					{
						System.out.print(i+" ");
					}
				}else {
					System.out.println("두번째 정수범위를 잘못 입력하였습니다.");
				}
			}else {
				System.out.println("첫번재 정수범위를 잘못 입력하였습니다.");
			}
	}
}
