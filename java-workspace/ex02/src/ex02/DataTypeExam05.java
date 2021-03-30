package ex02;

public class DataTypeExam05 {
	public static void main(String[] args) {
		double var1 = 3.14;
		System.out.println(var1);
		
		// float var2 = 3.14; 
		// 실수를 표현하는 값은 기본 데이터 형식이 double 이다.
		// 8byte인 double의 값을 4byte인 float 에 넣기 때문에 에러 발생
		float var2 = 3.14F;
		// 'F' 는 float 의 데이터 형식이다.
		System.out.println(var2);
		
		double var3 = 0.1234567890123456789;
		// 0.12345678901234567 까지 표현 소숫점 18자리
		float var4 = 0.1234567890123456789F;
		// 0.12345678 까지 표현 소수점 8자리
		System.out.println(var3);
		System.out.println(var4);
	}
}
