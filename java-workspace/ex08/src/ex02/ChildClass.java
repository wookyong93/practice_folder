package ex02;

import java.util.Scanner;

public class ChildClass extends ParentClass {
	
	public void getSum() {
		System.out.println("���� : "+(this.kor+this.eng+this.math));
	}
	public void getAvg() {
		System.out.println("���: "+(this.kor+this.eng+this.math)/3.0);
	}

}
