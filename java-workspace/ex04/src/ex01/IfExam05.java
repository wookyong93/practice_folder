package ex01;

public class IfExam05 {
	public static void main(String[] args) {
		int var1 = 20, var2 = 20, var3 = 50;
		
		if (var1 >= var2) {
			// var1�� var2 ���� ũ�ų� ����.
			if(var1 > var3) {
				if (var1 == var2) {
					// var1�� var2�� ����.
					System.out.println("var1�� var2�� ���� ����.");
				} else {
					// var1�� var3 ���� ũ��.
					System.out.println("var1 ���� ū���̴�.");
				}
			} else {
				if (var3 > var1) {
					// var3�� var1 ���� ũ��.					
					System.out.println("var3 ���� ū���̴�.");
				} else if (var1 == var3) {
					// var1�� var3�� ����.
					System.out.println("var1�� var3�� ���� ����.");
				} 
			}
		} else if (var2 > var1) {
			// var2�� var1���� ũ��.
			if (var2 > var3) {
				// var2�� var3 ���� ũ��.
				System.out.println("var2 ���� ū���̴�.");
			} else { 
				if (var3 > var2) {
					// var3�� var2���� ũ��
					System.out.println("var3 ���� ū���̴�.");
				} else if (var2 == var3) {
					// var2�� var3�� ����.
					System.out.println("var2�� var3�� ���� ����.");
				}
			}
		}
		
		if (true) {
			if(true) {
				System.out.println("��øif");
			}
			System.out.println("��ø if ����");
			
		}
	}
}