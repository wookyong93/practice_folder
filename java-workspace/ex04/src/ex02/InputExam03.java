package ex02;

import java.util.Scanner;

public class InputExam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ex)String name = new String ("문자열");
		//system.in 으로 들어오는 문자를 sc 로 입력해주는 기능;
		System.out.print("이름 입력 \t: ");
		String name = sc.next();
		
		System.out.print("나이 입력 \t: ");
		int age = sc.nextInt();
		System.out.print("몸무게 입력 : ");
		double weight = sc.nextDouble();
		System.out.print("키 입력 : ");
		double height = sc.nextDouble();
		
		
		
		System.out.println("이름 \t: " + name);
		System.out.println("나이 \t: " + age);
		System.out.println("몸무게 \t: " + weight);
		System.out.println("키 \t : "+height);
		System.out.print("첫번째 수 입력 : ");
		int dv = sc.nextInt();
		System.out.print("두번쨰 수 입력 : ");
		int dc = sc.nextInt();
		System.out.print("세번째 수 입력 : ");
		int da = sc.nextInt();
		System.out.println("총합 :" +((int)+dv+dc+da));
	}
}
