package ex01;

public class RefExam04 {
	public static void main(String[] args) {
//		int i = null; /int 는 힙영역을 사용하지 않음 null 값 저장가능
		int i = 0 ;//스텍영역//초기화가 안되어있으면 쓰레기 값이 들어가 있다
		//정상적인 값이 출력안됨
		String var1 = null; //스트링은 null 값을 초기값으로 저장가능
		String var2 = "자바 ";
		String var3 = null; //초기화가 안되어있으면 쓰레기 값이 들어가 있다
		if(var1 ==null ) {
			System.out.println("var1의 값이 없습니다.");
		}
		if(var2 == null) {
			System.out.println("var2이 값이 없습니다.");
		}
		if(var3 == null) {
			System.out.println("var은 값이 없습니다.");
		}
		if(i == 0 ) {
			System.out.println("값은 0입니다.");
		}
	}
	
}
