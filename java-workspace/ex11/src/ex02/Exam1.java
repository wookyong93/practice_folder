package ex02;

public class Exam1 {
	public static void main(String[] args) {
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		String str3 = new String("이순신");
		String str4 = new String("홍학표");
		
		
		if(str1 == str2 ) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(str1.equals(str2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}

		System.out.println(str1.compareTo(str2)); // 같으면 0이 출력된다.
		System.out.println(str1.compareTo(str3)); // 비교대상보다 앞자리의 값일 경우 양수
		System.out.println(str1.compareTo(str4)); // 비교대상보다 뒷자리의 값일 경우 음수 
	}
}
