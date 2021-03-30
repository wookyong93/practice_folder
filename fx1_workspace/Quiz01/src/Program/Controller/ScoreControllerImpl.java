package Program.Controller;

import java.util.Scanner;

import Program.Service.ScoreService;
import Program.Service.ScoreServiceImpl;

public class ScoreControllerImpl implements ScoreController{

	@Override
	public void start() throws Exception  {
		// TODO Auto-generated method stub
		ScoreService scoreSrv = new ScoreServiceImpl();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.�����Է� 2.�������� 3.�������� 4.�����˻� 0. ���α׷� ����");
			System.out.print("���� : ");
			int menu =sc.nextInt();
			switch(menu){
			case 1 :
				if(scoreSrv.insert()) {
					  System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
	            } else {
	               System.out.println("�Է��� ���еǾ����ϴ�.");
	            }
				break;
			case 2 :
				if(scoreSrv.update()) {
				    System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	            } else {
	               System.out.println("������ ���еǾ����ϴ�.");
	            }
				break;
				
			case 3 :
				if(scoreSrv.delete()) {
					  System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	            } else {
	               System.out.println("������ ���еǾ����ϴ�.");
	            }
				break;
			case 4 :
				scoreSrv.search();
				break;
				
			case 0 :
				System.out.println("���α׷� ����");
				return;
			default : 
					System.out.println("������ �߸� �Ǿ����ϴ�.");
			}
		}
		
	}

}
