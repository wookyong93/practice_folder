package ex02;

public class DataTypeExam05 {
	public static void main(String[] args) {
		double var1 = 3.14;
		System.out.println(var1);
		
		// float var2 = 3.14; 
		// �Ǽ��� ǥ���ϴ� ���� �⺻ ������ ������ double �̴�.
		// 8byte�� double�� ���� 4byte�� float �� �ֱ� ������ ���� �߻�
		float var2 = 3.14F;
		// 'F' �� float �� ������ �����̴�.
		System.out.println(var2);
		
		double var3 = 0.1234567890123456789;
		// 0.12345678901234567 ���� ǥ�� �Ҽ��� 18�ڸ�
		float var4 = 0.1234567890123456789F;
		// 0.12345678 ���� ǥ�� �Ҽ��� 8�ڸ�
		System.out.println(var3);
		System.out.println(var4);
	}
}
