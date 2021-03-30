package ex04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String str = null;
	int num =0;
	int[] arr = new int[3];
//	System.out.println(str.toString());
//		try {
////		System.out.println(str.toString());
//		System.out.print("숫자입력 : ");
//		num =sc.nextInt();
//		System.out.println(arr[4]);
//		}catch(NullPointerException n) { // tostring  에러 참초
//			System.out.println( "null 값을 참조하였습니다.");
//		}catch(InputMismatchException i) {
//			System.out.println("입력값이 잘못 되었습니다.");
//		}catch(ArrayIndexOutOfBoundsException a ) {
//			System.out.println("배열의 범위를 벗어났습니다.");
//		}catch(Exception e ) {
//			System.out.println("에러가 발생헸습니다.");
//			//맨 아래 입력해야한다.
//		}finally {
//			System.out.println("무조건 실행");
//		}
	try {
//		System.out.println(str.toString());
		System.out.print("숫자입력 : ");
		num =sc.nextInt();
		System.out.println(arr[4]);
		}catch(NullPointerException |InputMismatchException |ArrayIndexOutOfBoundsException a) { // tostring  에러 참초
			System.out.println( "null 값을 참조하였습니다.");
		}catch(Exception e ) {
			System.out.println("에러가 발생헸습니다.");
			//맨 아래 입력해야한다.
		}finally {
			System.out.println("무조건 실행");
		}
	}
	
}
