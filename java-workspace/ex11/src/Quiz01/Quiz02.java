package Quiz01;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random rsp = new Random();
		//0.���� 1.���� 2. ���ڱ�
		while(true) {
			System.out.println("1. ����  2.���� 3. ���ڱ� 0.����");
			System.out.print("���� : ");
				int my = sc.nextInt();
				int you = rsp.nextInt(3)+1;
				
					String r = "����";
					String s = "����";
					String p = "���ڱ�";
				switch(my) {
				case 1 :
					System.out.println("�� : " +s);
					if(you == 1) {
						System.out.println("��� : "+s);
						System.out.println("�����ϴ�.");
					}else if (you == 2) {
						System.out.println("��� :"+r);
						System.out.println("�����ϴ�.");
					}else if(you ==3 ) {
						System.out.println("��� : "+p);
						System.out.println("�̰���ϴ�.");
					}
					break;
				case 2 :
					System.out.println("�� : "+ r);
					if(you == 1) {
						System.out.println("��� : "+s);
						System.out.println("�̰���ϴ�.");
					}else if (you == 2) {
						System.out.println("��� :"+r);
						System.out.println("�����ϴ�.");
					}else if(you ==3 ) {
						System.out.println("��� : "+p);
						System.out.println("�����ϴ�.");
					}
					break;
				case 3 : 
					System.out.println("�� :"+ p);
					if(you == 1) {
						System.out.println("��� : "+s);
						System.out.println("�����ϴ�.");
					}else if (you == 2) {
						System.out.println("��� :"+r);
						System.out.println("�̰���ϴ�.");
					}else if(you ==3 ) {
						System.out.println("��� : "+p);
						System.out.println("�����ϴ�.");
					}
					break;
				case 0 : 
					System.out.println("GAME EXIT");
					return;
				default :
					System.out.println("�ٽ��Է� ");
				}
			}
			
	}
}
