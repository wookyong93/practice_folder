package ex01;

public class IfExam03 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 10;
		
		if (var1>var2) {
			System.out.println("var1�� Ů�ϴ�.");
		}
		else if (var1<var2){
			System.out.println("var2�� Ů�ϴ�.");
		}
		else if(var1 == var2) {
			System.out.println("var1 �� var2 �� �����ϴ�.");
		}else {
			System.out.println("���� �����ϴ�.");
		}
		
		
		int var = 11;
		
		if (var == 0) {
			System.out.println("0��������ƴմϴ�.");
		}
		else if (var%3 == 0 && var%5 == 0) {
			System.out.println("3��5�� ��� �Դϴ�.");
		}
		else if (var%3 == 0) {
			System.out.println("3�� ��� �Դϴ�.");
		}else if(var%5 == 0) {
			System.out.println("5�� ��� �Դϴ�.");
		}else {
			System.out.println("3�� ����� 5�� ����� �ƴմϴ�.");
		}
		//ū������ ���� ���� �������� ���� ����ϱ� ���� ���� ����.
		
	}
}
