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
		p2.method2();//�ڽ�Ŭ������ �������̵�� �޼��� ȣ��
		
		
		Child c2 = (Child)p2; //����Ÿ���� �θ��̰� , ���� ��ü�� �ڽ��� ��� ����ȯ�� �����ϴ�.
		c2.method1();
		c2.method2();
		c2.method3();
		
//		Child c3 = (Child)p1; // �θ�� ��ü�� ����������� �ڽ����� ����ȯ�� ���� �ʴ´�.
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
