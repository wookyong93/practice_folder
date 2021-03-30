package ex02;

import java.io.IOException;

public class InputExam01 {
	public static void main(String[] args) throws IOException {
		//System.in.read(); 사용은 throws IOException 처리를 꼭해줘야한다.
		//System.out.println("내용") -> "내용"을 출력
		System.out.print("입력 : ");
		int X =System.in.read(); // ASCII 코드 값
		System.out.println("입력하신 내용 : " +(char)X);
		
	}
}
