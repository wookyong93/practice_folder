package ex01;

public class StudentExam {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 ������ Student ��ü�� �����Ѵ�.");
		Student s2 = new Student();
		System.out.println("s2 ������ Student ��ü�� �����Ѵ�.");
		
		s1.name = "ȫ�浿";
		s1.kor = 100;
		s1.eng = 90;
		s1.math = 80;
		
		s2.name ="�̼���";
		s2.kor = 100;
		s2.eng = 99;
		s2.math = 97;
		
		//�ν��Ͻ� 
		
		System.out.println("s1 �� �̸� : "+s1.name);
		System.out.println("s1 �� ���� : "+s1.kor);
		System.out.println("s1 �� ���� : "+s1.eng);
		System.out.println("s1 �� ���� : "+s1.math);
		
		
		System.out.println("s2 �� �̸� : "+s2.name);
		System.out.println("s2 �� ���� : "+s2.kor);
		System.out.println("s2 �� ���� : "+s2.eng);
		System.out.println("s2 �� ���� : "+s2.math);
		
		
		System.out.println("s1 �� ���� : "+s1.scoreSum());
		System.out.println("s2 �� ���� : "+s2.scoreSum());
		
		int s1Sum = s1.scoreSum();
		int s2Sum = s2.scoreSum();
		
		System.out.println("s1�� ��� : "+s1.ScoreAvg(s1Sum));
		System.out.println("s2�� ��� : "+s2.ScoreAvg(s2Sum));
		
		System.out.println(s1 == s2);
		System.out.println(s1 instanceof Student);
		System.out.println(s2 instanceof Student);
	}
}
