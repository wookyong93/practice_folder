package Quiz;

import java.util.Scanner;

public class CalcExam {//인스텐스 => Calc 라는 설계도를 가지고 만들 물품 이다 라고 이해 하면 된다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번쨰 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번쨰 정수 입력 : ");
		int num2 = sc.nextInt();
		
		Calc calc = new Calc(); // 클레스 Calc 의 변수 Calc를 작성하고 그 기능을 불러온다
		
		
		calc.add(num1,num2); //클레스 Calc 의 기능호출
		calc.min(num1,num2);
		calc.mul(num1,num2);
		calc.div(num1,num2);
		
		System.out.println(calc.add(num1,num2));
		System.out.println(calc.min(num1,num2));
		System.out.println(calc.mul(num1,num2));
		System.out.println(calc.div(num1,num2));
	}
}
