package ex02;

import java.util.Scanner;

public class InputExam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ex)String name = new String ("���ڿ�");
		//system.in ���� ������ ���ڸ� sc �� �Է����ִ� ���;
		System.out.print("�̸� �Է� \t: ");
		String name = sc.next();
		
		System.out.print("���� �Է� \t: ");
		int age = sc.nextInt();
		System.out.print("������ �Է� : ");
		double weight = sc.nextDouble();
		System.out.print("Ű �Է� : ");
		double height = sc.nextDouble();
		
		
		
		System.out.println("�̸� \t: " + name);
		System.out.println("���� \t: " + age);
		System.out.println("������ \t: " + weight);
		System.out.println("Ű \t : "+height);
		System.out.print("ù��° �� �Է� : ");
		int dv = sc.nextInt();
		System.out.print("�ι��� �� �Է� : ");
		int dc = sc.nextInt();
		System.out.print("����° �� �Է� : ");
		int da = sc.nextInt();
		System.out.println("���� :" +((int)+dv+dc+da));
	}
}
