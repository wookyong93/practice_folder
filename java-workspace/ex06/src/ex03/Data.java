package ex03;

public class Data {
	private String name;
	private int age;
	
	Data(){
		//생성자 : 생성 될 때 실행되는 메서드
		//생략 가능 : 없어도 객체는 생성이 가능
		//default 생성자
		this.name = "홍길동";
		this.age =33; 
	}
	Data(String name){
		this.name =name;
	}
	Data(int age){
		this.age =age;
	}
	
	Data(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
}
