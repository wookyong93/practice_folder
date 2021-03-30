package ex01;

public class OperatorExam01 {
	public static void main(String[] args) {
		// »ê¼ú ¿¬»êÀÚ + - * / %
		int var1 = 10;
		int var2 = 5;
		int var3 = 3;
		System.out.println(var1 + var2); // µ¡¼À
		System.out.println(var1 - var2); // »¬¼À
		System.out.println(var1 * var2); // °ö¼À
		System.out.println(var1 / var2); // ³ª´°¼À
		System.out.println(var1 / var3); // ³ª´°¼À : ³ª´« ¸ò
		System.out.println(var1 % var3); // ³ª´°¼À : ³ª´« ³ª¸ÓÁö°ª
		
		int var4 = -3;
		int var5 = +5;
		System.out.println(var4 + var5);
		System.out.println(var4 - var5);
		
		String first = "ÀÌÁ¨";
		String mid = "ÄÄÇ»ÅÍ";
		String last = "ÇĞ¿ø";
		System.out.println(first + mid + last);
		// ¹®ÀÚ¿­Àº + ·Î ´Ù¸¥ ¹®ÀÚ¿­À» ¿¬°á ÇØ ÁØ´Ù.
		// ¹®ÀÚ¿­ ¿¬»êÀ¸·Î - * / ´Â »ç¿ëÇÒ ¼ö ¾ø´Ù.
	}
}
