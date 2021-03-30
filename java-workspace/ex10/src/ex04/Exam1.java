package ex04;

public class Exam1 {
	public static void main(String[] args) {
		try { //try 와 catch 한짝 무조건 같이있어야한다.
			System.out.println(10/0);
		}catch(Exception e){
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {//생략이 가능하고 예외가 발생했던 안했던 상관없이 무조건 실행
			System.out.println("연산이 종료 되었습니다.");
		}
		String str =null;
		try {
			System.out.println(str.toString());
		}catch(Exception e ) {
			System.out.println("값이 없습니다.");
		}finally {
			System.out.println("값 출력이 종료 되었습니다.");
		}
		}
}
