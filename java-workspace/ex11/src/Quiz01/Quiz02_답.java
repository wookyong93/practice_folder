package Quiz01;

import java.util.Random;
import java.util.Scanner;

public class Quiz02_�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
	while(true) {	
		int com = rand.nextInt(3)+1;
		
		System.out.println("1. ���� 2. ���� 3. ���ڱ� ");
		System.out.print("���� : ");
		int user = sc.nextInt();
		int win = 0;
		int  draw =0;
		int lose = 0;
		
		switch(user) {
		case 1: 
			if(com ==1) {
				System.out.println("�Ѵ� ������ �����ϴ�.");
				draw++;
			}else if(com ==2) {
				System.out.println("��ǻ�� : ���� ,����� : ���� ");
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				lose++;
			}else {
				System.out.println("��ǻ�� : ���ڱ�, ����� :����");
				System.out.println("����ڰ� �̰���ϴ�.");
				win++;
			}
			break;
		case 2 : 
			if(com ==1) {
				System.out.println("��ǻ�� : ���� ,����� : ���� ");
				System.out.println("����ڰ� �̰���ϴ�.");
				win++;
			}else if(com ==2) {
				System.out.println("�Ѵ� ������ �����ϴ�.");
				draw++;
			}else {
				System.out.println("��ǻ�� : ���ڱ�, ����� :����");
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				lose++;
			}
			break;
		case 3 : 
			if(com ==1) {
				System.out.println("��ǻ�� : ����, ����� :���ڱ�");
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				lose++;
			}else if(com ==2) {
				System.out.println("��ǻ�� : ���� ,����� : ���ڱ� ");
				System.out.println("����ڰ� �̰���ϴ�.");
				win++;
			}else {
				System.out.println("�Ѵ� ���ڱ�� �����ϴ�.");
				draw++;
			}
			break;
			
			default :
				System.out.println("�߸��ԷµǾ����ϴ�.");
		}
		System.out.println("�� : "+win+"�� : "+draw+"��:"+lose);
		
		if(win ==5 || lose ==5) {
			System.out.println("�·��� �ʱ�ȭ �մϴ�.\n");
			win =0;
			lose =0;
			draw =0;
		}
	}
		
	}
}
