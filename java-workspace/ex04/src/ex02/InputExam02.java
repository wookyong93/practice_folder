package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExam02 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름 입력 : ");
		String name = in.readLine();
		System.out.println(name+"님 환영합니다.");
		//버퍼 는 문자열만 입출력이 가능하다.
		
		System.out.print("나이 입력 : ");
		String age = in.readLine();
				System.out.println(name + "님의 나이는 "+age+"살 입니다.");
				
		System.out.println("첫번째 정수 입력 : ");
		int var1 = Integer.parseInt(in.readLine());
		System.out.println("두번째 정수 입력 : ");
		int var2 = Integer.parseInt(in.readLine());
		System.out.println(var1 + var2);
		//버퍼는 문자열만 입출력이 가능하지만 integer.parseInt (in.readLine()); 
		//입력하게 되면 입력한 문자열이 int 로 입력이 된다. 
		//문자열 입력시 에러 발생
		
	}
}
