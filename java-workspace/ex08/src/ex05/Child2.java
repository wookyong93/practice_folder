package ex05;

public class Child2	extends Parent {

	Child2(String n, int a) {
		super(n, a);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void output() {
		// TODO Auto-generated method stub
		System.out.println("������ : " +name);
		System.out.println("�ӵ� : "+age);
	}

}
