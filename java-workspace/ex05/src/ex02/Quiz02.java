package ex02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입고할 수 있는 차량의 수 : ");
		int num = sc.nextInt();
		
		int[] cars = new int[num];
		
		String[] carname = {"승용차","SUV","화물차"};
				
		for(int i = 0; i<cars.length;i++) {
			//System.out.println("1. " +carname[0]+" 2. "+carname[1]+ " 3 . "+carname[2]);
			for(int j = 0;j<carname.length;j++) {
				System.out.print((j+1)+". "+carname[j]+" ");
			}
			System.out.println();
			System.out.print((i+1)+"번째 입고 차량 : ");
//			cars[i] =sc.nextInt();
			cars[i] =sc.nextInt()-1;
			
		}
		System.out.println();
		for(int i =0 ; i<cars.length;i++) {
//			System.out.println((i+1)+"번쨰 입고된 차량 : " + carname[(cars[i])-1]);
			System.out.println((i+1)+"번쨰 입고된 차량 : " + carname[cars[i]]);
		}
	}
	
}
