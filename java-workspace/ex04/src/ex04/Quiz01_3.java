package ex04;

import java.util.Scanner;

public class Quiz01_3 {
	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.print("정 수 입 력 : ");
//		int num = sc.nextInt();
		System.out.println("A ~ Z 까지 출력");
		char ch = 'A';
		int ch2 = 65;
//		for(int i=0; i<26; i++) {
//		System.out.print((char) (ch+i) +" ");
//			System.out.print((char)(ch2+i)+" ");
//		}
		for(int i=65;i<=90;i++) {
			System.out.print((char)i+" ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println("입력하신 정수의 구구단");
		
		for (int i=1;i<=9;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
			//int sum = num*i;
			//System.out.println(num+"*"+i+"="+sum); or
			//System.out.printf("%d * %d = %d \n",num,i,sum);
		}
				
	}
}
