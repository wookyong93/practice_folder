package ex02;

import java.util.Scanner;

public class Quiz06_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ ���� �� �Է� : ");
		int paking = sc.nextInt();
		String[] cars = new String[paking];
		int num =0;
		label: while(true) {	
		System.out.println("1. ����\n2. ����\n3. ���� ��Ȳ\n0. ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
				switch(menu) {
				case 1 : 
					System.out.print("������ ���� ��ȣ : ");
					num = sc.nextInt()-1;
					if(num<=paking) {
						if(cars[num] == null) {
						System.out.print("������ ���� ��ȣ : ");
						cars[num] = sc.next();
						}else {
						System.out.println("������ ������ ������ ������ �ֽ��ϴ�.");
						}
					}else {
						System.out.println("���� ���� ��ȣ �Դϴ�.");
					}
					break;
				case 2 : 
					System.out.print("������ ���� ��ȣ : ");
					num = sc.nextInt()-1;
					if(num<=paking) {
						if(cars[num] != null) {
						System.out.print("������ ���� ��ȣ : ");
						String carnum = sc.next();
							if(cars[num].equals(carnum)) {
								System.out.println(cars[num] + "������ �����մϴ�.");
								cars[num] = null;
							}else if (!cars[num].equals(carnum)) {
								System.out.println("���� ���� ��ȣ�Դϴ�. Ȯ�����ּ���.");
							}
						}else {
						System.out.println("������ ������ ������ ������ �����ϴ�.");
						}
					}else {
						System.out.println("���� ���� ��ȣ �Դϴ�.");
					}
					break;
				case 3 : 
					for(int i =0 ; i< paking;i++) {
						if(cars[i]!= null ) {
							System.out.println((i+1)+"��° �԰�� ���� : "+cars[i]);
						}else if (cars[i] == null) {
							System.out.println((i+1)+"���� �԰�� ���� : �����ϴ�.");
						}
					}
					break;
				case 0 : 
					System.out.println("����˴ϴ�.");
					break label;
					default :
						System.out.println("���� �޴��Դϴ�.");
				}
				
		}
	}
}
