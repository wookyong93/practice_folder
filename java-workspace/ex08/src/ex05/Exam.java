package ex05;

public class Exam {
	public static void main(String[] args) {
		Child1 c1 = new Child1("È«±æµ¿",100);
		Child2 c2 = new Child2("È«±æµ¿" ,100);
		
		c1.output();
		c2.output();
	
		Parent p1 = new Child1("ÀÌ¼ø½Å",200);
		p1.output();
		Parent p2 = new Child2("±èÀ¯½Å",300);
		p2.output();
		
//		Child1 c3 = new Child2("È«±æµ¿",500)
//				c3.output();
//	
	}
	
	
}
