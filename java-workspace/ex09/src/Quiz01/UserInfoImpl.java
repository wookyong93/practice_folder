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
         System.out.println("더 이상 저장할 수 없습니다.");
      } else {
         User u = new User();
         System.out.print("이름 입력 : ");
         u.setName(sc.next());
         System.out.print("나이 입력 : ");
         u.setAge(sc.nextInt());
         System.out.print("주소 입력 : ");
         u.setAddress(sc.next());
         userList.add(u);
      }
   }

   @Override
   public void output() {
      // TODO Auto-generated method stub
      if (userList.size() == UserInfo.MIN_USER) {
         System.out.println("입력된 정보가 없습니다.");
      } else {
         System.out.println("#### 출력 ####");
         for(User u : userList) {
            System.out.println("이름 : " + u.getName());
            System.out.println("나이 : " + u.getAge());
            System.out.println("주소 : " + u.getAddress());
         }
      }
   }

}
