package ex05;

import java.util.Scanner;

public class Quiz03_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int re = 0;
		int coin = 0;
		int rt = 0;
		String mn = null;
		while(true) {
			System.out.print("금액 입력 : ");
			 coin = sc.nextInt();
			 System.out.println("====메뉴====");
			 System.out.println("1. 커피[250원]\n2. 율무차[200원]\n3. 코코아[150원]\n4. 금액반환");
			 System.out.print("메뉴 선택 : ");
			 int menu =sc.nextInt();
				
				 if(menu>0 && menu<=4) {
					switch(menu) {
					 		case 1 : 
					 			mn = "커피";
					 			re = coin - 250;
					 			break;
					 		case 2 : 
					 			mn = "율무차";
					 			re = coin-200;
					 			break;
					 		case 3 : 
					 			mn = "코코아";
					 			re = coin -150;
					 			break;
					 	} 	if (menu == 4) {
						System.out.println("동전이 반환됩니다.");
						System.out.println("반환 금액 : "+coin+"원");					 		
						}else if(re >= 0) {
								System.out.println(mn+"가 나왓습니다.");
								System.out.println("반환금액 : "+re+"원" );
							}else if (re < 0){
									System.out.println("금액이 모자릅니다.");
									System.out.println("반환 금액 : "+coin+"원");
							}
						}else {System.out.println("잘못된 메뉴 입니다.");
						break;}
			 System.out.println();
				}
		}	
}
	

