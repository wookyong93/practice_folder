package ex02;

import java.util.Scanner;

public class Quiz07_답 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("입력 할 최대 곡 수 입력 : ");
	      int num = sc.nextInt(); // 최대 곡 수 저장
	      
	      String[] songName = new String[num]; // 노래 제목을 저장할 수 있는 공간 생성
	      int songNum = 0; // 노래의 순서를 지정한 변수
	      int play = 0; // 현재 플레이 곡 인덱스 저장
	      
	      main : while(true) {
	         // 메뉴
	         System.out.println("1. 노래저장\n2. 노래재생\n3. 전체곡명\n4. 다음곡\n5. 이전곡\n6. 삭제\n0. 종료");
	         System.out.print("메뉴 선택 : ");
	         int menu = sc.nextInt();
	         
	         switch(menu) {
	         case 1:
	            if (songNum == num) {
	               System.out.println("더 이상 저장할 수 없습니다.");
	               break;
	            }
	            System.out.print((songNum+1)+"번째 노래 제목 입력 : ");
	            sc.nextLine();
	            songName[songNum] = sc.nextLine(); // 노래 제목 저장
	            songNum++;
	            break;
	         case 2:
	            // 우선 무조건 첫번째 곡 재생
	            System.out.println(songName[play]+"을 재생합니다.");
	            break;
	         case 3:
	            for(int i =0; i<songNum;i++) { // songNum를 사용하는 건 실제 저장된 노래 수
	               System.out.println((i+1) + "번째 노래 제목 : " + songName[i]);
	            }
	            break;
	         case 4:
	            play++;
	            if(play == songNum) {
	            	play = 0;
	               System.out.println(songName[play]+"을 재생합니다.");
	            }
	            break;
	         case 5 : 
	        	 play --;
	        	 if(play <0) {
	        		 play =num-1;
	        		}
	        		 System.out.println(songName[play]+"을 재생합니다.");
	        	 
	        	 break;
	         case 6 : 
	        	 System.out.print("삭제할 곡명 입력 : ");
	        	 sc. nextLine();
	        	 String songDel = sc.nextLine();
	        	 for(int i =0; i<songNum;i++) {
	        		 if(songName[i].equals(songDel)) {
	        		  for(int j =i;j<songNum-1 ;j++) {//songNum 의 최대번호값이 없으므로 그전까지 검색하여야 에러가 안남;
	        				 songName[j] = songName[j+1];
	        			 }
	        		  	songNum--;
	        		  	System.out.println("삭제되었습니다.");
	        		  	break;
	        		 }
	        	 }
	        	 break;
	         case 0:
	            System.out.println("프로그램 종료");
	            break main;
	         default:
	            System.out.println("메뉴에 없는 번호 입니다.");

		}
	  
	  }
	}
}
