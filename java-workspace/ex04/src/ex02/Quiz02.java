package ex02;

import java.io.IOException;

public class Quiz02 {
	public static void main(String[] args) throws IOException {
		//한 글자 입력 예제
//		int var1,var2;
//		System.out.print("첫번째 정수 입력 : ");
//		var1 = System.in.read()-48;
//		// 값 입력 -> 엔터(\r,\n )
//		System.in.read();// \r
//		System.in.read();// \n
//		System.out.print("두번째 정수 입력 : ");
//		var2 = System.in.read()-48;
//		System.in.read();// \r
//		System.in.read();// \n
//		int result =var1 + var2;
//		
//		System.out.println("더한 결과값 : " + result);
//		char f,m,l;
//		System.out.print("첫번쨰 이니셜 입력 : ");
//		f = (char)System.in.read();
//		//Enter = \r\n 이 입력된다.
//		System.in.read(); // \r 입력
//		System.in.read(); // \n 입력
//		System.out.print("두번째 이니셜 입력 : ");
//		m = (char)System.in.read();
//		System.in.read();
//		System.in.read();
//		System.out.print("새번째 이니셜 입력 : ");
//		l = (char)System.in.read();
//		System.out.print("당신의 이니셜은 " +f +m +l+ "입니다.");
		char f,m,l;
		
		System.out.print("이니셜 입력 : ");
		//엔터는 입력 종료
		//k w k \r\n (엔터)
		f = (char)System.in.read();
		m = (char)System.in.read();
		l = (char)System.in.read();
		System.out.println("당신의 이니셜은" + f + m +l +"입니다.");
		
			}
}
