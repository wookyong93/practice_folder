package ex01;

public class RefExam05 {
	public static void main(String[] args) {
//		String str = null;
//		
//		System.out.println(str.length());
		String str1 = "자바";
		String str2 = new String("자바");
		String str3 = "테스트";
		if(str1 == str2) {
			System.out.println("같은 번지의 객체를 참조합니다.");
		}else {
		System.out.println("다른번지의객체를 참조합니다.");
		}
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}
}
