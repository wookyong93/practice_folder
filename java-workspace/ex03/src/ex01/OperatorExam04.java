package ex01;

public class OperatorExam04 {
	public static void main(String[] args) {
		//++ , -- : 1씩 증가하거나 감소한다. 앞에 쓰면 연산 먼저하고 출력 뒤에쓰면 출력하고 연산
		int var1 =10;
		System.out.println(var1++);
		//변수 뒤에 ++ 기호가 붙으면 연산하기 전에 출력먼저 하고 연산한다.
		//10 을출력하고 +1 을해서 11이 된상태
		System.out.println(++var1);
		// 변수 앞에 ++ 기호가 붙으면 연산을 먼저 하고 출력을 한다.
		// 11에서 +1 한 후에 12를 출력한다
		System.out.println(var1);
		
		System.out.println(var1--);
		System.out.println(--var1);
		System.out.println(var1);
	}
}
