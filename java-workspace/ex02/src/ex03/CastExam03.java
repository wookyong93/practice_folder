package ex03;

public class CastExam03 {
	public static void main(String[] args) {
		int var1 =  10;
		int var2 = 3;
		System.out.println(var1 + var2);
		System.out.println(var1 - var2);
		System.out.println(var1 * var2);
		System.out.println(var1 / var2);
		System.out.println(var1 / (double)var2);
		System.out.println((double)var1 / var2);
		System.out.println((double)var1 / (double)var2);
		// ������ ������ �����ϸ� ������ ������� ���´�.
		// ������ �Ǽ��� �����ϸ� �Ǽ��� ������� ���´�.
		
		double result = var1 / var2;
		System.out.println(result);
		result = var1 / (double)var2;
		System.out.println(result);
		result = var1 / 3;
		System.out.println(result);
		result = (double)var1 / 3;
		System.out.println(result);
		result = var1 / 3.0;
		System.out.println(result);
		
		String name = "�ǿ��";
				System.out.println(name);
	}
}