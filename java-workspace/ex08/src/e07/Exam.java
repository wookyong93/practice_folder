package e07;

public class Exam {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		
		p1.method1();
		p1.method2();
		
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		
		Parent p2 = c1;
		p2.method1();
		p2.method2();//자식클래스의 오버라이드된 메서드 호출
		
		
		Child c2 = (Child)p2; //변수타입이 부모이고 , 가진 객체가 자식일 경우 형변환이 가능하다.
		c2.method1();
		c2.method2();
		c2.method3();
		
//		Child c3 = (Child)p1; // 부모로 객체를 생성했을경우 자식으로 형변환이 되지 않는다.
//		c3.method1();
//		c3.method2();
//		c3.method3();
		
		System.out.println(p1 instanceof Parent);
		System.out.println(p1 instanceof Child);
		System.out.println(c1 instanceof Parent);
		System.out.println(c1 instanceof Child);
		System.out.println(p2 instanceof Parent);
		System.out.println(p2 instanceof Child);
		System.out.println(c2 instanceof Parent);
		System.out.println(c2 instanceof Child);
	}
}
