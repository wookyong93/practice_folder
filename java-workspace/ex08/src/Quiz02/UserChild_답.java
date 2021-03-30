package Quiz02;

import java.util.List;

public class UserChild_답 extends UserParent_답 {
	
//	public void delete(List<User> list) {
//		System.out.println("삭제할 아이디 입력 : ");
//		String id = sc.next();
//			for(User u : list) {
//				if(id.equals(u.getId())) {
//					System.out.println(id+"님을 삭제합니다.");
//					list.remove(u);
//					return;
//				}
//			}System.out.println("삭제할 ID 를 찾을 수 없습니다.");
//	}
//	public void deleteAll(List<User> list){
//		String select;
//		do {
//		System.out.println("전체 삭제 합니다 . 삭제하시겠습니까 ? (y/n)");
//		select = sc.next();
//		if(select.equals("Y")|| select.equals("y")) {
//			System.out.println("전체 삭제 합니다.");
//			list.clear();
//		}else if (select.equals("n")||select.equals("N")) {
//			System.out.println("전체삭제를 취소합니다.");
//		}else {
//			System.out.println("잘못된 선택입니다.");
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
		UserChild_답 uc = new UserChild_답();
		
		while(true) {
			System.out.println("1.회원가입 \n2. 회원검색 \n3. 회원 출력 \n4. 회원 삭제 \n5. 전체 삭제");
			System.out.print("메뉴선택 : ");
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
				System.out.println("프로그램 종료합니다.");
				return;
			default : 
				System.out.println("잘못된 선택입니다.");
			}
		}
	}

}
