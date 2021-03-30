package ex01;

public class IfExam03 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 10;
		
		if (var1>var2) {
			System.out.println("var1이 큽니다.");
		}
		else if (var1<var2){
			System.out.println("var2이 큽니다.");
		}
		else if(var1 == var2) {
			System.out.println("var1 과 var2 는 같습니다.");
		}else {
			System.out.println("값이 없습니다.");
		}
		
		
		int var = 11;
		
		if (var == 0) {
			System.out.println("0은배수가아닙니다.");
		}
		else if (var%3 == 0 && var%5 == 0) {
			System.out.println("3과5의 배수 입니다.");
		}
		else if (var%3 == 0) {
			System.out.println("3의 배수 입니다.");
		}else if(var%5 == 0) {
			System.out.println("5의 배수 입니다.");
		}else {
			System.out.println("3의 배수나 5의 배수가 아닙니다.");
		}
		//큰범위를 먼저 쓴다 정상적인 값을 출력하기 위해 먼저 쓴다.
		
	}
}
