package ex02;

import java.util.Scanner;

public class Quiz05_�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//���� �� ����
		System.out.print("ȣ���� �� ���� ���� �Է� : ");
		int room = sc.nextInt();// ���� �� ���� �Է�
		
		//���� ���¸� ������ �ִ� �迭 ���� -boolean �迭 (true/false)
		boolean[] roomNum = new boolean[room]; // ���� �� ���ڸ�ŭ �迭 ����
		int num=0; // �Էµ� ���ȣ �����ϴ� ����
		main : while(true) {
			System.out.println("ȣ�� ���� ���α׷�");
			System.out.println("1. �Խ�\n2. ���\n3. ��ü ����\n0. ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
				case 1:
					System.out.println("�Խ��� ���ȣ �Է� [1~"+room+"] : ");
					 num = sc.nextInt() - 1; // ���ȣ �Է� : �ε��� ��ȣ�� ó�� ���� -1
					if(roomNum[num]==true) { // ����� Ȯ��
						System.out.println("���� ��������� �Խ� �Ҽ� �����ϴ�..");
						//���� �Խ����ι�
					}else {
						roomNum[num] = true;//�Խ�ó��
						System.out.println("�Խ� ó���� �Ϸ� �Ǿ����ϴ�.");
					}
					break;
				case 2:
					System.out.println("�Խ��� ���ȣ �Է� [1~"+room+"] : ");
					 num = sc.nextInt() - 1;
					if(roomNum[num]==true) {//����� Ȯ��
						
						System.out.println("���ó���� �Ϸ� �Ǿ����ϴ�.");
						//���ó��
						roomNum[num] = false;
					}else {
						
						System.out.println("���� ����ִ� ���̹Ƿ� ����� �� �����ϴ�.");
						//���� ����ִ¹�
					}
					break;
				case 3:
					for(int i =0 ; i<room; i++) {//0�� �ε��� ���� ��ü �� ���� Ȯ��
						if(roomNum[i] == true) {//�Խ�
							System.out.println((i+1)+"������ ����� �Դϴ�.");
						}else {//����ִ¹�
							System.out.println((i+1)+"������ ����ֽ��ϴ�.");
						}
					}
					break;
				case 0:
					System.out.println("���α׷� ����");
					break main;
				default:
						System.out.println("������ �޴��� �����ϴ�.");
			}
			
		}
		
		
		
	}
}
