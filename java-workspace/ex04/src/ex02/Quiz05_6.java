package ex02;

import java.util.Scanner;

public class Quiz05_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("계산할 첫번째 정수 입력 : ");
		int var1 = sc.nextInt();
		System.out.print("계산할 두번째 정수 입력 : ");
		int var2 = sc.nextInt();
		System.out.println("========================");
		System.out.println("1 . 덧셈\n2 . 뺄셈\n3 . 곱셈\n4 . 나눗셈 ");
		System.out.println("========================");
		System.out.print("당신이 사용할 연산은 ? ");
		int num = sc.nextInt();
		System.out.println("========================");
//		if (num>=1 && num <=4) {
//			System.out.println("첫 번째 정수 : "+ var1);
//			System.out.println("두 번째 정수 : "+ var2);
//			if(num <=4 && num>0) {
//				if(num == 1 ) {
//				System.out.printf("%d + %d = %d\n",var1,var2,(var1+var2) );
//				}else if(num == 2 ) {
//					System.out.printf("%d - %d = %d\n",var1,var2,(var1-var2) );
//				}else if(num == 3 ) {
//					System.out.printf("%d * %d = %d\n",var1,var2,(var1*var2) );
//				}else if(num == 4 ) {
//				System.out.printf("%d / %d = %.2f",var1,var2,((double)var1/var2));
//				}
//			}
//		} else  {
//			System.out.println("연산 입력이 잘못되었습니다.");
//			}
		
		if (num>=1 && num <=4) {
			
			
			System.out.println("첫 번째 정수 : "+ var1);
			System.out.println("두 번째 정수 : "+ var2);
			
			if(num <=4 && num>0) {
			int result = 0;
			char op = '+' ;
				if(num == 1 ) {
					result = var1+var2;
							op = '+';
				}else if(num == 2 ) {
					result = var1-var2;
					op = '-';
				}else if(num == 3 ) {
					result = var1*var2;
					op = '*';
				}else if(num == 4 ) {
					result = var1/var2;
					op = '/';
				}
			System.out.printf("%d %c %d = %d\n",var1,op,var2,result);
			}
		} else  {
			System.out.println("연산 입력이 잘못되었습니다.");
			}
	}
}
