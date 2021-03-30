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
					System.out.println("저장된 곡이 없습니다.");
				}else if(mf.serch(list)) {
					System.out.println("찾는 곡이 없습니다.");
				}

				break;
			case 3 : 
				if(list.isEmpty()) {
					System.out.println("저장된 곡이 없습니다.");
				}else {
					mf.output(list);
				}
				break;
			case 4 :if(list.isEmpty()) {
						System.out.println("저장된 곡이 없습니다.");
					}else if(mf.remove(list)) {
						System.out.println("삭제할 곡이 목록에 없습니다.");
					}
				break;
			case 5 : 
				
				break;
			case 6 : 
				break;
			case 7:
				break;
			case 0 :
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("없는 메뉴 입니다.");
			}
		}
	}
}
