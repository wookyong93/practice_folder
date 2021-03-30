package ex02;

public class A {
	//인스턴스 맴버 클래스
	class B{}
	//정적 맴버 클래스
	static class C{}
	
	//A 클래스에서 인스턴스와 static 중첩클래스의 객체를 생성할 수 있다.
	B var1  = new B();
	C var2 = new C();
	
	void method1() {// 일반 메서드에서 인스턴스와 static 중첩 클래스를 생성할 수 있다.
		B num1 = new B();
		C num2 = new C();
	}
	//static 객체는 static 중첩클래스만 만들 수 있다.
//	static B str1 = new B();
	static C str2 = new C();
	
	static void method2 () {
		//static 메서드에서는 static 객체만 만ㄷ르 수 있다.
		//B fl01 = new B();
	C flo2 = new C ();	
	}
}
