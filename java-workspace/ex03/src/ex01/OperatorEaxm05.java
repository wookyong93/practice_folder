package ex01;

public class OperatorEaxm05 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 10;
		int var3 = 5;
		// == : 같다
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
		// !: NOT 반전을 의미한다.
		
		// && 두개의 조건이 모두 참이어야 true
		// || 두개의 조건 중 하나만 참이어도 true
		System.out.println(var1 == var2);
		System.out.println(var1 == var2 && var1 >var3);
		//var1 == var2 => 참 && var1 > var3 => 참
		System.out.println(var1 == var2 && var1 < var3);
		System.out.println(var1 == var2 || var1 < var3);
		// ~ :bit 의 NOT (반전)을 의미한다.
		System.out.println(~10);
		//0000 1010 => 1111 0101 => 2의보수 
		
	}
	

}
