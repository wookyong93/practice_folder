package ex01;

public class Exam2 {
	public static void main(String[] args) {
		User origin = new User();
		origin.number  = 10;
		origin.name = "홍길동";
		
		System.out.println("원본 : "+ origin.number+", "+origin.name);
		
		User copy = origin;
		
		System.out.println("복사 : "+ copy.number+", "+copy.name);
		
		copy.number = 100;
		copy.name = "이순신";
		System.out.println("원본 : "+ origin.number+", "+origin.name);
		System.out.println("복사 : "+ copy.number+", "+copy.name);
		
		User clo = origin.userClone();
		System.out.println("깊은 복사 : "+ clo.number+", "+clo.name);
		clo.name = "유관순";
		clo.number = 200;
		
		System.out.println("원본 : "+ origin.number+", "+origin.name);
		System.out.println("복사 : "+ copy.number+", "+copy.name);
		System.out.println("깊은 복사 : "+ clo.number+", "+clo.name);
	}
}
