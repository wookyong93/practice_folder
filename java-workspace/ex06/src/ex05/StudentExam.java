package ex05;

public class StudentExam {
	static final double PI=3.141592;
	// final = 값을 변경할 수 없다.
	//final 선언시에 값을 초기화 해줘야한다.
	final double aaa=1.1;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		System.out.println(s1.classNum);
		
		Student s2 = new Student();
		
		System.out.println(s2.classNum);
		
		Student s3 = new Student();
		
		System.out.println(s3.classNum);
		System.out.println(PI);
		//PI = 3.14;
		System.out.println(PI);
		
		Student.classNum= 5;
		System.out.println(Student.classNum);
		
		StaticExam.output();
	}
}
