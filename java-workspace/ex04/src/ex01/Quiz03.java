package ex01;

public class Quiz03 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 11;
		int var3 = 10;
		if(var1>var2 && var1 >var3) {
			//var1은 var2 보다 크고 var3 보다 커야 실행된다
			System.out.println("제일 큰수는 "+var1+"입니다.");
		}else if (var2>var3 && var2>var1) {
			//var2 은 var1 보다 크고 var3보다 커야 한다
			System.out.println("제일 큰 수는 "+var2+"입니다.");
		}else if(var3 > var1 && var3 >var2){
			//그 외 조건에서 실행
			System.out.println("제일 큰 수는 "+var3+"입니다.");
		}else {
			System.out.println("같은 값이 존재합니다.");
			}
		// 정답 문
		
		
		
		if(var1==var2&&var2==var3){
			System.out.println("수의 값이 모두 같습니다.");
		}else if(var1 > var2 && var2 >= var3 ) {
			System.out.println("제일큰수는"+var1+"입니다.");
		}else if(var1> var3 && var3>=var2) {
			System.out.println("제일큰수는"+var1+"입니다.");
		}
		else if (var2 > var1 && var1 >= var3){
			System.out.println("제일큰수는 "+var2+"입니다.");
		}else if (var2 > var3 && var3 >=var1) {
			System.out.println("제일큰수는 "+var2+"입니다.");
		}
		else if (var3 > var2 && var2 >= var1) {
			System.out.println("제일 큰수는 "+var3+"입니다.");
		}else if (var3>var1 && var1>=var1) {
			System.out.println("제일 큰수는 "+var3+"입니다.");
		}else {
			System.out.println("값을 구할 수 없습니다.");
		//내가 쓴 답
		}
	}
}
