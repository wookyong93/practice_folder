package ex05;

import java.util.Scanner;

public class Quiz03_01답 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int coin = 0;
	      while(true) {
	      System.out.print("금액 입력 : ");
	       coin  = sc.nextInt();
	         System.out.println("1.커피 [250원]\n2.율무차 [200원]\n3.코코아 [150원]\n4.반환");
	         System.out.print("메뉴 선택 : ");
	         int menu = sc.nextInt();
	         int ret = coin;
	         String menuName = null;
		         switch(menu) {
		         case 1:
		            if (coin >= 250) {
		               menuName = "커피";
		               ret = coin - 250;
		            }
		            break;
		         case 2:
		            if(coin >= 200) {
		               menuName = "율무차";
		               ret = coin - 200;
		            }
		            break;
		         case 3:
		            if(coin >= 150) {
		               menuName = "코코아";
		               ret = coin - 150;
		            }
		         case 4 :
		        	 ret = -100;
		            break;
		         default:
		            System.out.println("잘못된 메뉴선택 입니다.");
		         }
		         
		         if (coin == ret) {
		             System.out.println("금액이 모자랍니다.");
		          } else if (menu == 4){
		             System.out.println("반환 금액 : " + coin);
		          }else {
		             System.out.println(menuName + "가 나왔습니다.");
		             System.out.println("반환 금액 : " + ret);
		          }

			         System.out.println();
	    	  }
	      }
	   
	}

