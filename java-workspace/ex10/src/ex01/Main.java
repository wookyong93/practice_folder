package ex01;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스 맴버 클래스 -> ㅁA 클래스의 객체가 없으면 B 를 사용할 수 없다.
		A.B b = a.new B();
		b.num1 = 10;
		b.method1();
		
//		A.B b1 =new A.B();
		//정적맴버 클래스
		A.C c = new A.C();
		c.num2 = 20 ;
		c.num3 = 30;
		c.method2();
		c.method3();
		
		A.C.num3 = 20;
		A.C.method3();
		//A.C c1 = a.new C();
	
		//로컬 클래스
		a.method();
	}
}
