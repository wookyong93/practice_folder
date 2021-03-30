package ex01;

public class IfExam01 {
	public static void main(String[] args) {
		int var = 27;
		// main 의 괄호이므로 if 문 2개에 사용가능.
		if(var < 26) {
			//int var = 100; 이었으면 if 괄호 안에서 밖으로 사용못한다.
			System.out.println("현재 온도는 "+var+ "도 입니다. 히터를 가동합니다");
		}
				System.out.println("끝");
				int var1 = 10;
				int var2 = 5;
				if (var1 > var2)
					System.out.println("var1 값이 더 큽니다.");
				if(var2 > var1)
					System.out.println("var2 값이 더 큽니다.");
			
	}	
}
