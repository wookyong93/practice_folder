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
//		System.out.print("�����Է� : ");
//		num =sc.nextInt();
//		System.out.println(arr[4]);
//		}catch(NullPointerException n) { // tostring  ���� ����
//			System.out.println( "null ���� �����Ͽ����ϴ�.");
//		}catch(InputMismatchException i) {
//			System.out.println("�Է°��� �߸� �Ǿ����ϴ�.");
//		}catch(ArrayIndexOutOfBoundsException a ) {
//			System.out.println("�迭�� ������ ������ϴ�.");
//		}catch(Exception e ) {
//			System.out.println("������ �߻��g���ϴ�.");
//			//�� �Ʒ� �Է��ؾ��Ѵ�.
//		}finally {
//			System.out.println("������ ����");
//		}
	try {
//		System.out.println(str.toString());
		System.out.print("�����Է� : ");
		num =sc.nextInt();
		System.out.println(arr[4]);
		}catch(NullPointerException |InputMismatchException |ArrayIndexOutOfBoundsException a) { // tostring  ���� ����
			System.out.println( "null ���� �����Ͽ����ϴ�.");
		}catch(Exception e ) {
			System.out.println("������ �߻��g���ϴ�.");
			//�� �Ʒ� �Է��ؾ��Ѵ�.
		}finally {
			System.out.println("������ ����");
		}
	}
	
}
