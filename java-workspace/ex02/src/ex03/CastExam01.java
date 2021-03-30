package ex03;

public class CastExam01 {
	public static void main(String[] args) {
		byte b = 10;
		System.out.println(b);
		short s = b;
		System.out.println(s);
		int i = s;
		System.out.println(i);
		long l = i;
		System.out.println(l);
		
		i = (int) l;
		s = (short) i;
		b = (byte) s;
		
		
		float f = 0.123F;
		double d = f;
		f = (float) d;
		System.out.println(f);
		System.out.println(d);
		
		int var1 = 1000;
		byte var2 = (byte)var1;
		System.out.println(var2);
		
		double var3 = 5.123456789;
		int var4 = (int)var3;
		System.out.println(var4);
	}
}
