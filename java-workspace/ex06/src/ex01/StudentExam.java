package ex01;

public class StudentExam {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조한다.");
		Student s2 = new Student();
		System.out.println("s2 변수가 Student 객체를 참조한다.");
		
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 90;
		s1.math = 80;
		
		s2.name ="이순신";
		s2.kor = 100;
		s2.eng = 99;
		s2.math = 97;
		
		//인스턴스 
		
		System.out.println("s1 의 이름 : "+s1.name);
		System.out.println("s1 의 국어 : "+s1.kor);
		System.out.println("s1 의 영어 : "+s1.eng);
		System.out.println("s1 의 수학 : "+s1.math);
		
		
		System.out.println("s2 의 이름 : "+s2.name);
		System.out.println("s2 의 국어 : "+s2.kor);
		System.out.println("s2 의 영어 : "+s2.eng);
		System.out.println("s2 의 수학 : "+s2.math);
		
		
		System.out.println("s1 의 총점 : "+s1.scoreSum());
		System.out.println("s2 의 총점 : "+s2.scoreSum());
		
		int s1Sum = s1.scoreSum();
		int s2Sum = s2.scoreSum();
		
		System.out.println("s1의 평균 : "+s1.ScoreAvg(s1Sum));
		System.out.println("s2의 평균 : "+s2.ScoreAvg(s2Sum));
		
		System.out.println(s1 == s2);
		System.out.println(s1 instanceof Student);
		System.out.println(s2 instanceof Student);
	}
}
