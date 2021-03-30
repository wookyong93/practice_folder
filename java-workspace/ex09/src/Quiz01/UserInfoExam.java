package Quiz01;

import java.util.Scanner;

public class UserInfoExam {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      UserInfo ui = new UserInfoImpl();
      
      while(true) {
         System.out.print("1. 입력 2. 출력 0. 종료 : ");
         int menu = sc.nextInt();
         
         switch(menu) {
         case 1:
            ui.input();
            break;
         case 2:
            ui.output();
            break;
         case 0:
            System.out.println("프로그램 종료");
            return;
         default:
            System.out.println("잘못된 메뉴 선택입니다.");
         }
      }
   }
}
