package ex02;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������� �� ��� �Է� : ");
		int count =sc.nextInt();
		boolean[] car = new boolean[count];
		String[] carNum= new String [count];
		String carns =null;
		int num =0;
	finish :while(true) {
			System.out.println("������ ���α׷�");
			System.out.println("1. ����\n2. ����\n3. ������ ����\n0. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			switch(menu) {
				case 1 :
					System.out.print("���� ���� ���� [1~"+count+"] : ");
						num = sc.nextInt()-1;
					if(num <= count) {
						if(car[num] == false ) {
							System.out.println("���� ������ ������ϴ�. ���� �����մϴ�.");
							System.out.print("���� ��ȣ �� �Է� : ");
							carNum[num] = sc.next();
							car[num] = true;
							System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						}else {
							System.out.println("���������� ������Դϴ�. �ٸ����� �����ϼ���.");
						}
					}else {
						System.out.println("���� ���������Դϴ�.");
					}
					break;
				case 2 :
					System.out.print("���� ���� ���� [1~"+count+"] : ");
					num = sc.nextInt()-1;
						if(num <= count) {
							if(car[num] == true ) {
								System.out.print("���� ��ȣ �Է� : ");
								carns = sc.next();
								if(carNum[num].equals(carns)) {
								car[num] = false;
								System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
								} else {
								System.out.println("������ȣ�� �ٸ��ϴ� �ٽ�Ȯ�����ּ���.");
								}
							}else {
								System.out.println("�� ���� �����Դϴ�. �ٸ����� Ȯ�����ּ��� ");
							break;	
						}
						}else {
							System.out.println("���� ���������Դϴ�.");
						}
					break ;
				case 3 : 
					for(int i = 0; i < count ;i++) {
						if(car[i] == true) {
						System.out.println((i+1)+"�� ������ "+carNum[i]+"�� ������ �����Ǿ��ֽ��ϴ�.");
						}else {
						System.out.println((i+1)+"�� ������ �� ���� �Դϴ�.");
						}	
					}
					break;
				case 0 : 
					System.out.println("���α׷��� ���� �˴ϴ�. ");
					break finish;
				default:
					System.out.println("�޴��� �߸� ���� �ϼ̽��ϴ�.");
				}
		}
	}
}
