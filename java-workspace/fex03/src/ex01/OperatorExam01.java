package ex01;

public class OperatorExam01 {
	public static void main(String[] args) {
		// ��� ������  + - * / %
		int var1 = 10;
		int var2 = 5;
		int var3 = 3;
		System.out.println(var1 + var2); // ����
		System.out.println(var1 - var2); // ����
		System.out.println(var1 * var2); // ����
		System.out.println(var1 / var2); // ������
		System.out.println(var1 / var3); // ������ : ���� ��
		System.out.println(var1 % var3); // ������ : ���� ��������
		
		int var4 = -3; // ����
		int var5 = +5; // ���
		System.out.println(var4 + var5);
		System.out.println(var4 - var5);
		
		String first = "����";
		String mid = "��ǻ��";
		String last = "�п�";
		System.out.println(first + mid + last);
		// ���ڿ��� + �� �ٸ� ���ڿ��� ���� �� �ش�.
		// ���ڿ� �������� - * / �� ����� �� ����.		
	}
}
