package ex05;

import java.util.Scanner;

public class Quiz05_�� {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int menu =1;
	String name = null;
	int kor = 0;
	int eng = 0;
	int meth = 0;
	
	while(menu != 0) {
		System.out.println("1.�����Է�\n2.�������\n0.����");
		System.out.print("�޴� ���� : ");
		menu =sc.nextInt();
		switch(menu) {
		case 1 :
			 System.out.println("\n=====�Է�=====");
			 //�̸� , ���� , ���� , ���� �����Է�
			 System.out.print("�̸� �Է� : ");
			 name =sc.next();
			 do {
			 System.out.print("���� ���� �Է� : ");
			 kor = sc.nextInt();
			 }while(kor > 100 || kor <0);
			 do {
			 System.out.print("���� ���� �Է� : ");
			 eng = sc.nextInt();
			 }while(eng > 100 || eng <0);
			 do {
			 System.out.print("�������� �Է� : ");
			 meth = sc.nextInt();
			 }while(meth>100 || meth<0);
			 break;
		case 2 : 
			System.out.println("\n=====���=====");
			System.out.println("�̸� : "+name);
			System.out.println("���� : "+(kor+eng+meth)+"��");
			System.out.printf("��� : %.2f ��\n",((kor+eng+meth)/3.0));
			break;
		case 0 : 
			System.out.println("���α׷� ����");
			break;
		default : 
			System.out.println("�޴��� ���� ��ȣ �Դϴ�.");
		}
	}
}
}
