package ex02;

import java.util.Scanner;

public class ArrayExam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] cars;
		
		System.out.print("������ �� �ִ� ������ : ");
		int num =sc.nextInt();
		cars = new int[num];
		System.out.println("������ �� �ִ� �������� "+cars.length+" �� �Դϴ�.");
		
		String[] names = {"ȫ�浿","�̼���", "������"};
		for(int i = 0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		String[] str = new String[3];
		for(int i = 0; i<names.length;i++) {
			System.out.println(str[i]);
		}
		str[0]="���缮";
		str[1]="��ȣ��";
		str[2]="�ŵ���";
		
				
;	}
}
