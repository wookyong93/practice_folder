package ex01;

public class RefExam05 {
	public static void main(String[] args) {
//		String str = null;
//		
//		System.out.println(str.length());
		String str1 = "�ڹ�";
		String str2 = new String("�ڹ�");
		String str3 = "�׽�Ʈ";
		if(str1 == str2) {
			System.out.println("���� ������ ��ü�� �����մϴ�.");
		}else {
		System.out.println("�ٸ������ǰ�ü�� �����մϴ�.");
		}
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}
}
