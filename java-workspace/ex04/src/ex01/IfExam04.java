package ex01;

public class IfExam04 {
	public static void main(String[] args) {
		int var1 = 55, var2 = 55, var3 =556;
		//if �� �ȿ� if���� ���� �� �ִ�. -> ��ø if��
		if(var1>var2) {
			//var1�� var2 ���� ũ��
			if(var1>var3) {
				//var1�� var3���� Ŭ�� ����
			System.out.println("���� ū ���� " +var1+ "�Դϴ�.");
		}else 
		{
		//�׿��� ��� ����
		System.out.println("���� ū ����" + var3 + "�Դϴ�.");}
		}else if (var2>var3) {
			//var2 �� var3 ���� Ŭ�� ����
			System.out.println("���� ū ���� "+var2+"�Դϴ�.");
		}else if (var3 > var1) {
			//�׿��� ��� ����
			System.out.println("���� ū ���� "+var3+"�Դϴ�.");
		}else {if(var1 == var2) {
			System.out.println("var1 �� var2 �� ����.");
		}
			if(var2==var3) {
				System.out.println("var2 �� var3 �� ����.");
			}
			System.out.println("���� ���� �����մϴ�.");
		}
	}
}
