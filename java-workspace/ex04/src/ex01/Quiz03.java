package ex01;

public class Quiz03 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 11;
		int var3 = 10;
		if(var1>var2 && var1 >var3) {
			//var1�� var2 ���� ũ�� var3 ���� Ŀ�� ����ȴ�
			System.out.println("���� ū���� "+var1+"�Դϴ�.");
		}else if (var2>var3 && var2>var1) {
			//var2 �� var1 ���� ũ�� var3���� Ŀ�� �Ѵ�
			System.out.println("���� ū ���� "+var2+"�Դϴ�.");
		}else if(var3 > var1 && var3 >var2){
			//�� �� ���ǿ��� ����
			System.out.println("���� ū ���� "+var3+"�Դϴ�.");
		}else {
			System.out.println("���� ���� �����մϴ�.");
			}
		// ���� ��
		
		
		
		if(var1==var2&&var2==var3){
			System.out.println("���� ���� ��� �����ϴ�.");
		}else if(var1 > var2 && var2 >= var3 ) {
			System.out.println("����ū����"+var1+"�Դϴ�.");
		}else if(var1> var3 && var3>=var2) {
			System.out.println("����ū����"+var1+"�Դϴ�.");
		}
		else if (var2 > var1 && var1 >= var3){
			System.out.println("����ū���� "+var2+"�Դϴ�.");
		}else if (var2 > var3 && var3 >=var1) {
			System.out.println("����ū���� "+var2+"�Դϴ�.");
		}
		else if (var3 > var2 && var2 >= var1) {
			System.out.println("���� ū���� "+var3+"�Դϴ�.");
		}else if (var3>var1 && var1>=var1) {
			System.out.println("���� ū���� "+var3+"�Դϴ�.");
		}else {
			System.out.println("���� ���� �� �����ϴ�.");
		//���� �� ��
		}
	}
}
