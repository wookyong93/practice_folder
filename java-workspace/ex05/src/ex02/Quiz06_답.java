package ex02;

import java.util.Scanner;

public class Quiz06_�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������� ���� ��� : ");
		int paking = sc.nextInt();
		boolean[] cars = new boolean[paking];
		String[] carName = new String [paking];
		//String �迭�� null�� �ʱ�ȭ�� �ȴ�.
	label:	while(true) {
			System.out.println("1. ����\n2. ����\n3. ���� ��Ȳ\n0. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			
		switch(menu) { 	
		case 1 : 	
			//����ó��
		int tmp =0;
		do {
		System.out.print("������ ���� �Է� [1 ~ " +paking+"] : ");
		tmp =sc.nextInt()-1;
		}while(tmp<0 || tmp>=paking);
			//�ε��� ���� ���߱����ؼ� -1 �Է� 1 => �ε��� 0 ���� ������
			if(cars[tmp] == true) {
				System.out.println("������� �������� �����Ҽ� �����ϴ�.");
			}else {
				System.out.print("������ȣ �Է� : ");
				carName[tmp] = sc.next();
				cars[tmp] = true;
			}
			break;
		case 2 :
			//���� ó��
			
			System.out.print("������ ���� ��ȣ �Է� : ");
			String tmpname = sc.next();
				for(int i = 0; i<paking;i++) {
					boolean b1 = true;
					if(carName[i] == null) {
						continue;
					}
					else if(carName[i].equals(tmpname)) {
						System.out.println((i+1)+ "�� ������ " +carName[i]+"�� ������ �����մϴ�.");
						cars[i] =false;
						carName[i] = null;
						b1 = false;
						break;
					}
				if(b1) {
					System.out.println("ã���ô� ��ȣ�������ϴ�.");
					}
				}
				break;
		case 3 : 	
			for(int i = 0 ; i< paking ; i++) {
				if(cars[i] == true) {
				System.out.println((i+1)+"���� ���� ��Ȳ : "+carName[i]+" �� ������Դϴ�.");
				}else {
				System.out.println((i+1)+"���� ���� ��Ȳ : ����ֽ��ϴ�.");
				}
			
				}
			break;
		case 0 : 
			System.out.println("���α׷� ���� ");
			break label;
		default :
			System.out.println("���� �޴��Դϴ�. ");
			
			}	
		}	
	}
		
		
}
