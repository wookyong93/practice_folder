package ex02;

import java.util.Scanner;

public class Quiz05_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �Է����ּ��� : ");
		int tomonth = sc.nextInt();
		System.out.print("������ �Է����ּ��� : ");
		int today= sc.nextInt();
		System.out.println("������ 2020�� "+tomonth+ "�� " +today+ "�� �Դϴ�.");
		System.out.println("======================================");
		System.out.print("����� �¾ �� �Է� : ");
		int year = sc.nextInt();
		System.out.print("����� �¾ �� �Է� : ");
		int month = sc.nextInt();
		System.out.print("����� �¾ �� �Է� : ");
		int day = sc.nextInt();
		System.out.println("======================================");
		System.out.printf("����� ��������� %d �� %d �� %d �� �Դϴ�.\n",year,month,day);
		System.out.println("======================================");
		int age1=0;
		if(month <= tomonth) {
			if(month<tomonth) {
				age1 =2020-year;
			}else if(month == tomonth) {
				if(day <= today) {
					age1 =2020-year;
			}else if (day > today) {
					age1 =2019-year;
				}
			}
		}else{
			age1 =2019-year;
		}
		System.out.println("����� ��"+age1+"���Դϴ�.");
		System.out.println("======================================");
		System.out.print("����� �̸��� �Է����ּ���. : ");
		String name = sc.next();
		 sc.nextLine();
		System.out.print("����� �ּҸ� �Է����ּ���. : ");
		String address = sc.nextLine();
		System.out.println("======================================");
		System.out.println("\t��\t��\t��\t��");
		System.out.println("======================================");
		System.out.printf("����� �̸� : %s\n����� �������: %d �� %d �� %d ��\n������ : %d\n����� �ּ�: %s ",name,year,month,day,age1,address);
		// ���� 
	}
}
