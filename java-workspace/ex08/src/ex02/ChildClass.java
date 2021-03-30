package ex02;

import java.util.Scanner;

public class ChildClass extends ParentClass {
	
	public void getSum() {
		System.out.println("ÃÑÁ¡ : "+(this.kor+this.eng+this.math));
	}
	public void getAvg() {
		System.out.println("Æò±Õ: "+(this.kor+this.eng+this.math)/3.0);
	}

}
