package ex01;

public class Quiz04 {
	public static void main(String[] args) {
		int var1 = 19 ;
		int A = 1&var1;
		int B = 0&var1;
		String res = A == B ? "������ ���� ¦���Դϴ�.": "������ ���� Ȧ���Դϴ�.";
		
		//������ ������� ���� �������� ���еǴ� ���� �ǹ��Ѵ�.
		String result = var1%2 == 1 ? "������ ���� Ȧ���Դϴ�." : "������ ���� ¦���Դϴ�.";
		System.out.println(result);
		
		System.out.println(res);
		int var2 =0;
		System.out.println(var2==0 ? "0�Դϴ�." :var2 >= 1 ? "����Դϴ�." : "�����Դϴ�.");
		
		System.out.println( var2 == 0 ? "�����ǰ��� Ȧ���� ¦�����ƴմϴ�" : var2%2 == 1 ? "������ ���� Ȧ���Դϴ�." : "������ ���� ¦���Դϴ�.");
		// ���ǹ� ? ���� : ���ǹ� ? �� : ���� ;
		// ���� 0�� ���ٸ� ? ���̸� �� : ���� ¦�� ? ���� ¦�� : ���� Ȧ�� ;
		// var2 ==0 �� ���ǹ�?  �� : var2%2==1 (�����ϰ���� ���ǹ�) ? �� : ����;	
		}
}
