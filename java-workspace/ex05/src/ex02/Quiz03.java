package ex02;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		int S = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("�԰� ���� ���� : ");
		S = sc.nextInt();
		
		int[] fulit = new int[S];// fulit ���� s ��ŭ�� �迭�� ����
		String[] name = {"����","����","�ٳ���","ü��","��"};
		//name �� �迭 ����
		for(int i = 0; i<fulit.length; i++) {
			for(int j = 0 ; j < name.length;j++) {
				//�ε��� ��ȣ ����
			System.out.print((j+1)+". "+name[j]);
			//j=0 +1 ���ؾ� 1��° , name  [0] ������ ��� j�� �ݺ��Ǵ� ��ŭ �迭 �ȿ� �� �� ���;
			}
			System.out.println();
			System.out.print((i+1)+"��° �԰� ǰ�� : ");
			fulit[i]= sc.nextInt()-1;
			//fulit �� �迭 ������ŭ �ݺ� ��� �� ;  fulit �� �迭�ȿ� ������ �����Ѵ� . 
			
		}
		for(int i = 0 ; i<fulit.length;i++) {
			System.out.println((i+1)+"���� �԰�� ǰ�� : "+ name[fulit[i]]);
			//�Էµ� ���� ����ϱ� ���ؼ� name �� �迭�ȿ� fulit�� �迭�ȿ� ����� ������ �־� name���� �ִ� �迭��ȣ�� �´� String �� ���
		}
	}
}
