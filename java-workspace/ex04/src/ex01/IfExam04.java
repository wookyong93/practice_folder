package ex01;

public class IfExam04 {
	public static void main(String[] args) {
		int var1 = 55, var2 = 55, var3 =556;
		//if 문 안에 if문을 넣을 수 있다. -> 중첩 if문
		if(var1>var2) {
			//var1은 var2 보다 크다
			if(var1>var3) {
				//var1이 var3보다 클때 실행
			System.out.println("제일 큰 수는 " +var1+ "입니다.");
		}else 
		{
		//그외의 경우 실행
		System.out.println("제일 큰 수는" + var3 + "입니다.");}
		}else if (var2>var3) {
			//var2 가 var3 보다 클때 실행
			System.out.println("제일 큰 수는 "+var2+"입니다.");
		}else if (var3 > var1) {
			//그외의 경우 실행
			System.out.println("제일 큰 수는 "+var3+"입니다.");
		}else {if(var1 == var2) {
			System.out.println("var1 와 var2 가 같다.");
		}
			if(var2==var3) {
				System.out.println("var2 와 var3 은 같다.");
			}
			System.out.println("같은 값이 존재합니다.");
		}
	}
}
