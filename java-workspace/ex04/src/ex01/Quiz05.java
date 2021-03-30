package ex01;

public class Quiz05 {
	public static void main(String[] args) {
		int var = 55;
		if (var >= 0 && var <= 50) { // && 포함 범위 의미
			System.out.println("저장된 값은 0 ~ 50 사이입니다.");
				if (var%3==0) {
				System.out.println("저장된 값은 3의 배수입니다.");
				}
				if (var%4==0) {
				System.out.println("저장된 값은 4의 배수입니다.");
				}
		}else {
			System.out.println("저장된 값은 "+var+"입니다.");
			}
	}
}
