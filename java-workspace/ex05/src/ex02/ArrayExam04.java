package ex02;

import java.util.Scanner;

public class ArrayExam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ȣ���� ���� ���� : ");
		int room = sc.nextInt(); // room �� ��
		
		boolean[] roomnum = new boolean [room]; //room�� ����
		//false  : ����ִ� �� / true : ������� ��
		roomnum[1] =  true; // �Խ�
		
		for(int i = 0 ; i<room ;i++) {
			if(roomnum[i] == true) {
				System.out.println((i+1)+"���� ��� ���Դϴ�.");
			}else {
				System.out.println((i+1)+"���� ��� �ֽ��ϴ�.");
			}
		}
		
		roomnum[1] =  false;
		//���
		for(int i = 0 ; i<room ;i++) {
			if(roomnum[i] == true) {
				System.out.println((i+1)+"���� ��� ���Դϴ�.");
			}else {
				System.out.println((i+1)+"���� ��� �ֽ��ϴ�.");
			}
		}
	}
}
