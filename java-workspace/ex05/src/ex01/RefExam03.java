package ex01;

public class RefExam03 {
	public static void main(String[] args) {
		String var1 = "�ڹ�";
		String var2 = "�ڹ�";
		String var3 = new String("�ڹ�");
		
		if(var1 == var2 ) {
			System.out.println("var1 �� var2 �� ���� ��ü�Դϴ�.");
		}else {
			System.out.println("var1 �� var2 �� �ٸ� ��ü�Դϴ�.");
			
		}
		if(var1 == var3 ){
			System.out.println("var1 �� var3 �� ���� ��ü �Դϴ�.");
		}else {
			System.out.println("var1 �� var3 �� �ٸ� ��ü �Դϴ�.");
		}
	}
}
