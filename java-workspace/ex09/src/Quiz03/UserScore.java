package Quiz03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserScore implements UserScoreInfo{
   Scanner sc = new Scanner(System.in);
   List<Score> list = new ArrayList<Score>();
   
   public int menu() {
      // TODO Auto-generated method stub
      System.out.println("1. �����Է� 2. ������� 0. ���α׷� ����");
      int menu = sc.nextInt();
      return menu;
   }

   @Override
   public void input() {
      // TODO Auto-generated method stub
      if(list.size() == MAX_USER) {
         System.out.println("�� �̻� ������ �� �����ϴ�.");
      } else {
         UserScore us = new UserScore();
         Score s = new Score();
         s = us.userInput(s);
         s = us.scoreInput(s);
         list.add(s);
      }
   }

   @Override
   public void output() {
      // TODO Auto-generated method stub
      if (list.size() == MIN_USER) {
         System.out.println("�Էµ� ������ �����ϴ�");
      } else {
         UserScore us = new UserScore();
         System.out.println("#### ���� ��� ####");
         for(Score s : list) {
            us.userOutput(s);
            us.scoreOutput(s);
         }
      }
   }

   @Override
   public Score userInput(Score s) {
      // TODO Auto-generated method stub
      System.out.print("�̸� �Է� : ");
      s.setName(sc.next());
      System.out.print("���� �Է� : ");
      s.setAge(sc.nextInt());
      System.out.print("�ּ� �Է� : ");
      s.setAddress(sc.next());
      
      return s;
   }

   
   @Override
   public void userOutput(Score s) {
      // TODO Auto-generated method stub
      System.out.println("�̸� : " + s.getName());
   }

   @Override
   public Score scoreInput(Score s) {
      // TODO Auto-generated method stub
      do {
         System.out.print("���� ���� �Է� : ");
         s.setKor(sc.nextInt());
      } while(s.getKor() > MAX_SCORE || s.getKor() < MIN_SCORE);
      do {
         System.out.print("���� ���� �Է� : ");
         s.setEng(sc.nextInt());
      }while(s.getEng() > MAX_SCORE || s.getEng() < MIN_SCORE);
      do {
         System.out.print("���� ���� �Է� : ");
         s.setMath(sc.nextInt());
      }while(s.getMath() > MAX_SCORE || s.getMath() < MIN_SCORE);
      
      return s;
   }

   @Override
   public void scoreOutput(Score s) {
      // TODO Auto-generated method stub
      System.out.println("���� : " + s.getSum());
      System.out.println("��� : " + s.getAvg());
   }

@Override
public void UserOutput(Score s) {
	// TODO Auto-generated method stub
	
}
}
