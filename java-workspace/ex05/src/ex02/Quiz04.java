package ex02;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�԰�� ǰ���� �� :");
		int num =sc.nextInt();
		String [] fru = new String [num];
		
			for (int i =0;i <fru.length;i++) {
				System.out.println((i+1)+"��°  ǰ�� �Է� : ");
				fru[i]=sc.next();
				}
			for(int i=0 ; i <fru.length;i++) {
				System.out.println((i+1)+"��° �԰� ǰ�� : "+fru[i]);
			}
			System.out.println("�԰��ų ���� �Է� : ");
			num = sc.nextInt();
			
			System.out.println("�԰�� ǰ�� ��ȣ �Է� ");
			int[] pick = new int[num] ;
			for(int i = 0; i<pick.length;i++) {
				System.out.println((i+1)+"��° �԰�� ǰ�� : ");
				pick[i] = sc.nextInt()-1;
			}
			for(int i = 0; i<pick.length;i++)
			System.out.println((i+1)+"��° �԰�� ǰ�� : "+fru[pick[i]]);
	}
	
}
