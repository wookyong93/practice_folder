package ex01;

public class Exam2 {
	public static void main(String[] args) {
		User origin = new User();
		origin.number  = 10;
		origin.name = "ȫ�浿";
		
		System.out.println("���� : "+ origin.number+", "+origin.name);
		
		User copy = origin;
		
		System.out.println("���� : "+ copy.number+", "+copy.name);
		
		copy.number = 100;
		copy.name = "�̼���";
		System.out.println("���� : "+ origin.number+", "+origin.name);
		System.out.println("���� : "+ copy.number+", "+copy.name);
		
		User clo = origin.userClone();
		System.out.println("���� ���� : "+ clo.number+", "+clo.name);
		clo.name = "������";
		clo.number = 200;
		
		System.out.println("���� : "+ origin.number+", "+origin.name);
		System.out.println("���� : "+ copy.number+", "+copy.name);
		System.out.println("���� ���� : "+ clo.number+", "+clo.name);
	}
}
