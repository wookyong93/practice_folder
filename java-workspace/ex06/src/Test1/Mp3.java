package Test1;


import java.util.ArrayList;
import java.util.List;

public class Mp3 {
	public static void main(String[] args) {
		List<Music> list = new ArrayList<>();
		
		Mp3Func mf = new Mp3Func();
		
		while(true) {
			int menu = mf.menu();
			
			switch(menu) {
			case 1 : 
				list.add(mf.input());
				
				break;
			case 2 :
				if(list.isEmpty()) {
					System.out.println("����� ���� �����ϴ�.");
				}else if(mf.serch(list)) {
					System.out.println("ã�� ���� �����ϴ�.");
				}

				break;
			case 3 : 
				if(list.isEmpty()) {
					System.out.println("����� ���� �����ϴ�.");
				}else {
					mf.output(list);
				}
				break;
			case 4 :if(list.isEmpty()) {
						System.out.println("����� ���� �����ϴ�.");
					}else if(mf.remove(list)) {
						System.out.println("������ ���� ��Ͽ� �����ϴ�.");
					}
				break;
			case 5 : 
				
				break;
			case 6 : 
				break;
			case 7:
				break;
			case 0 :
				System.out.println("�����մϴ�.");
				return;
			default:
				System.out.println("���� �޴� �Դϴ�.");
			}
		}
	}
}
