package ex01;

public class A {
	A(){
		System.out.println("A ��ü ������");
	}
	
	//�ν��Ͻ� �ɹ� Ŭ���� - �Ϲ� ��ø Ŭ����
	
	public class B{
		B(){
			System.out.println("B��ü ������");
		}
		int num1 =1;
		void method1() {
			System.out.println("class B method1 ����");
		}
		
		// static Ű����� ����� �� ����.
//		static int num2 =2;
//		static void method2() {
//			System.out.println("class B method2 ���� ");
//		}
	}
	//�����ɹ� Ŭ����
	static class C {// ��ø Class �� static Ű���� ����ϸ� ���ο����� static �� ����� �� �ִ�.
		C(){
			System.out.println("C��ü������");
			
		}int num2 = 2 ; 
		static int num3 ;
		void method2() {
			System.out.println("Class C method2 ����");
		}
		static void method3() {
			System.out.println("class C method3 ����");
		}
	}
	//���� Ŭ����
	void method() {
		class D {
			D(){
				System.out.println("D ��ü ������");
			}
			int num4;
			void method4() {
				System.out.println("class D method4 ����");
			}
			//static Ű����� ����� �� ����.
		}
		
		D d = new D ();
		d.num4 =40;
		d.method4();
	}
	
	
}
