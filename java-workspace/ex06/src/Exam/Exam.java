package Exam;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ��� �� ��ǻ���� �� �Է�: ");
		int count =sc.nextInt();
		ExamInfor[] com = new ExamInfor[count];
		ExamFunc ec = new ExamFunc();
		int num =0;
main: while(true) {
		int menu = ec.menu();// ExamFunc ���� �޴��� ���� ��� �����Ƿ� int menu�� �װ��� �Է�;
		
		switch(menu){
		case 1 :
			if(num == count) {
				System.out.println("�� �̻� ������ �� �����ϴ�.");
			}else {
				com[num] = ec.input(num);
				num++;
				}
			break;
		case 2 : 
			if(ec.serch(com, num))
				
				System.out.println("ã�� ��ǻ�Ͱ� �����ϴ�.");
			break;
		case 3 :
			ec.output(com, num);
			break;
		case 0 :
			System.out.println("���α׷� ����");
			break main;
		default:
			System.out.println("���� �޴� �Դϴ�.");
		}
		
		
		}
	}
}
