package ex02;

import java.util.Scanner;

public class Quiz05_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�� String name = new String("�����"); �� ����� �����̴� 
		//�� sc �� ��ĳ���̸��̹Ƿ� ���ϴ� ������ �Է��ϸ� �ȴ�.
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� ���� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int meth = sc.nextInt();
		System.out.println("===============================");
		
		int sum = kor + eng + meth;
		double avg = (double)sum / 3; // or sum / 3.0;
		//(double) �ٿ����������� ������ ��� �νĵǾ� ��Ȯ�� ����� �����ʴ´�.
		//System.out.println(name + " ���� ������ "+sum+" ���̰�, ����� "+avg+" ���Դϴ�.");
		
		System.out.printf("%s ���� ������ %d ���̰�,����� %.2f ���Դϴ�.\n",name,sum,avg);
		// %d = ����, %f = �Ǽ�, %s = ���ڿ�, %c = �ѱ��� ==> �ܿ��;
		//printf �� ��쿡�� �ٹٲ��� �����ʴ´� \n ���� ���� �ٲ� �ش� .
		//Enter => \r\n �Է��� �ȴ�
		
		
	}
}
