package ex02;

public class Exam {
	public static void main(String[] args) {
//		ParentClass p = new ParentClass();
//		
//		p.inPut();
//		p.output();
//		
//		ChildClass c = new ChildClass();
//		
//		c.inPut();
//		c.output();
//		c.getAvg();
//		c.getSum();
		
		UserParent p = new UserParent();
		UserChild c = new UserChild();
		p.input();
		p.output();
		c.input();
		c.output();
	}
}
