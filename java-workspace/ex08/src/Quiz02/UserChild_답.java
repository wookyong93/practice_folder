package Quiz02;

import java.util.List;

public class UserChild_�� extends UserParent_�� {
	
//	public void delete(List<User> list) {
//		System.out.println("������ ���̵� �Է� : ");
//		String id = sc.next();
//			for(User u : list) {
//				if(id.equals(u.getId())) {
//					System.out.println(id+"���� �����մϴ�.");
//					list.remove(u);
//					return;
//				}
//			}System.out.println("������ ID �� ã�� �� �����ϴ�.");
//	}
//	public void deleteAll(List<User> list){
//		String select;
//		do {
//		System.out.println("��ü ���� �մϴ� . �����Ͻðڽ��ϱ� ? (y/n)");
//		select = sc.next();
//		if(select.equals("Y")|| select.equals("y")) {
//			System.out.println("��ü ���� �մϴ�.");
//			list.clear();
//		}else if (select.equals("n")||select.equals("N")) {
//			System.out.println("��ü������ ����մϴ�.");
//		}else {
//			System.out.println("�߸��� �����Դϴ�.");
//		}
//		}while(!select.equals("Y") && !select.equals("y") && !select.equals("n") && !select.equals("N"));
//	}
	public void delete(List<User> list) {
		service.delete(list);
	}
	public void deleteAll(List<User> list) {
		service.deleteAll(list);
	}
	public static void main(String[] args) {
		UserChild_�� uc = new UserChild_��();
		
		while(true) {
			System.out.println("1.ȸ������ \n2. ȸ���˻� \n3. ȸ�� ��� \n4. ȸ�� ���� \n5. ��ü ����");
			System.out.print("�޴����� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : 
				uc.input(list);
				break;
			case 2 : 
				uc.search(list);
				break;
			case 3 : 
				uc.output(list);
				break;
			case 4 : 
				uc.delete(list);
				break;
			case 5 : 
				uc.deleteAll(list);
				break;
			case 0 : 
				System.out.println("���α׷� �����մϴ�.");
				return;
			default : 
				System.out.println("�߸��� �����Դϴ�.");
			}
		}
	}

}
