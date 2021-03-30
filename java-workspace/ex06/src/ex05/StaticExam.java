package ex05;

public class StaticExam {
	//static : 정적
	//static은 실행 할때 미리 생성되는 것들을 의미한다.
	//main () 메서드는 실행할 때 제일 먼저 자동으로 실행되는 메서드가 되는 것.
	//static 키워드는 static 끼리만 연결이 자유롭다 .
	static int num = 1;
	public void output1 () {
		System.out.println("num 값 : " + num);
		System.out.println("output1 메서드");
		num++;
	}
	public static void output() {
		System.out.println("output 메서드");
	}
	public static void main(String[] args) {
	 System.out.println("실행");
	 
	 output();
	 
	 StaticExam e = new StaticExam();
	 e.output1();
	 e.output1();
	 
}
	
}
