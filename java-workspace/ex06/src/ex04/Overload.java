package ex04;

public class Overload {
	int num1;
	int num2;
	int num3;
	double db1;
	
	public void get() {
		System.out.println("num1 :" +this.num1);
		System.out.println("num2 :" +this.num2);
		System.out.println("num3 :" +this.num3);
		
	}
	
	public void input() {
		this.num1 = 1; 
		this.num2 = 2;
		this.num3 = 3;
		
	}
	public void input(int num1) {
		this.num1 = num1; 
		this.num2 = 2;
		this.num3 = 3;
		
	}
//	public void input(int num2) {
//		this.num1 = 1; 
//		this.num2 = num2;
//		this.num3 = 3;
//		
//	}
	public void input(int num1,int num2) {
		this.num1 = num1; 
		this.num2 = num2;
		this.num3 = 3;
		
	}
	public void input( int num1,double db1) {
		this.db1 = db1;
		this.num1 =num1;
		
	}
	public void input(double db1,int num1) {
		this.db1 = db1;
		this.num1 =num1;
		
	}
}
