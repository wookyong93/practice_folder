package ex02;

public class A {
	//�ν��Ͻ� �ɹ� Ŭ����
	class B{}
	//���� �ɹ� Ŭ����
	static class C{}
	
	//A Ŭ�������� �ν��Ͻ��� static ��øŬ������ ��ü�� ������ �� �ִ�.
	B var1  = new B();
	C var2 = new C();
	
	void method1() {// �Ϲ� �޼��忡�� �ν��Ͻ��� static ��ø Ŭ������ ������ �� �ִ�.
		B num1 = new B();
		C num2 = new C();
	}
	//static ��ü�� static ��øŬ������ ���� �� �ִ�.
//	static B str1 = new B();
	static C str2 = new C();
	
	static void method2 () {
		//static �޼��忡���� static ��ü�� ������ �� �ִ�.
		//B fl01 = new B();
	C flo2 = new C ();	
	}
}
