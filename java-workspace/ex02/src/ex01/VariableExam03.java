package ex01;

public class VariableExam03 {
	public static void main(String[] args) {
		int var1 = 10;
		System.out.println(var1);
		
		if (true) {
			System.out.println(var1);
			int var2 = 20;
			System.out.println(var2);
			// int var1 = 100; // ������ �����. ���� var1 ������ �����Ǿ� �ֱ� �����̴�.
		}
		System.out.println(var1);
		//System.out.println(var2); 
		// ������ ����� . if.. {} �ȿ� ������� �������� �߰�ȣ�� ����� ������ �������.
		int var2 =200;
		System.out.println(var2);
	}
}
