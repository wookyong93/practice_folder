package ex04;

public class OverLoadExam {
	public static void main(String[] args) {
		//�����ε�� ���� �̸��� �޼��带 ���ڰ����� �����ؼ� ó�� �� �� �ִ°��� �ǹ��Ѵ�.
		//�����ε� ��Ģ 
		//1. ���ڰ��� �ϳ� �϶��� �ڷ����� �޶�� ���
		//2. ������ ������ ����.
		//3. �ڷ����� ���ٰ� �ϴ��� ������ �ٸ��� ����� �� �ִ�.(���� �ڷ����� �Ұ���)
		//*** ����ڷ����̶� �������
		Overload o = new Overload();
		o.input();
		o.get();
		
		o.input(11);
		o.get();
		
		o.input(11,22); // num1, num2 �� ����
		o.get();
		
		o.input(11,1.1);
		o.input(1.1, 11);
	}
}
