package ex01;

public class Exam1 {
	public static void main(String[] args) {
		Object str = new String("ȫ�浿");
		System.out.println(str);
		
		String str1 = (String)str;//������Ʈ�� �ԷµǾ� �Է� ���� �ʴ´�.
		System.out.println(str1);
		
		Exam1 e1 = new Exam1();
		System.out.println(e1.toString());
		
		Exam1 e2 = new Exam1();
		System.out.println(e2.toString());
		
		Exam1 e3 = e1;
		System.out.println(e3.toString());
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
	}
}
