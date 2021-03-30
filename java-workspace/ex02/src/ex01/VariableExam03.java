package ex01;

public class VariableExam03 {
	public static void main(String[] args) {
		int var1 = 10;
		System.out.println(var1);
		
		if (true) {
			System.out.println(var1);
			int var2 = 20;
			System.out.println(var2);
			// int var1 = 100; // 에러가 생긴다. 위에 var1 변수명 지정되어 있기 때문이다.
		}
		System.out.println(var1);
		//System.out.println(var2); 
		// 에러가 생긴다 . if.. {} 안에 만들어진 변수명은 중괄호를 벗어나면 변수가 사라진다.
		int var2 =200;
		System.out.println(var2);
	}
}
