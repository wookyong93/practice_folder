package ex01;

public class OperatorExam05 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 13;
		
		String result = var1 < var2 ?"var1�� ũ��" : "var2�� ũ��";
		 // ���Ǻ� ? "��¹�" : "��¹�
		System.out.println(result);
		
		System.out.println(var1 > var2 ? "var1�� ũ��":"var2�� ũ��");
		int rest = var1 > var2 ? var1-var2 : var2-var1;
		System.out.println(rest);
		
	}
}
