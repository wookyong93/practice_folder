package ex08;

public class CcarExam {
		public static void main(String[] args) {
			Kia k= new Kia();
			k.input("니로",160,1600,3200);
			
			Hyndai h = new Hyndai();
			h.input("현대", 140, 3, 3000);
		
			k.output();
			System.out.println("===========");
			h.output();
		}
}
