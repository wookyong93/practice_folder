package Quiz03;

import java.util.Scanner;

public abstract class User {
	private String name;
	private int age;
	private String addr;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	Scanner sc = new Scanner(System.in);
	public abstract void input();
	
	public abstract void output();

	
	
}
