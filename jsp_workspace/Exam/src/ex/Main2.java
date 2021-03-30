package ex;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		 /*
	       * 고객명, 고객등급, 총구매금액을 입력받는다.
	       * 고객명. 고객등급, 총구매금액 ,적립포인트 , 보너스포인트를 출력
	       * 
	       * 등급별 적립포인트는 1등급은 5% , 2등급은 3%, 3등급 1%다.
	       * 보너스포인트 지급기준
	       *          1등급은 300만원 초과한 부분에 대해서 10% 추가포인트 지급
	       *          2등급은 150만원 초과한 부분에 대해서 5%  추가포인트 지급
	       *          3등급은 100만원 초과한 부분에 대해서 3% 추가포인트 지급
	       */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("고객명 : ");
		String name=sc.next();
		System.out.print("고객등급 : ");
		int rank=sc.nextInt();
		System.out.print("총구매 금액 만단위 : ");
		int price = sc.nextInt();
		int point = 0;
		int plusPoint=0;
		
		if(rank==1) {
			 point += price*10000*0.05;
			 if(price > 300) 
				 plusPoint += (price-300)*10000*0.10;
			 
		}else if(rank==2) {
			 point += price*10000*0.03;
			 if(price > 150)
				 plusPoint += (price-150)*10000*0.05;
			 
		}else {	
			 point += price*10000*0.01;
			 if(price > 100) 
				 plusPoint += (price-100)*10000*0.03;
			 
		}	 
		System.out.println("고객명 : "+name);
		System.out.println("고객등급 : "+rank);
		System.out.println("구매 금액 : "+price+"만원");
		System.out.println("등급 적립포인트 :"+point+"점");
		System.out.printf("추가 포인트 적립 : "+plusPoint+"점");
	}
}
