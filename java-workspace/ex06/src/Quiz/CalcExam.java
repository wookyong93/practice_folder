package Quiz;

import java.util.Scanner;

public class CalcExam {//�ν��ٽ� => Calc ��� ���赵�� ������ ���� ��ǰ �̴� ��� ���� �ϸ� �ȴ�.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù���� ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι��� ���� �Է� : ");
		int num2 = sc.nextInt();
		
		Calc calc = new Calc(); // Ŭ���� Calc �� ���� Calc�� �ۼ��ϰ� �� ����� �ҷ��´�
		
		
		calc.add(num1,num2); //Ŭ���� Calc �� ���ȣ��
		calc.min(num1,num2);
		calc.mul(num1,num2);
		calc.div(num1,num2);
		
		System.out.println(calc.add(num1,num2));
		System.out.println(calc.min(num1,num2));
		System.out.println(calc.mul(num1,num2));
		System.out.println(calc.div(num1,num2));
	}
}
