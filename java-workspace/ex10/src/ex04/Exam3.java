package ex04;

public class Exam3 {
	public static void main(String[] args) {
			try {
				findClass();
			}catch(Exception e) {
				System.out.println("Ŭ������ ã�� �� �����ϴ�.");
				e.printStackTrace();
			}
	}
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}
}
