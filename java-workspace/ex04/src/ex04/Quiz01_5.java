package ex04;

import java.util.Scanner;

public class Quiz01_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.print("1~9������ ���� �Է� : ");
		
			int num =sc.nextInt();
			if(num>0 && num<10) {
				for (int i = num ; i <=10 ; i++)
				{
					System.out.print(i+" ");
				}
			}else {
				System.out.println("�Է��Ѱ��� ó���� �� �����ϴ�.");
				System.out.println("1~9������ ���� �Է����ּ���.");
			}
			System.out.println();
			System.out.println("=====================================");
			System.out.print("\n1~9������ ���� �Է� : ");
			int num1 = sc.nextInt();
		
			if(num1 >0 && num1<10) {
				System.out.print("10~19������ ���� �Է� : ");
				int num2 = sc.nextInt();
				if(num2>=10 && num2<20) {
					for (int i = num1; i <= num2 ; i++)
					{
						System.out.print(i+" ");
					}
				}else {
					System.out.println("�ι�° ���������� �߸� �Է��Ͽ����ϴ�.");
				}
			}else {
				System.out.println("ù���� ���������� �߸� �Է��Ͽ����ϴ�.");
			}
	}
}
