package ex02;

import java.util.Scanner;

public class Quiz05_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ù��° ���� �Է� : ");
		int var1 = sc.nextInt();
		System.out.print("����� �ι�° ���� �Է� : ");
		int var2 = sc.nextInt();
		System.out.println("========================");
		System.out.println("1 . ����\n2 . ����\n3 . ����\n4 . ������ ");
		System.out.println("========================");
		System.out.print("����� ����� ������ ? ");
		int num = sc.nextInt();
		System.out.println("========================");
//		if (num>=1 && num <=4) {
//			System.out.println("ù ��° ���� : "+ var1);
//			System.out.println("�� ��° ���� : "+ var2);
//			if(num <=4 && num>0) {
//				if(num == 1 ) {
//				System.out.printf("%d + %d = %d\n",var1,var2,(var1+var2) );
//				}else if(num == 2 ) {
//					System.out.printf("%d - %d = %d\n",var1,var2,(var1-var2) );
//				}else if(num == 3 ) {
//					System.out.printf("%d * %d = %d\n",var1,var2,(var1*var2) );
//				}else if(num == 4 ) {
//				System.out.printf("%d / %d = %.2f",var1,var2,((double)var1/var2));
//				}
//			}
//		} else  {
//			System.out.println("���� �Է��� �߸��Ǿ����ϴ�.");
//			}
		
		if (num>=1 && num <=4) {
			
			
			System.out.println("ù ��° ���� : "+ var1);
			System.out.println("�� ��° ���� : "+ var2);
			
			if(num <=4 && num>0) {
			int result = 0;
			char op = '+' ;
				if(num == 1 ) {
					result = var1+var2;
							op = '+';
				}else if(num == 2 ) {
					result = var1-var2;
					op = '-';
				}else if(num == 3 ) {
					result = var1*var2;
					op = '*';
				}else if(num == 4 ) {
					result = var1/var2;
					op = '/';
				}
			System.out.printf("%d %c %d = %d\n",var1,op,var2,result);
			}
		} else  {
			System.out.println("���� �Է��� �߸��Ǿ����ϴ�.");
			}
	}
}
