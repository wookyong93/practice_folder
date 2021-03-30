package ex01;

public class OperatorExam02 {
	public static void main(String[] args) {
		// 대입 연산자 
		// = : 오른쪽에 있는 값이나 연산의 결과값을 왼쪽에 변수에 대입한다.
		int var1 = 10 + 20;
		System.out.println(var1);
		// += : a += 10 => a = a+10;
		// -= : a -= 10 => a = a-10;
		// *= : a *= 10 => a = a*10;
		// /= : a /= 10 => a = a/10;
		// %= : a %= 10 => a = a%10;
		var1 += 10; // var1 = var1 + 10; 30 + 10 을 var1 으로 대입
		System.out.println(var1);
		
		// &= : and 조합 : 둘다 1이면 1로 처리
		// ^= : xor 조합 : 한쪽만 1이면 1, 둘다 1이거나 0 이면 0으로 처리
		// |= : or 조합 : 한쪽 또는 양쪽 1이면 1, 둘다 0이면 0으로 처리
		// <<= : shift 연산
		// >>= : shift 연산
		// >>>= : shift 연산
		
		// 10 => 1010
		//  7 => 0111
		//  & => 0010 => 2
		System.out.println(10&7);
		// 10 => 1010
		//  7 => 0111
		//  ^ => 1101 => 13
		System.out.println(10^7);
		// 10 => 1010
		//  7 => 0111
		//  | => 1111 => 15
		System.out.println(10|7);
		
		int var2 = 10;
		var2 &= 7;
		System.out.println(var2);
		var2 = 10;
		var2 ^= 7;
		System.out.println(var2);
		var2 = 10;
		var2 |= 7;
		System.out.println(var2);
	}
}
