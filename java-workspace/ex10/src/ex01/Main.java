package ex01;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		//�ν��Ͻ� �ɹ� Ŭ���� -> ��A Ŭ������ ��ü�� ������ B �� ����� �� ����.
		A.B b = a.new B();
		b.num1 = 10;
		b.method1();
		
//		A.B b1 =new A.B();
		//�����ɹ� Ŭ����
		A.C c = new A.C();
		c.num2 = 20 ;
		c.num3 = 30;
		c.method2();
		c.method3();
		
		A.C.num3 = 20;
		A.C.method3();
		//A.C c1 = a.new C();
	
		//���� Ŭ����
		a.method();
	}
}
