package Quiz03;

public class Emloyee extends User {

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.print("직원 이름 입력 : ");
		setName(sc.next());
		System.out.print("직원 나이 입력 : ");
		setAge(sc.nextInt());
		System.out.print("직원 주소 입력 : ");
		setAddr(sc.next());
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("직원 정보");
		System.out.println("직원 이름 : "+getName());
		System.out.println("직원 나이 : "+getAge());
		System.out.println("직원 주소 : "+getAddr());
		
	}

}
