package ex;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객 이름 입력 : ");
		String name = sc.next();
		System.out.print("고객 등급 입력 : ");
		int rank = sc.nextInt();
		System.out.print("누적구매 횟수 입력 : ");
		int sale = sc.nextInt();
		System.out.print("당일 총 구매 금액 : ");
		int price = sc.nextInt();
		String gift = rank==1?"지급대상임" :sale>=5 ? "지급대상임" : price>=300000 ?"지급대상임" : "지급대상아님" ;
		double point = rank==1?price*0.03:price*0.01;
		System.out.println("이름 : "+name);
		System.out.println("고객 등급 : "+rank );
		System.out.println("누적 구매 횟수 : "+sale);
		System.out.println("당일 총 구매금액 : "+price);
		System.out.println(point);
		System.out.println("사은품 지급 여부 : "+gift);
		
		 
		
		
	}
}
