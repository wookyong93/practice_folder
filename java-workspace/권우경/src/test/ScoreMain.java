package test;

import java.util.ArrayList;
import java.util.List;

public class ScoreMain {
	public static void main(String[] args) {
		List<Score> list = new ArrayList<>();
		ScoreMethod method = new ScoreMethod();
		
			while(true) {
				
				int menu = method.menu();
				
				switch(menu) {
				case 1 : 
					System.out.println("=====���� �Է�=====");
					if(list.size() == 5) {
						System.out.println("�� �̻� ������ �� �����ϴ�.");
					}else {
						list.add(method.inPut());
					}
					break;
				case 2 :
					System.out.println("=====���� �˻�=====");
					if(method.serch(list)) {
						System.out.println("ã�� �̸��� �����ϴ�.");
					}
					break;
				case 3 :
					System.out.println("=====���� ���=====");
					if(list.isEmpty()) {
						System.out.println("�Էµ� ������ �����ϴ�.");
					}else {
						method.outPut(list);
					}
					break;
				case 0 : 
					System.out.println("���α׷��� ���� �˴ϴ�.");
					return;
				default :
					System.out.println("���� �޴� �Դϴ�.");
				}
			}
	}
}
