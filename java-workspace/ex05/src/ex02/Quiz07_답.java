package ex02;

import java.util.Scanner;

public class Quiz07_�� {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("�Է� �� �ִ� �� �� �Է� : ");
	      int num = sc.nextInt(); // �ִ� �� �� ����
	      
	      String[] songName = new String[num]; // �뷡 ������ ������ �� �ִ� ���� ����
	      int songNum = 0; // �뷡�� ������ ������ ����
	      int play = 0; // ���� �÷��� �� �ε��� ����
	      
	      main : while(true) {
	         // �޴�
	         System.out.println("1. �뷡����\n2. �뷡���\n3. ��ü���\n4. ������\n5. ������\n6. ����\n0. ����");
	         System.out.print("�޴� ���� : ");
	         int menu = sc.nextInt();
	         
	         switch(menu) {
	         case 1:
	            if (songNum == num) {
	               System.out.println("�� �̻� ������ �� �����ϴ�.");
	               break;
	            }
	            System.out.print((songNum+1)+"��° �뷡 ���� �Է� : ");
	            sc.nextLine();
	            songName[songNum] = sc.nextLine(); // �뷡 ���� ����
	            songNum++;
	            break;
	         case 2:
	            // �켱 ������ ù��° �� ���
	            System.out.println(songName[play]+"�� ����մϴ�.");
	            break;
	         case 3:
	            for(int i =0; i<songNum;i++) { // songNum�� ����ϴ� �� ���� ����� �뷡 ��
	               System.out.println((i+1) + "��° �뷡 ���� : " + songName[i]);
	            }
	            break;
	         case 4:
	            play++;
	            if(play == songNum) {
	            	play = 0;
	               System.out.println(songName[play]+"�� ����մϴ�.");
	            }
	            break;
	         case 5 : 
	        	 play --;
	        	 if(play <0) {
	        		 play =num-1;
	        		}
	        		 System.out.println(songName[play]+"�� ����մϴ�.");
	        	 
	        	 break;
	         case 6 : 
	        	 System.out.print("������ ��� �Է� : ");
	        	 sc. nextLine();
	        	 String songDel = sc.nextLine();
	        	 for(int i =0; i<songNum;i++) {
	        		 if(songName[i].equals(songDel)) {
	        		  for(int j =i;j<songNum-1 ;j++) {//songNum �� �ִ��ȣ���� �����Ƿ� �������� �˻��Ͽ��� ������ �ȳ�;
	        				 songName[j] = songName[j+1];
	        			 }
	        		  	songNum--;
	        		  	System.out.println("�����Ǿ����ϴ�.");
	        		  	break;
	        		 }
	        	 }
	        	 break;
	         case 0:
	            System.out.println("���α׷� ����");
	            break main;
	         default:
	            System.out.println("�޴��� ���� ��ȣ �Դϴ�.");

		}
	  
	  }
	}
}
