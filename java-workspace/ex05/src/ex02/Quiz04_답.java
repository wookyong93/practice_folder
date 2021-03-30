package ex02;

import java.util.Scanner;

public class Quiz04_답 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("입고될 품명의 수 : ");
		int num =sc.nextInt();
		String[] product = new String[num];
		int[] order = new int[num];
		
		for(int i = 0 ; i < num ;i++) {
			System.out.print((i+1)+"번째 입고 품목명 : ");
			product[i] = sc.next();
		}
		for(int i=0; i<num;i++) {
			System.out.print((i+1 )+". "+product[i]+" ");
		}
		System.out.println();
		
		for(int i = 0 ; i<num;i++) {
			System.out.println((i+1)+"번째 순서 : ");
			order[i] = sc.nextInt()-1;
		}
		
		for (int i=0;i<num;i++) {
			System.out.println((i+1)+"번쨰 입고 품목 : "+ product[order[i]]);
		}
		
	}
}
