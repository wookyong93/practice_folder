package Quiz06;

import java.util.Scanner;

public class CompanyExam {
	//���� �����ϴ� Ŭ���� = �Է½���, ��½���,�˻�����
	//�����ϴ� Ŭ������ �ݵ�� main() �޼��尡 �����ؾ��Ѵ�.
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		//�������� ����� �����Ͱ� �ʿ��ϴ�.
		Company[] c1 = new Company[5]; // Company�� 5�� �����Ҽ� �ִ� ������ ����;
		//c1[0] = new Comapny(); �� ���ε��� ���� ��ü�� �����ؾ� �Ѵ�.
		CompanyFunc cm = new CompanyFunc();//�� ����� ���� Ŭ���� ��ü�� ���� ����Ѵ�.
		
		int num = 0;//�Էµ� �ε��� ��ȣ�� �����ϴ� ����;
	main: while(true) {
			int menu = cm.menu(); //CompanyFunc�� �ִ� �޴��� ȣ��
			//cm ���� �ҷ��� ���� ��������ʱ⶧���� int menu �� �Էµ� ���� �������ش�.
			switch(menu) {//���� ������������ ����Ѵ�.
			case 1 :
				if(num == 5) {
					System.out.println("�� �̻� ������ �� �����ϴ�.");
				}else {
//					c1[num] = new Company();
//				 System.out.println("�̸� �Է� : ");
//				 c1[num].setName(sc.next());
//				 System.out.println("���� �Է� : ");
//				 c1[num].setAge(sc.nextInt());
//				 System.out.println("���� �Է� : ");
//				 c1[num].setRank(sc.next());
//				 num++;
				
					c1[num]=cm.c1Input(num);
					num++;
				}
				break;
			case 2 : 
				if(cm.companySerch(c1, num)) 
//				System.out.println("�̸� �̻� : ");
//				String name = sc.next();
//				for(int i = 0 ; i<5;i++) {
//					if(c1[i].getName().equals(name)) {
//						System.out.println("�̸� : "+c1[i].getName());
//						System.out.println("���� : "+c1[i].getAge());
//						System.out.println("���� : "+c1[i].getRank());
//						}
//					else {
						System.out.println("����� �����ϴ�.");
//						break;
//					}
//				}
				break;
			case 3 : 
				if(num ==0) {
					System.out.println("����������� �����ϴ�.");
				}else {
				cm.companyall(c1, num);
				}
				break;
			case 0 :
				System.out.println("���α׷� ����");
				break main;
			default : 
					System.out.println("���� �޴� ��ȣ �Դϴ�.");
			
			}
		}
	}
}