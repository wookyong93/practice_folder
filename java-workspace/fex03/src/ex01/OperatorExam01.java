package ex01;

public class OperatorExam01 {
	public static void main(String[] args) {
		// 산술 연산자  + - * / %
		int var1 = 10;
		int var2 = 5;
		int var3 = 3;
		System.out.println(var1 + var2); // 덧셈
		System.out.println(var1 - var2); // 뺄셈
		System.out.println(var1 * var2); // 곱셈
		System.out.println(var1 / var2); // 나눗셈
		System.out.println(var1 / var3); // 나눗셈 : 나눈 몫
		System.out.println(var1 % var3); // 나눗셈 : 나눈 나머지값
		
		int var4 = -3; // 음수
		int var5 = +5; // 양수
		System.out.println(var4 + var5);
		System.out.println(var4 - var5);
		
		String first = "이젠";
		String mid = "컴퓨터";
		String last = "학원";
		System.out.println(first + mid + last);
		// 문자열은 + 로 다른 문자열을 연결 해 준다.
		// 문자열 연산으로 - * / 는 사용할 수 없다.		
	}
}
