package ex01;

public class IfExam06 {
	public static void main(String[] args) {
		int var1 = 20, var2 = 20, var3 = 50;
		
		if (var1 >= var2) {
			// var1이 var2 보다 크거나 같다.
			if(var1 > var3) {
				if (var1 == var2) {
					// var1과 var2가 같다.
					System.out.println("var1과 var2의 값은 같다.");
				} else {
					// var1이 var3 보다 크다.
					System.out.println("var1 제일 큰값이다.");
				}
			} else {
				if (var3 > var1) {
					// var3이 var1 보다 크다.					
					System.out.println("var3 제일 큰값이다.");
				} else if (var1 == var3) {
					// var1과 var3이 같다.
					System.out.println("var1과 var3의 값은 같다.");
				} 
			}
		} else if (var2 > var1) {
			// var2가 var1보다 크다.
			if (var2 > var3) {
				// var2가 var3 보다 크다.
				System.out.println("var2 제일 큰값이다.");
			} else { 
				if (var3 > var2) {
					// var3이 var2보다 크다
					System.out.println("var3 제일 큰값이다.");
				} else if (var2 == var3) {
					// var2와 var3이 같다.
					System.out.println("var2와 var3의 값은 같다.");
				}
			}
		}
		
		if (true) {
			if(true) {
				System.out.println("중첩if");
			}
			System.out.println("중첩 if 종료");
		}
		
		System.out.println("출력");
	}
}
