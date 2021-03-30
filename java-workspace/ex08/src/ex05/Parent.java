package ex05;

public class Parent {
	protected String name;
	protected int age;
	Parent(String n, int a ){
		this.name = n;
		this.age = a;
	}
	protected void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	}
}
