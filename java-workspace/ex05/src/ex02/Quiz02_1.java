package ex02;

import java.util.Scanner;

public class Quiz02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�԰��� �� �ִ� ������ �� : ");
		int num = sc.nextInt();//�����Է��Ͽ� num �� ����
		
		String[] cars = new String[num];// ���ڿ� �迭�� num ��ŭ �����Ҽ� �ִ� ���� �� �����.
		
		String[] carname = {"�¿���","SUV","ȭ����"}; // �迭�� ���� ����� �ε��� 
						//	�޴� 1 	  2 	 3 
						//�ε��� 0 	  1		 2
				
		for(int i = 0; i<cars.length;i++) {
			//System.out.println("1. " +carname[0]+" 2. "+carname[1]+ " 3 . "+carname[2]);
			for(int j = 0;j<carname.length;j++) {
				System.out.print((j+1)+". "+ carname[j] +" ");
				//j=0 �̹Ƿ� 1 . carname [0] = �¿���  �� �ݺ��Ͽ� ���
			}
			System.out.println();
			System.out.print((i+1)+"��° �԰� ���� : ");// i=0 �̹Ƿ� i+1 �ؾ� 1 �� ���´� 
			//�׷��Ƿ� 1��° �԰����� : 
			int tmp = sc.nextInt();//�������� �Է��� 
			
			cars[i] =carname[tmp -1];
			//car i���� �迭�ȿ� carname [ �迭 ��ȣ] �� ������ ����
			
//			cars[i] =sc.nextInt();-1
			
		}
		System.out.println();
		for(int i =0 ; i<cars.length;i++) {
//			System.out.println((i+1)+"���� �԰�� ���� : " + carname[(cars[i])-1]);
			System.out.println((i+1)+"���� �԰�� ���� : " + cars[i]);
		}
	}
}
