package ex03;

import java.util.Scanner;

public class Quiz02_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("�� �Է� : ");
			
			int month = sc.nextInt();
			String day = null;
			
			if(month >= 1 && month<=12) {
			switch (month){
				case 1 :
				case 3 : 
				case 5 : 
				case 7 :
				case 8 :
				case 10:
				case 12:
					//System.out.println(month + " ���� 31�ϱ��� �ֽ��ϴ�.");
					day ="31��";
					break;
				case 2 :
					day = "28 ~ 29��";
					break;
				case 4 : 
				case 6 :
				case 9 :
				case 11:
					//System.out.println(month + " ���� 30�ϱ��� �ֽ��ϴ�. ");
					day="30��";
					break;
				
			}System.out.println(month+" ���� " + day + "���� �ֽ��ϴ�.");
		}else {
			System.out.println(month+"���� �������� �ʽ��ϴ�.");
		}
	}
}
