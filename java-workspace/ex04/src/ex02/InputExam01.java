package ex02;

import java.io.IOException;

public class InputExam01 {
	public static void main(String[] args) throws IOException {
		//System.in.read(); ����� throws IOException ó���� ��������Ѵ�.
		//System.out.println("����") -> "����"�� ���
		System.out.print("�Է� : ");
		int X =System.in.read(); // ASCII �ڵ� ��
		System.out.println("�Է��Ͻ� ���� : " +(char)X);
		
	}
}
