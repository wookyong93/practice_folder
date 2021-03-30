package ex02;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입고될 품목의 수 :");
		int num =sc.nextInt();
		String [] fru = new String [num];
		
			for (int i =0;i <fru.length;i++) {
				System.out.println((i+1)+"번째  품목 입력 : ");
				fru[i]=sc.next();
				}
			for(int i=0 ; i <fru.length;i++) {
				System.out.println((i+1)+"번째 입고 품목 : "+fru[i]);
			}
			System.out.println("입고시킬 수량 입력 : ");
			num = sc.nextInt();
			
			System.out.println("입고될 품목 번호 입력 ");
			int[] pick = new int[num] ;
			for(int i = 0; i<pick.length;i++) {
				System.out.println((i+1)+"번째 입고될 품목 : ");
				pick[i] = sc.nextInt()-1;
			}
			for(int i = 0; i<pick.length;i++)
			System.out.println((i+1)+"번째 입고된 품목 : "+fru[pick[i]]);
	}
	
}
