package ex01;

public class OperatorEaxm05 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 10;
		int var3 = 5;
		// == : ����
/*		System.out.println(var1 == var2);
		System.out.println(var1 == var3);
		
		// >,<,<= ,>=
		System.out.println(var1 > var2);
		System.out.println(var1 > var3);
		System.out.println(var1 < var2);
		System.out.println(var3 < var2);
		System.out.println(var1 >= var2);
		System.out.println(var3 >= var2);
		System.out.println(var1 <= var2);
		System.out.println(var1 <= var3);
		
		
		boolean bl1 = true; 
		System.out.println(!bl1);
		boolean bl2 = false;
		System.out.println(!bl2);*/
		// !: NOT ������ �ǹ��Ѵ�.
		
		// && �ΰ��� ������ ��� ���̾�� true
		// || �ΰ��� ���� �� �ϳ��� ���̾ true
		System.out.println(var1 == var2);
		System.out.println(var1 == var2 && var1 >var3);
		//var1 == var2 => �� && var1 > var3 => ��
		System.out.println(var1 == var2 && var1 < var3);
		System.out.println(var1 == var2 || var1 < var3);
		// ~ :bit �� NOT (����)�� �ǹ��Ѵ�.
		System.out.println(~10);
		//0000 1010 => 1111 0101 => 2�Ǻ��� 
		
	}
	

}
