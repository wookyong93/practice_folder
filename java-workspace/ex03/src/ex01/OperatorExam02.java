package ex01;

public class OperatorExam02 {
	public static void main(String[] args) {
		// ���� ������
		// = : �����ʿ� �ִ� ���̳� ������ ���ʿ� ������ �����Ѵ�.
		int var1 = 10 + 20;
		System.out.println(var1);
		// += : a += 10; => a = a + 10;
		// -= : a -= 10; => a = a - 10;
		// *= : a *= 10; => a = a * 10;
		// /= : a /= 10; => a = a / 10;
		// %= : a %= 10; => a = a % 10;
		var1 += 10; // var1 = var1 + 10; 30 + 10 �� var1  ���� ����.
		System.out.println(var1);
		
		// &= : and ���� : �Ѵ� 1�̸� 1�� ó�� 
						//���ϴ� 2���� bit�� ��� 1�̸� 1�� ó�� �������� 0
		// ^= : xor ���� : ���ʸ� 1 �̸� 0 �Ѵ� 1�̸� 1 ���� ó��
						// ���ϴ� 2���� bit �� ���ʸ� 1�̸� 1��ó�� �������� 0���� ó��
		// |= : or ���� : �Ѵ� 1�̸� 1, ���ʸ� 1�̸� 1, �Ѵ� 0 �̸� 0���� ó��
						// ���ϴ� 2���� bit �� 1�������� 1�� ó�� �������� 0���� ó��
		// <<= : shift ����
		// >>= : shift ����
		// >>>= : shift ����
		
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
		var2 = 10;
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
