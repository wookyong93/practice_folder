package Quiz06;

import java.util.Scanner;

public class CompanyFunc {
	Scanner sc = new Scanner(System.in);
	
		public int menu() {
			System.out.println("1. �Է�\n2. �˻�\n3. ���\n0. ����");
			System.out.print("�޴����� : ");
			int menu = sc.nextInt();
			return menu;
		}
		//Comf�� menu ��� ��ü�� �����. 
		//menu�� ȣ���� Ŭ�������� ����ȴ� . 
		//���� ����� ���� �Ѱ��ְ� �� ��ü�� �������.
		public Company c1Input(int num) {
			Company c1 = new Company();//�ӽ� ������ ��ü�� ����
			
			System.out.print("�̸� �Է� :");
			c1.setName(sc.next());
			System.out.print("���� �Է� : ");
			c1.setAge(sc.nextInt());
			System.out.print("���� �Է� : ");
			c1.setRank(sc.next());
			
			return c1;
			//���ο� ��ü�� �����Ѵ�.
		}
		public boolean companySerch(Company[] c1,int num) {
			System.out.print("�˻��� ��� �̸� :");
			String name = sc.next();
			boolean b =true;
			for(int i = 0 ; i<num;i++) {//exam����  false �� �Ǵ� ��
				//c1 �̶�� �迭�ȿ� �Էµ��ִ� �ڸ������� �˻��ϱ����� num ���� �ִ´�.
				if(name.equals(c1[i].getName())) {
					System.out.println("�̸� : "+c1[i].getName());
					System.out.println("���� : "+c1[i].getAge());
					System.out.println("���� : "+c1[i].getRank());
					b=false; // false or true ������ 
					//exam if ���� ������ �����̵ǹǷ� ���� ���� ��� ;
					//exam if ���� ������ ���� �Ǹ� ���� ������ ��¾ȵǰ� if �����ִ� ã�»���̾����ϴٰ� ���ɴϴ�.
				}
			}
			return b;
		}
		public void  companyall(Company[] c1,int num) {
			for(int i =0; i<num;i++) {
				System.out.println("�̸� : " +c1[i].getName()+"\n���� : "+c1[i].getAge()+"��\n ���� : "+c1[i].getRank());
				System.out.println("======");
			}
		}
		
}
