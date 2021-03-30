package ex06;

public class BreakExam01 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		int i= 0 ;
		while(true) {
			System.out.println(i);
			if(i==5) {
				break;
			}
			i++;
		}
	}
}
