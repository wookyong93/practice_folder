package ex02;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		int S = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("입고 과일 수량 : ");
		S = sc.nextInt();
		
		int[] fulit = new int[S];// fulit 값에 s 만큼의 배열을 생성
		String[] name = {"딸기","수박","바나나","체리","귤"};
		//name 에 배열 생성
		for(int i = 0; i<fulit.length; i++) {
			for(int j = 0 ; j < name.length;j++) {
				//인덱스 번호 정리
			System.out.print((j+1)+". "+name[j]);
			//j=0 +1 을해야 1번째 , name  [0] 은딸기 출력 j가 반복되는 만큼 배열 안에 수 들 출력;
			}
			System.out.println();
			System.out.print((i+1)+"번째 입고 품목 : ");
			fulit[i]= sc.nextInt()-1;
			//fulit 의 배열 갯수만큼 반복 출력 됨 ;  fulit 의 배열안에 정수를 저장한다 . 
			
		}
		for(int i = 0 ; i<fulit.length;i++) {
			System.out.println((i+1)+"번쨰 입고된 품목 : "+ name[fulit[i]]);
			//입력된 값을 출력하기 위해선 name 의 배열안에 fulit의 배열안에 저장된 정수를 넣어 name값에 있는 배열번호에 맞는 String 값 출력
		}
	}
}
