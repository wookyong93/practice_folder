package ex04;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. ������\n2. ����� ��\n3. 10������ ��");
			System.out.println("=================");
			System.out.print("�޴� ���� : ");
				int menu = sc.nextInt();
		if(menu>0 && menu<4) {//�޴��� ����������� else���� ���� �� ��� ;
			//switch ���� default�� ������� �ʾƵ� �ȴ�;
			System.out.println("=================");
			System.out.print("���� �Է� : ");
		 		int num = sc.nextInt();
		 		//if���� ������� �������ִ� 
		 		//�ٸ� if �� �ۿ� int num=0;���� �Է�������Ѵ� . if ���ȿ� �������� �����Ǹ� if �������� ������ ���� �װ��� ������⶧���δ�.
//if ,switch,for �� �̿��Ѱ�
		 		if(num>=2 && num <= 9) {
		 			switch(menu) {
		 			case 1 :
		 				System.out.println(num+ "�� ������");
		 				for(int i=1;i<=9;i++){
		 					System.out.println(num+" * "+i+" = "+(num*i));
		 				}
					
				 	break;
					case 2 : 
						System.out.println(num+"�� ���");
		 				for(int i =1 ;i <=100;i++) {
		 					if(i%num ==0) {
		 						System.out.print(i+" ");
		 					}
		 				}
					break;
					
					case 3 : 
						System.out.println(num+"���� 10������ ��");
		 				int sum = 0;
		 				for(int i=num; i<=10;i++) {
		 					sum +=i;	 				
		 				}System.out.println("������ �� : "+sum);
		 			break;
	// 			default:
	// 				System.out.println("���� �޴��Դϴ�.\n [1~3] ������ ���ڸ� �Է����ּ���");
				}
			}else {
				System.out.println("������ ���� �߸� �ԷµǾ����ϴ�.\n [2~9] ������ ���ڸ� �Է����ּ���");}
		
		}else {
			System.out.println("���� �޴��Դϴ�.\n [1~3] ������ ���ڸ� �Է����ּ���");
		}
		
	}
}

				
				
				
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
 		
// for �� if �� �̿��� ��		
//		if(num>=2 && num <= 9) {
//		 			if(menu == 1) {
//		 				System.out.println(num+ "�� ������");
//		 				for(int i=1;i<=9;i++){
//		 					System.out.println(num+"*"+i+"="+(num*i));
//		 				}
//		 			}else if(menu == 2) {
//		 				System.out.println(num+"�� ���");
//		 				for(int i =1 ;i <=100;i++) {
//		 					if(i%num ==0) {
//		 						System.out.print(i+" ");
//		 					}
//		 				}
//		 			}else if (menu == 3) {
//		 				System.out.println(num+"���� 10������ ��");
//		 				int sum = 0;
//		 				for(int i=num; i<=10;i++) {
//		 					sum +=i;	 				
//		 				}System.out.println(sum);
//		 			}else {
//		 				System.out.println("���� �޴��Դϴ�.\n [1~3] ������ ���ڸ� �Է����ּ���");
//		 			}	 				
//		}else{
//		 			System.out.println("������ ���� �߸� �ԷµǾ����ϴ�.\n [2~9] ������ ���ڸ� �Է����ּ���");
//		 		}
//	}
//}

