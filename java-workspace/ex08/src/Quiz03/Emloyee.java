package Quiz03;

public class Emloyee extends User {

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.print("���� �̸� �Է� : ");
		setName(sc.next());
		System.out.print("���� ���� �Է� : ");
		setAge(sc.nextInt());
		System.out.print("���� �ּ� �Է� : ");
		setAddr(sc.next());
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("���� ����");
		System.out.println("���� �̸� : "+getName());
		System.out.println("���� ���� : "+getAge());
		System.out.println("���� �ּ� : "+getAddr());
		
	}

}
