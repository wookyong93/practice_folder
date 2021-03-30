package ex03;

public class Exam {
	public static void main(String[] args) {
		Data d1 = new Data(); // default 생성자로 Data 인스턴스를 생성
		
		System.out.println(d1.getName());
		
		Data d2 = new Data("홍길동");
		System.out.println(d2.getName());
		
		Data d3 = new Data(22);
		System.out.println(d3.getAge());
		
		d2 = new Data("이순신",33);
		System.out.println(d2.getName());
		System.out.println(d2.getAge());
		
		DataTest ddd =new DataTest(22);		
		ddd.get();
		
		DataTest ddd2 =new DataTest(3,10);		
		ddd2.get();
	}
}
