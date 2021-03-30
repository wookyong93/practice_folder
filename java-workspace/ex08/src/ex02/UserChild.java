package ex02;

public class UserChild extends UserParent {
	String id;
	String pw;
	
	public void input() {
		super.input();
		System.out.println("id 입력 : ");
		id = sc.next();
		System.out.println("pw 입력 : ");
		pw =sc.next();
		
	}
	public void output() {
		super.output();
		System.out.println("id : "+this.id);
		System.out.println("pw : "+this.pw);
		
	}

}
