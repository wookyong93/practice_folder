package ex05;

public class StaticExam {
	//static : ����
	//static�� ���� �Ҷ� �̸� �����Ǵ� �͵��� �ǹ��Ѵ�.
	//main () �޼���� ������ �� ���� ���� �ڵ����� ����Ǵ� �޼��尡 �Ǵ� ��.
	//static Ű����� static ������ ������ �����Ӵ� .
	static int num = 1;
	public void output1 () {
		System.out.println("num �� : " + num);
		System.out.println("output1 �޼���");
		num++;
	}
	public static void output() {
		System.out.println("output �޼���");
	}
	public static void main(String[] args) {
	 System.out.println("����");
	 
	 output();
	 
	 StaticExam e = new StaticExam();
	 e.output1();
	 e.output1();
	 
}
	
}
