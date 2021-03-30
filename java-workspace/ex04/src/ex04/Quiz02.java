package ex04;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 구구단\n2. 배수의 값\n3. 10까지의 합");
			System.out.println("=================");
			System.out.print("메뉴 선택 : ");
				int menu = sc.nextInt();
		if(menu>0 && menu<4) {//메뉴의 범위가벗어나면 else에서 오류 값 출력 ;
			//switch 문에 default를 사용하지 않아도 된다;
			System.out.println("=================");
			System.out.print("정수 입력 : ");
		 		int num = sc.nextInt();
		 		//if문을 여기까지 묶을수있다 
		 		//다만 if 문 밖에 int num=0;값을 입력해줘야한다 . if 문안에 변수값이 생성되면 if 문밖으로 나가는 순간 그값은 사라지기때문인다.
//if ,switch,for 문 이용한값
		 		if(num>=2 && num <= 9) {
		 			switch(menu) {
		 			case 1 :
		 				System.out.println(num+ "의 구구단");
		 				for(int i=1;i<=9;i++){
		 					System.out.println(num+" * "+i+" = "+(num*i));
		 				}
					
				 	break;
					case 2 : 
						System.out.println(num+"의 배수");
		 				for(int i =1 ;i <=100;i++) {
		 					if(i%num ==0) {
		 						System.out.print(i+" ");
		 					}
		 				}
					break;
					
					case 3 : 
						System.out.println(num+"부터 10까지의 합");
		 				int sum = 0;
		 				for(int i=num; i<=10;i++) {
		 					sum +=i;	 				
		 				}System.out.println("총합의 값 : "+sum);
		 			break;
	// 			default:
	// 				System.out.println("없는 메뉴입니다.\n [1~3] 사이의 숫자를 입력해주세요");
				}
			}else {
				System.out.println("정수의 값이 잘못 입력되었습니다.\n [2~9] 사이의 숫자를 입력해주세요");}
		
		}else {
			System.out.println("없는 메뉴입니다.\n [1~3] 사이의 숫자를 입력해주세요");
		}
		
	}
}

				
				
				
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
 		
// for 과 if 문 이용한 답		
//		if(num>=2 && num <= 9) {
//		 			if(menu == 1) {
//		 				System.out.println(num+ "의 구구단");
//		 				for(int i=1;i<=9;i++){
//		 					System.out.println(num+"*"+i+"="+(num*i));
//		 				}
//		 			}else if(menu == 2) {
//		 				System.out.println(num+"의 배수");
//		 				for(int i =1 ;i <=100;i++) {
//		 					if(i%num ==0) {
//		 						System.out.print(i+" ");
//		 					}
//		 				}
//		 			}else if (menu == 3) {
//		 				System.out.println(num+"부터 10까지의 합");
//		 				int sum = 0;
//		 				for(int i=num; i<=10;i++) {
//		 					sum +=i;	 				
//		 				}System.out.println(sum);
//		 			}else {
//		 				System.out.println("없는 메뉴입니다.\n [1~3] 사이의 숫자를 입력해주세요");
//		 			}	 				
//		}else{
//		 			System.out.println("정수의 값이 잘못 입력되었습니다.\n [2~9] 사이의 숫자를 입력해주세요");
//		 		}
//	}
//}

