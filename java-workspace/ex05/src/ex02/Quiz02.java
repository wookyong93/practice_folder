package ex02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�԰��� �� �ִ� ������ �� : ");
		int num = sc.nextInt();
		
		int[] cars = new int[num];
		
		String[] carname = {"�¿���","SUV","ȭ����"};
				
		for(int i = 0; i<cars.length;i++) {
			//System.out.println("1. " +carname[0]+" 2. "+carname[1]+ " 3 . "+carname[2]);
			for(int j = 0;j<carname.length;j++) {
				System.out.print((j+1)+". "+carname[j]+" ");
			}
			System.out.println();
			System.out.print((i+1)+"��° �԰� ���� : ");
//			cars[i] =sc.nextInt();
			cars[i] =sc.nextInt()-1;
			
		}
		System.out.println();
		for(int i =0 ; i<cars.length;i++) {
//			System.out.println((i+1)+"���� �԰�� ���� : " + carname[(cars[i])-1]);
			System.out.println((i+1)+"���� �԰�� ���� : " + carname[cars[i]]);
		}
	}
	
}
