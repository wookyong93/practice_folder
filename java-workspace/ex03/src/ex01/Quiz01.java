package ex01;

public class Quiz01 {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		int Korean = 100;
		int English = 97;
		int math = 96;
		int sum = Korean + English + math;
		double everage = (double)(Korean + English + math)/3;
		//or double everage = sum/3.0;  or double everage = (double)sum/3;
		System.out.println("�̸� : " +name); 
		// ���� ���� ������ �޸� �뷮 �����
		System.out.println("���� : " +Korean);
		System.out.println("���� : " +English);
		System.out.println("���� : " +math);
		System.out.println("���� : " +sum);
		System.out.println("��� : " +everage);
		String �̸� = "ȫ�浿";
		int kor = 100;
		int eng = 97;
		int ���� = 96;
		int ���� = kor + eng + ����;
		double avg = (double) ���� / 3;
		String menu1 = "�̸� : ";
		String menu2 = "��� : ";
		System.out.println(menu1 + �̸�);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(����);
		System.out.println(����);
		System.out.println(menu2 + avg);
	
		System.out.println("���� �̸���"+name+"�̴�.");
	}
}
