package Quiz01;

import java.util.Scanner;

public class UserInfoExam {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      UserInfo ui = new UserInfoImpl();
      
      while(true) {
         System.out.print("1. �Է� 2. ��� 0. ���� : ");
         int menu = sc.nextInt();
         
         switch(menu) {
         case 1:
            ui.input();
            break;
         case 2:
            ui.output();
            break;
         case 0:
            System.out.println("���α׷� ����");
            return;
         default:
            System.out.println("�߸��� �޴� �����Դϴ�.");
         }
      }
   }
}
