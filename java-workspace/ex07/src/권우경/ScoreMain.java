package 권우경;

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
				System.out.println("=====성적 입력=====");
				if(list.size() == 5) {
					System.out.println("더이상 저장할수 업습니다.");
				}else{
					list.add(method.input());
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
					method.output(list);
				}
				break;
			case 0 : 
				System.out.println("프로그램 종료.");
				return;
			default:
				System.out.println("없는 메뉴 번호 입니다.");
			}
		}
		
		
	}
}
