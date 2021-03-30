package ex01;

public class A {
	A(){
		System.out.println("A 객체 생성됨");
	}
	
	//인스턴스 맴버 클래스 - 일반 중첩 클래스
	
	public class B{
		B(){
			System.out.println("B객체 생성됨");
		}
		int num1 =1;
		void method1() {
			System.out.println("class B method1 실행");
		}
		
		// static 키워드는 사용할 수 없다.
//		static int num2 =2;
//		static void method2() {
//			System.out.println("class B method2 실행 ");
//		}
	}
	//정적맴버 클레스
	static class C {// 중첩 Class 에 static 키워드 사용하면 내부에서도 static 을 사용할 수 있다.
		C(){
			System.out.println("C객체생성됨");
			
		}int num2 = 2 ; 
		static int num3 ;
		void method2() {
			System.out.println("Class C method2 실행");
		}
		static void method3() {
			System.out.println("class C method3 실행");
		}
	}
	//로컬 클래스
	void method() {
		class D {
			D(){
				System.out.println("D 객체 생성됨");
			}
			int num4;
			void method4() {
				System.out.println("class D method4 실행");
			}
			//static 키워드는 사용할 수 없다.
		}
		
		D d = new D ();
		d.num4 =40;
		d.method4();
	}
	
	
}
