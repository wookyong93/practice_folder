package ex02;

import java.util.Scanner;

public class Quiz03_�� {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.print("�԰�� ���� ǰ�� �� �Է� : ");
	int num = sc.nextInt();
	
	int[] fruits =new int[num];
	
	String[] fruitsname = {"����","����","�ٳ���","ü��","��"};
	
	System.out.println("1. ����\n2. ����\n3. �ٳ���\n 4.ü��\n5. ��");
		for(int i =0; i<fruits.length;i++) {
			System.out.println((i+1)+"��° �԰� ǰ�� : ");
			fruits[i] = sc.nextInt()-1;
			
		}
		for(int i =0; i<fruits.length;i++) {
			System.out.println((i+1)+"���� �԰�� ǰ�� : "+fruitsname[fruits[i]]);
		}
	}
}
