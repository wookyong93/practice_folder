package Quiz03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserScore implements UserScoreInfo{
   Scanner sc = new Scanner(System.in);
   List<Score> list = new ArrayList<Score>();
   
   public int menu() {
      // TODO Auto-generated method stub
      System.out.println("1. 성적입력 2. 성적출력 0. 프로그램 종료");
      int menu = sc.nextInt();
      return menu;
   }

   @Override
   public void input() {
      // TODO Auto-generated method stub
      if(list.size() == MAX_USER) {
         System.out.println("더 이상 저장할 수 없습니다.");
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
         System.out.println("입력된 정보가 없습니다");
      } else {
         UserScore us = new UserScore();
         System.out.println("#### 점수 출력 ####");
         for(Score s : list) {
            us.userOutput(s);
            us.scoreOutput(s);
         }
      }
   }

   @Override
   public Score userInput(Score s) {
      // TODO Auto-generated method stub
      System.out.print("이름 입력 : ");
      s.setName(sc.next());
      System.out.print("나이 입력 : ");
      s.setAge(sc.nextInt());
      System.out.print("주소 입력 : ");
      s.setAddress(sc.next());
      
      return s;
   }

   
   @Override
   public void userOutput(Score s) {
      // TODO Auto-generated method stub
      System.out.println("이름 : " + s.getName());
   }

   @Override
   public Score scoreInput(Score s) {
      // TODO Auto-generated method stub
      do {
         System.out.print("국어 점수 입력 : ");
         s.setKor(sc.nextInt());
      } while(s.getKor() > MAX_SCORE || s.getKor() < MIN_SCORE);
      do {
         System.out.print("영어 점수 입력 : ");
         s.setEng(sc.nextInt());
      }while(s.getEng() > MAX_SCORE || s.getEng() < MIN_SCORE);
      do {
         System.out.print("수학 점수 입력 : ");
         s.setMath(sc.nextInt());
      }while(s.getMath() > MAX_SCORE || s.getMath() < MIN_SCORE);
      
      return s;
   }

   @Override
   public void scoreOutput(Score s) {
      // TODO Auto-generated method stub
      System.out.println("총점 : " + s.getSum());
      System.out.println("평균 : " + s.getAvg());
   }

@Override
public void UserOutput(Score s) {
	// TODO Auto-generated method stub
	
}
}
