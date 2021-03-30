package ex01;

public class Quiz03 {
	public static void main(String[] args) {
		int var1 = 11;
		int var2 = 22;
		int var3 = 12;
	    int res = var3 > var2 ? var3 : var2 ;
	    int res2 = var1 > var3 ? var1 : var3;
	    int res3 = var2 > var1 ? var2 : var1;
	    int max = res > res2 ? res : res2 ;
	    int max2 = res2 > res3 ? res2 : res3;
	    System.out.println(max > max2 ? max : max2);
	    int max3 = var1 > var2 ? var1> var3 ? var1 :var3 : var2 > var3 ? var2 :var3;
	    System.out.println(max3);
	    int var4 = 10;
	    int var5 = 5;
	    int var6 = 1;
	   System.out.println(var4 > var5 ? (var4 > var6 ? var4 : var6) : (var5 > var6 ? var5 : var6));
	    int result2 =var4 > var5 ? var4 : var5;
	    int tmp = var1 > var2 ? var1 : var2;
	    System.out.println(tmp > var3 ? tmp : var3);
	    int result = result2 > var6 ? result2 : var6;
	    		System.out.println(result);
	}
}
