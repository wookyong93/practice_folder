package ex05;

import java.util.Scanner;

public class Quiz03_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int re = 0;
		int coin = 0;
		int rt = 0;
		String mn = null;
		while(true) {
			System.out.print("�ݾ� �Է� : ");
			 coin = sc.nextInt();
			 System.out.println("====�޴�====");
			 System.out.println("1. Ŀ��[250��]\n2. ������[200��]\n3. ���ھ�[150��]\n4. �ݾ׹�ȯ");
			 System.out.print("�޴� ���� : ");
			 int menu =sc.nextInt();
				
				 if(menu>0 && menu<=4) {
					switch(menu) {
					 		case 1 : 
					 			mn = "Ŀ��";
					 			re = coin - 250;
					 			break;
					 		case 2 : 
					 			mn = "������";
					 			re = coin-200;
					 			break;
					 		case 3 : 
					 			mn = "���ھ�";
					 			re = coin -150;
					 			break;
					 	} 	if (menu == 4) {
						System.out.println("������ ��ȯ�˴ϴ�.");
						System.out.println("��ȯ �ݾ� : "+coin+"��");					 		
						}else if(re >= 0) {
								System.out.println(mn+"�� ���ӽ��ϴ�.");
								System.out.println("��ȯ�ݾ� : "+re+"��" );
							}else if (re < 0){
									System.out.println("�ݾ��� ���ڸ��ϴ�.");
									System.out.println("��ȯ �ݾ� : "+coin+"��");
							}
						}else {System.out.println("�߸��� �޴� �Դϴ�.");
						break;}
			 System.out.println();
				}
		}	
}
	
