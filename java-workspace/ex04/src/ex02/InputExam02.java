package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExam02 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�̸� �Է� : ");
		String name = in.readLine();
		System.out.println(name+"�� ȯ���մϴ�.");
		//���� �� ���ڿ��� ������� �����ϴ�.
		
		System.out.print("���� �Է� : ");
		String age = in.readLine();
				System.out.println(name + "���� ���̴� "+age+"�� �Դϴ�.");
				
		System.out.println("ù��° ���� �Է� : ");
		int var1 = Integer.parseInt(in.readLine());
		System.out.println("�ι�° ���� �Է� : ");
		int var2 = Integer.parseInt(in.readLine());
		System.out.println(var1 + var2);
		//���۴� ���ڿ��� ������� ���������� integer.parseInt (in.readLine()); 
		//�Է��ϰ� �Ǹ� �Է��� ���ڿ��� int �� �Է��� �ȴ�. 
		//���ڿ� �Է½� ���� �߻�
		
	}
}
