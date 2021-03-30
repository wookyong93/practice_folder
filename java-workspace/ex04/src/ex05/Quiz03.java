package ex05;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cf = 250;
		int ym = 200;
		int co = 150;
		int coin = 0;
			while(true) {
				System.out.print("금액 입력 : ");
				 coin = sc.nextInt();
				 System.out.println("====메뉴====");
				 System.out.printf("1. 커피[%d]\n2. 율무차[%d]\n3. 코코아[%d]\n4. 금액반환\n",cf,ym,co);
				 System.out.print("메뉴 선택 : ");
				 int menu =sc.nextInt();
				 	switch(menu){
				 		case 1 :
				 				if(coin <cf) {
				 					System.out.println("금액이 모자릅니다.");
				 					System.out.println("반환금액 : "+coin);
				 				break;
				 				}else {
				 					System.out.println("커피가 나왔습니다.");
				 					System.out.println("반환금액 : " +(coin-cf));
				 				break;}
			 			case 2 :
			 					if(coin <ym) {
				 					System.out.println("금액이 모자릅니다.");
				 					System.out.println("반환금액 : "+coin);
				 				break;
				 				}else {
				 					System.out.println("율무차가 나왔습니다.");
				 					System.out.println("반환금액 : " +(coin-ym));
				 				break;}
				 		case 3 :
				 				if(coin <co) {
				 					System.out.println("금액이 모자릅니다.");
				 					System.out.println("반환금액 : "+coin);
				 				break;
				 				}else {
				 					System.out.println("코코아가 나왔습니다.");
				 					System.out.println("반환금액 : " +(coin-co));
				 				break;}
			 			case 4 :
			 				System.out.println("금액이 반환됩니다.");
			 				System.out.println("반환금액 : " + coin);
			 				break;
				 		default : 
				 			System.out.println("없는 메뉴입니다.");
				 			System.out.println("반환금액 : "+coin);
				 		 	}
				 System.out.println();	
				 }
			 		
			
	}
}
