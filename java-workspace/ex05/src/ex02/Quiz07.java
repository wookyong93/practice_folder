package ex02;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ִ� ���� ������ ���� ���� �Է� : ");
		int count = sc.nextInt();
		String[] sing = new String [count];
		int num =0;
label:	while(true) {
				System.out.println("1. �뷡 ����\n2. �뷡 ���\n3. ����� �뷡\n0. ����");
				System.out.print("�޴� ���� : ");
				int menu = sc.nextInt();
				switch (menu) {
				case 1 :
				
					for(int i = 0; i <sing.length;i++) {
						if(sing[i]== null) {
						System.out.print("������ �뷡 �Է� : ");
							sing[i]=sc.next();
							if(sing[i]== null) {
								System.out.println((i+1)+"����"+sing[i]+"����Ǿ����ϴ�.");
								break;
							}else if(sing[i] != null) {
								System.out.println((i+1)+"���� "+sing[i]+"����Ǿ����ϴ�.");
								break;
								}
							}else if(sing[count-1] != null) {
								System.out.println("���̻� ������ ������ �����ϴ�.");
							break;
							}
						
						}
				
					break;
				case 2 :
					for(int i = 0; i<sing.length;i++ ) {
						if(sing[i] != null) {
						System.out.println((i+1)+"���� ��� : "+sing[i]);
						System.out.println("���� ���� ����Ͻðڽ��ϱ� ? [Y/N]");
						System.out.print("�Է� : ");
						String YN = sc.next();
						if(YN.equals("Y")) {
							if(sing[i+1] == null) {System.out.println("����� ���̾����ϴ�.");
							break;}
						}else {
							break;}
						}
					}
					break;
				case 3 : 
					for(int i = 0 ;i<sing.length;i++)
							if(sing[i] != null) {
							System.out.println((i+1)+"�� ����� �뷡 : "+sing[i]);
							}else {
								System.out.println((i+1)+"�� ����� �뷡 : �����ϴ�.");
							}
					break;
				case 0 :
					System.out.println("�ý����� ���� �մϴ�.");
					break label;
				default:
					System.out.println("���� �޴��Դϴ�.");
						
				}
		}
		
	}
}
