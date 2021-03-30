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
					System.out.println("=====성적 입력=====");
					if(list.size() == 5) {
						System.out.println("더 이상 저장할 수 없습니다.");
					}else {
						list.add(method.inPut());
					}
					break;
				case 2 :
					System.out.println("=====성적 검색=====");
					if(method.serch(list)) {
						System.out.println("찾는 이름이 없습니다.");
					}
					break;
				case 3 :
					System.out.println("=====성적 출력=====");
					if(list.isEmpty()) {
						System.out.println("입력된 성적이 없습니다.");
					}else {
						method.outPut(list);
					}
					break;
				case 0 : 
					System.out.println("프로그램이 종료 됩니다.");
					return;
				default :
					System.out.println("없는 메뉴 입니다.");
				}
			}
	}
}
