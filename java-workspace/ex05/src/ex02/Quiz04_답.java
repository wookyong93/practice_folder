package ex02;

import java.util.Scanner;

public class Quiz04_�� {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("�԰�� ǰ���� �� : ");
		int num =sc.nextInt();
		String[] product = new String[num];
		int[] order = new int[num];
		
		for(int i = 0 ; i < num ;i++) {
			System.out.print((i+1)+"��° �԰� ǰ��� : ");
			product[i] = sc.next();
		}
		for(int i=0; i<num;i++) {
			System.out.print((i+1 )+". "+product[i]+" ");
		}
		System.out.println();
		
		for(int i = 0 ; i<num;i++) {
			System.out.println((i+1)+"��° ���� : ");
			order[i] = sc.nextInt()-1;
		}
		
		for (int i=0;i<num;i++) {
			System.out.println((i+1)+"���� �԰� ǰ�� : "+ product[order[i]]);
		}
		
	}
}
