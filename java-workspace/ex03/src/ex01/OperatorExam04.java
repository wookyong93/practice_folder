package ex01;

public class OperatorExam04 {
	public static void main(String[] args) {
		//++ , -- : 1�� �����ϰų� �����Ѵ�. �տ� ���� ���� �����ϰ� ��� �ڿ����� ����ϰ� ����
		int var1 =10;
		System.out.println(var1++);
		//���� �ڿ� ++ ��ȣ�� ������ �����ϱ� ���� ��¸��� �ϰ� �����Ѵ�.
		//10 ������ϰ� +1 ���ؼ� 11�� �Ȼ���
		System.out.println(++var1);
		// ���� �տ� ++ ��ȣ�� ������ ������ ���� �ϰ� ����� �Ѵ�.
		// 11���� +1 �� �Ŀ� 12�� ����Ѵ�
		System.out.println(var1);
		
		System.out.println(var1--);
		System.out.println(--var1);
		System.out.println(var1);
	}
}
