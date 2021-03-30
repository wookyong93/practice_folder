package ex04;

public class OverLoadExam {
	public static void main(String[] args) {
		//오버로드는 같은 이름의 메서드를 인자값으로 구분해서 처리 할 수 있는것을 의미한다.
		//오버로드 규칙 
		//1. 인자값이 하나 일때는 자료형이 달라야 사용
		//2. 갯수의 제한은 없다.
		//3. 자료형이 같다고 하더라도 순서가 다르면 사용할 수 있다.(같은 자료형은 불가능)
		//*** 결과자료형이랑 상관없다
		Overload o = new Overload();
		o.input();
		o.get();
		
		o.input(11);
		o.get();
		
		o.input(11,22); // num1, num2 를 변경
		o.get();
		
		o.input(11,1.1);
		o.input(1.1, 11);
	}
}
