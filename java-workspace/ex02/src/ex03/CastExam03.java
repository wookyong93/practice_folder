package ex03;

public class CastExam03 {
	public static void main(String[] args) {
		int var1 =  10;
		int var2 = 3;
		System.out.println(var1 + var2);
		System.out.println(var1 - var2);
		System.out.println(var1 * var2);
		System.out.println(var1 / var2);
		System.out.println(var1 / (double)var2);
		System.out.println((double)var1 / var2);
		System.out.println((double)var1 / (double)var2);
		// 정수와 정수를 연산하면 정수의 결과값이 나온다.
		// 정수와 실수를 연산하면 실수의 결과값이 나온다.
		
		double result = var1 / var2;
		System.out.println(result);
		result = var1 / (double)var2;
		System.out.println(result);
		result = var1 / 3;
		System.out.println(result);
		result = (double)var1 / 3;
		System.out.println(result);
		result = var1 / 3.0;
		System.out.println(result);
		
		String name = "권우경";
				System.out.println(name);
	}
}