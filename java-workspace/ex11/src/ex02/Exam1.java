package ex02;

public class Exam1 {
	public static void main(String[] args) {
		String str1 = new String("ȫ�浿");
		String str2 = new String("ȫ�浿");
		String str3 = new String("�̼���");
		String str4 = new String("ȫ��ǥ");
		
		
		if(str1 == str2 ) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		if(str1.equals(str2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}

		System.out.println(str1.compareTo(str2)); // ������ 0�� ��µȴ�.
		System.out.println(str1.compareTo(str3)); // �񱳴�󺸴� ���ڸ��� ���� ��� ���
		System.out.println(str1.compareTo(str4)); // �񱳴�󺸴� ���ڸ��� ���� ��� ���� 
	}
}
