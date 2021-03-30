package Quiz;

public class Calc { // 1개의 클레스
	//클레스는 설계도!
	
	
	public int add(int a, int b) {
		
		return a+b;
	}//1개의 메소드
		
	public int min(int a , int b) {
		return a-b;
	}//1개의 메소드
	public int mul(int c, int d) {
		return c*d;
	}//1개의 메소드
	
	public double div(int c, int d) {
		return c/ (double)d;
	}//1개의 메소드
	
	//Calc 라는 클레스엔 총 4개의 메소드가 존재 
}
