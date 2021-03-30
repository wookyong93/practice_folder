package ex05;

public class WhileExam01 {
	public static void main(String[] args) {
		//for (시작값; 종료식; 증감값)
		// 규칙상 시작값과 종료식, 증감값을 사용하도록 되어 있다.
		
		int i = 0;
		//외부 시작값
		while(i<10) {//종료식만 존재 
			System.out.println("HI");
			i++; //내부에서 반드시 증감값을 만들어줘야한다. 그렇지 않으면 무한반복이된다.
		}
	}
}
