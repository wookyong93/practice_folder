package ex01;

public class RefExam03 {
	public static void main(String[] args) {
		String var1 = "자바";
		String var2 = "자바";
		String var3 = new String("자바");
		
		if(var1 == var2 ) {
			System.out.println("var1 과 var2 는 같은 객체입니다.");
		}else {
			System.out.println("var1 과 var2 는 다른 객체입니다.");
			
		}
		if(var1 == var3 ){
			System.out.println("var1 과 var3 은 같은 객체 입니다.");
		}else {
			System.out.println("var1 과 var3 은 다른 객체 입니다.");
		}
	}
}
