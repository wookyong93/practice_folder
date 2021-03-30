package ex02;

import java.util.Scanner;

public class Quiz03_답 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.print("입고된 과일 품목 수 입력 : ");
	int num = sc.nextInt();
	
	int[] fruits =new int[num];
	
	String[] fruitsname = {"딸기","수박","바나나","체리","귤"};
	
	System.out.println("1. 딸기\n2. 수박\n3. 바나나\n 4.체리\n5. 귤");
		for(int i =0; i<fruits.length;i++) {
			System.out.println((i+1)+"번째 입고 품목 : ");
			fruits[i] = sc.nextInt()-1;
			
		}
		for(int i =0; i<fruits.length;i++) {
			System.out.println((i+1)+"번쨰 입고된 품목 : "+fruitsname[fruits[i]]);
		}
	}
}
