package ex05;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu =0;
		int kor = 0;
		int eng = 0;
		int meth = 0;
		String name = null;
		boolean f1 = false;
		while(true) {
			System.out.println("1. ���� �Է� \n2. ���� ���\n0. ���α׷� ���� ");
			System.out.println("===================");
			System.out.print("�޴� ���� : ");
			menu =sc.nextInt();
				switch (menu){
					case 1 : 
						do {
							if(f1) {
								System.out.println("�Է������� ������ ������ϴ�. \n[0~100]�ǹ����� �� �Է� ���ּ���.");
							}
							System.out.print("�̸� �Է� : ");
							name = sc.next();
							System.out.print("���� ���� �Է� : ");
							kor = sc.nextInt();
							}while(kor>100 || kor <0);
						do {
							if(f1) {
								System.out.println("�Է������� ������ ������ϴ�. \n[0~100]�ǹ����� �� �Է� ���ּ���.");
								}
							System.out.print("���� ���� �Է� : ");
							eng = sc.nextInt();
							}while(eng >100 || eng <0);
						do {
							if(f1) {
								System.out.println("�Է������� ������ ������ϴ�. \n[0~100]�ǹ����� �� �Է� ���ּ���.");
								}
							System.out.print("���� ���� �Է� : ");
							meth = sc.nextInt();
						}while(meth>100 || meth <0);
							
						break;
						
					case 2 : 
						System.out.println("�̸� : " + name );
						System.out.println("���� : "+(kor+eng+meth));
						System.out.printf("��� : %.2f \n",((double)(kor+eng+meth)/3));
						System.out.println("�� �� �� �� ");
						break;
					
					default : 
						System.out.println("������ ������ϴ�.\n�� ���� ���ּ���.");
						break;
				}	
			if(menu ==0 ) {
				System.out.println("���α׷� ����");
				break;
			}
		}	
	}
}