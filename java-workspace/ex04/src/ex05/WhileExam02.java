package ex05;

public class WhileExam02 {
	public static void main(String[] args) {
		int i = 0;// 시작값은 외부
		while(true) {
			System.out.println("HI");
			i++; // 증감식은 내부에
			if(i ==5) {
				break;
			}
		}
	}
}
