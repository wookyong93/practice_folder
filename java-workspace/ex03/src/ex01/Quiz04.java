package ex01;

public class Quiz04 {
	public static void main(String[] args) {
		int var1 = 19 ;
		int A = 1&var1;
		int B = 0&var1;
		String res = A == B ? "변수의 값은 짝수입니다.": "변수의 값은 홀수입니다.";
		
		//조건은 결과값이 참과 거짓으로 구분되는 것을 의미한다.
		String result = var1%2 == 1 ? "변수의 값이 홀수입니다." : "변수의 값이 짝수입니다.";
		System.out.println(result);
		
		System.out.println(res);
		int var2 =0;
		System.out.println(var2==0 ? "0입니다." :var2 >= 1 ? "양수입니다." : "음수입니다.");
		
		System.out.println( var2 == 0 ? "변수의값이 홀수도 짝수도아닙니다" : var2%2 == 1 ? "변수의 값은 홀수입니다." : "변수의 값은 짝수입니다.");
		// 조건문 ? 참값 : 조건문 ? 참 : 거짓 ;
		// 값이 0가 같다면 ? 참이면 참 : 값이 짝수 ? 값이 짝수 : 값이 홀수 ;
		// var2 ==0 은 조건문?  참 : var2%2==1 (거짓일경우의 조건문) ? 참 : 거짓;	
		}
}
