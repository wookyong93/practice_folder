package ex02;

import java.io.IOException;

public class Quiz02 {
	public static void main(String[] args) throws IOException {
		//�� ���� �Է� ����
//		int var1,var2;
//		System.out.print("ù��° ���� �Է� : ");
//		var1 = System.in.read()-48;
//		// �� �Է� -> ����(\r,\n )
//		System.in.read();// \r
//		System.in.read();// \n
//		System.out.print("�ι�° ���� �Է� : ");
//		var2 = System.in.read()-48;
//		System.in.read();// \r
//		System.in.read();// \n
//		int result =var1 + var2;
//		
//		System.out.println("���� ����� : " + result);
//		char f,m,l;
//		System.out.print("ù���� �̴ϼ� �Է� : ");
//		f = (char)System.in.read();
//		//Enter = \r\n �� �Էµȴ�.
//		System.in.read(); // \r �Է�
//		System.in.read(); // \n �Է�
//		System.out.print("�ι�° �̴ϼ� �Է� : ");
//		m = (char)System.in.read();
//		System.in.read();
//		System.in.read();
//		System.out.print("����° �̴ϼ� �Է� : ");
//		l = (char)System.in.read();
//		System.out.print("����� �̴ϼ��� " +f +m +l+ "�Դϴ�.");
		char f,m,l;
		
		System.out.print("�̴ϼ� �Է� : ");
		//���ʹ� �Է� ����
		//k w k \r\n (����)
		f = (char)System.in.read();
		m = (char)System.in.read();
		l = (char)System.in.read();
		System.out.println("����� �̴ϼ���" + f + m +l +"�Դϴ�.");
		
			}
}
