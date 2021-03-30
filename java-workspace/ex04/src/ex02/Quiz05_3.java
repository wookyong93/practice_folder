package ex02;

import java.util.Scanner;

public class Quiz05_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 년도를 입력해주세요 : ");
		int year = sc.nextInt();
			System.out.println("=====================================");
			int age = 2020 - year ;
			//굳이 변수를 사용하지 않아도 된다.
			//int age = (2020-year)+1;
			System.out.println("당신의 현재 만 나이는 "+age+"세 입니다.");
			//System.out.printf ("당신의 현재 나이는 %d 세 입니다.\n",age )
			//System.out.println("당신의 나이는 " +(2020-year+1)+"입니다.");
			if (age >= 20) {
				System.out.println("성인입니다.");
			}else {
				System.out.println("미성년자입니다.");
			}
	}
}
