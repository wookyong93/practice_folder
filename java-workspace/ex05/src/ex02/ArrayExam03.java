package ex02;

import java.util.Scanner;

public class ArrayExam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] cars;
		
		System.out.print("주차할 수 있는 차량수 : ");
		int num =sc.nextInt();
		cars = new int[num];
		System.out.println("주차할 수 있는 차량수는 "+cars.length+" 대 입니다.");
		
		String[] names = {"홍길동","이순신", "김유신"};
		for(int i = 0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		String[] str = new String[3];
		for(int i = 0; i<names.length;i++) {
			System.out.println(str[i]);
		}
		str[0]="유재석";
		str[1]="강호동";
		str[2]="신동엽";
		
				
;	}
}
