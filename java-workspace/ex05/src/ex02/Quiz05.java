package ex02;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �������ּ��� : ");
		int count = sc.nextInt();
		int roomnum = 0 ;
		String o1 = null;
		boolean[] room = new boolean[count];
		
			while(true){
			System.out.println("1. �Խ�\n2. ���\n3. ����ü����\n0. ���α׷� ����");
				System.out.print("�޴� ���� : ");
				int menu = sc.nextInt();
				
				switch(menu) {
					case 1  : 
						System.out.println("�� ��ȣ ����[1~"+count+"] : ");
						roomnum = sc.nextInt()-1;
							if(room[roomnum]==true) {
								System.out.println("���� ������Դϴ�.");
							}else {
								System.out.println("�Խ� ó�� �Ϸ�");
								room[roomnum]=true;
							}
						break;
					case 2 : 
						System.out.println("�� ��ȣ ����[1~"+count+"] : ");
						roomnum = sc.nextInt()-1;
							if(room[roomnum]==false) {
									System.out.println("���� ����ֽ��ϴ�.");
								}else {
									System.out.println("��� ó�� �Ϸ�");
									room[roomnum]=false;}
						break;
					case 3 : 
						for(int i = 0;i<room.length;i++) {
							if(room[i] == false ) { o1 = "���";							
							}else { o1 = "�����";}
							System.out.println((i+1)+"������ "+o1+"�Դϴ�.");
						}
						break ;
					case 0 : 
						System.out.println("�����մϴ�.");
						break;
						
					default :
							System.out.println("���� �޴� �Դϴ�.");
						break;
				}
					
			if (menu ==0 ) {
				break;
			}			
		}
	}
}
