package ex05;

public class Child1 extends Parent{

	Child1(String n, int a) {
		super(n, a);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void output() {
		// TODO Auto-generated method stub
		System.out.println("���̵� : "+name);
		System.out.println("��ȣ : "+age);
	}

}
