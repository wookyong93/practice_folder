package ex02;

import java.util.Scanner;

public class Quiz02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입고할 수 있는 차량의 수 : ");
		int num = sc.nextInt();//숫자입력하여 num 에 저장
		
		String[] cars = new String[num];// 문자열 배열에 num 만큼 저장할수 있는 갯수 를 만든다.
		
		String[] carname = {"승용차","SUV","화물차"}; // 배열에 각각 저장된 인덱스 
						//	메뉴 1 	  2 	 3 
						//인덱스 0 	  1		 2
				
		for(int i = 0; i<cars.length;i++) {
			//System.out.println("1. " +carname[0]+" 2. "+carname[1]+ " 3 . "+carname[2]);
			for(int j = 0;j<carname.length;j++) {
				System.out.print((j+1)+". "+ carname[j] +" ");
				//j=0 이므로 1 . carname [0] = 승용차  를 반복하여 출력
			}
			System.out.println();
			System.out.print((i+1)+"번째 입고 차량 : ");// i=0 이므로 i+1 해야 1 이 나온다 
			//그러므로 1번째 입고차량 : 
			int tmp = sc.nextInt();//정수형을 입력함 
			
			cars[i] =carname[tmp -1];
			//car i번쨰 배열안에 carname [ 배열 번호] 의 내용을 저장
			
//			cars[i] =sc.nextInt();-1
			
		}
		System.out.println();
		for(int i =0 ; i<cars.length;i++) {
//			System.out.println((i+1)+"번쨰 입고된 차량 : " + carname[(cars[i])-1]);
			System.out.println((i+1)+"번쨰 입고된 차량 : " + cars[i]);
		}
	}
}
