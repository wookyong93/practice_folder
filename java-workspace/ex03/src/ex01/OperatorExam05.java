package ex01;

public class OperatorExam05 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 13;
		
		String result = var1 < var2 ?"var1이 크다" : "var2이 크다";
		 // 조건부 ? "출력문" : "출력문
		System.out.println(result);
		
		System.out.println(var1 > var2 ? "var1이 크다":"var2이 크다");
		int rest = var1 > var2 ? var1-var2 : var2-var1;
		System.out.println(rest);
		
	}
}
