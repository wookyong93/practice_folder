package ex02;

public class OutExam02 {
	public static void main(String[] args) {
		double d1 = 1.1;
		System.out.println(d1);
		System.out.printf("%f\n",d1);
		// % ��ü����. �Ҽ��� �Ʒ� ���� ���� - ��ü������ ������ ����
		System.out.printf("%10f\n",d1);
		// % ��ü����. �Ҽ��� �Ʒ� ���� ���� - ��ü������ ���� ����
		System.out.printf("%-10f\n",d1);
		System.out.printf("%10.2f\n",d1);
		// ��ü ���̰� ����ؾ� �� �������� ������ ����� ������ �׳� ���
		System.out.printf("%5.8f\n",d1);
		
		int var =100;
		System.out.printf("%5d\n",var);
		System.out.printf("%-5d\n",var);
		System.out.printf("%05d\n",var);
	}
}
