package ex05;

import java.util.Scanner;

public class DoWhileExam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//���� ����
//		int num;
		boolean f1 = false;
//		
//		 do {
//			 if(f1) { // ���� ���� ���������� �̸Ž��� ���
//				 
//				 System.out.println("������ ������ϴ�.");
//			 }
//			 System.out.print("���� �Է�[2~9] : ");
//			 num = sc.nextInt();
//			 f1 = true;// ���� �� ������ ���� �ǹǷ� �ݺ�
//		 }while (num >9 || num<2);// �� �����̸����� �����̹Ƿ� �ݺ� ; �������� ���̹Ƿ� ����
//		 
//		 System.out.println("Hi");//���̸� ����̵ǰ� ������.
		 
		 int password = 13799731;
		 int pass;
		 
		 do {
			 if(f1) {
				 System.out.println("��й�ȣ�� Ʋ���ϴ�.");
			 }
			 System.out.print("��й�ȣ �Է� : ");
			 pass = sc.nextInt();
			 f1 = true;
		 }while(pass != password);
		 System.out.println("�α��� ����");
		 
		
		 
//		 if(num >=2 && num<=9) {
//			 System.out.println("HI");
//		 }else {
//			 System.out.println("������ �߸� �Ѵ�.");
//		 }
//		 
	}
}
