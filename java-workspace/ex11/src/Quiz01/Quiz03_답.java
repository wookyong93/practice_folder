package Quiz01;

import java.util.Random;
import java.util.Scanner;

public class Quiz03_�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		while(true) {
			System.out.println("====UP&DOWN ���� ��ŸƮ ====");
			int com = rand.nextInt(101);
			
			for(int i = 0; i<10;i++) {
				System.out.println(i+1+"��° �õ�");
				System.out.print("�� �Է� : ");
				int user = sc.nextInt();
				
				if(user >com) {
					System.out.println("DOWN");
				}else if(user < com) {
					System.out.println("UP");
				}else {
					System.out.println("�����Դϴ�.");
					break;//������ ���߰� ��� �ݺ� ����;
					//return;  ������ ���߸� ���α׷� ����; 
				}
				
				if(i == 9) {
					System.out.println("�й��Ͽ����ϴ�.");
					System.out.println("������ "+com+"�Դϴ�.");
				}
			}
		}
	}
}
