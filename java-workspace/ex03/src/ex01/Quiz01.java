package ex01;

public class Quiz01 {
	public static void main(String[] args) {
		String name = "홍길동";
		int Korean = 100;
		int English = 97;
		int math = 96;
		int sum = Korean + English + math;
		double everage = (double)(Korean + English + math)/3;
		//or double everage = sum/3.0;  or double everage = (double)sum/3;
		System.out.println("이름 : " +name); 
		// 따로 변수 설정시 메모리 용량 사용함
		System.out.println("국어 : " +Korean);
		System.out.println("영어 : " +English);
		System.out.println("수학 : " +math);
		System.out.println("총점 : " +sum);
		System.out.println("평균 : " +everage);
		String 이름 = "홍길동";
		int kor = 100;
		int eng = 97;
		int 수학 = 96;
		int 총점 = kor + eng + 수학;
		double avg = (double) 총점 / 3;
		String menu1 = "이름 : ";
		String menu2 = "평균 : ";
		System.out.println(menu1 + 이름);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(수학);
		System.out.println(총점);
		System.out.println(menu2 + avg);
	
		System.out.println("나의 이름은"+name+"이다.");
	}
}
