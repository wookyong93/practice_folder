package ex03;

public class CastExam02 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 20;
		int result = var1 + var2;
		System.out.println(result);
		
		double var3 = 1.234;
		double var4 = 2.345;
		double result2 = var3 + var4;
		System.out.println(result2);
		
		int var5 = 10;
		double var6 = 1.2;
		int result3 = var5 + (int)var6;
		double result4 = var5 + var6;
		System.out.println(result3);
		System.out.println(result4);
	}
}
