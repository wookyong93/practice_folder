package Quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInfoImpl implements UserInfo{
   Scanner sc = new Scanner(System.in);
   List<User> userList = new ArrayList<User>();
   
   @Override
   public void input() {
      // TODO Auto-generated method stub
      if (userList.size() == UserInfo.MAX_USER) {
         System.out.println("�� �̻� ������ �� �����ϴ�.");
      } else {
         User u = new User();
         System.out.print("�̸� �Է� : ");
         u.setName(sc.next());
         System.out.print("���� �Է� : ");
         u.setAge(sc.nextInt());
         System.out.print("�ּ� �Է� : ");
         u.setAddress(sc.next());
         userList.add(u);
      }
   }

   @Override
   public void output() {
      // TODO Auto-generated method stub
      if (userList.size() == UserInfo.MIN_USER) {
         System.out.println("�Էµ� ������ �����ϴ�.");
      } else {
         System.out.println("#### ��� ####");
         for(User u : userList) {
            System.out.println("�̸� : " + u.getName());
            System.out.println("���� : " + u.getAge());
            System.out.println("�ּ� : " + u.getAddress());
         }
      }
   }

}
