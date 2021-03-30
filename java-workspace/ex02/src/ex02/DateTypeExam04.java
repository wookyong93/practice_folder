package ex02;

public class DateTypeExam04 {
	public static void main(String[] args) {
		int var1 = 100;
		long var2 =200;
		
		// int var3 = 1000000000000; // 범위가 넘었기 때문에 에러 발생
		long var3 = 1000000000000L;
		// 대입되는 값이 아무 표시 없으면 int 의 범위 내에서 표현이 된다
		// long 으로 사용하고 싶다면 long 표현인 'L' 을 입력하여 사용할 수 있다.
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
	}
}
