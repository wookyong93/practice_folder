package �ǿ��;

import java.util.ArrayList;
import java.util.List;

public class ScoreMain {
	public static void main(String[] args) {
		List<Score> list = new ArrayList<>();
		ScoreMethod method = new ScoreMethod();
		while(true) {
			int menu = method.menu();
			
			switch(menu) {
			case 1:
				System.out.println("=====���� �Է�=====");
				if(list.size() == 5) {
					System.out.println("���̻� �����Ҽ� �����ϴ�.");
				}else{
					list.add(method.input());
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
					method.output(list);
				}
				break;
			case 0 : 
				System.out.println("���α׷� ����.");
				return;
			default:
				System.out.println("���� �޴� ��ȣ �Դϴ�.");
			}
		}
		
		
	}
}
