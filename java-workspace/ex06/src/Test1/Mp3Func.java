package Test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mp3Func {
	
		Scanner sc = new Scanner(System.in);
		List<Music> list = new ArrayList<Music>();
		public int menu() {
		System.out.println("1. 노래 저장 \n2. 노래 검색 \n3. 곡 목록\n4. 노래삭제 \n5. 노래재생 \n6. 다음노래\n7. 이전노래 \n0. 종료 ");
		System.out.print("메뉴선택 : ");
		int menu =sc.nextInt();
		return menu;
		}
		
		public Music input(){
			Music m = new Music();
			System.out.print("노래제목 입력 : ");
			m.setSong(sc.next());
			System.out.print("가수 입력 : ");
			m.setSinger(sc.next());
			
			return m;
		}
		public boolean serch (List<Music> list) {
			System.out.println("검색할 노래제목 입력 : ");
			String name =sc.next();
			
			for(Music m : list) {
				if(name.equals(m.getSong())) {
					System.out.println(m.getSong()+"_"+m.getSinger());
					return false;
					
				}
			}return true;
		}
		public void output(List<Music> list) {
			for(Music m : list) {
				System.out.println(m.getSong()+"_"+m.getSinger());
				System.out.println("----------------------------");
			}
		}
	public boolean remove(List<Music> list) {
		System.out.print("삭제할 곡명 입력 : ");
		String name = sc.next();
		
		for(Music m: list) {
			if(name.equals(m.getSong())) {
				System.out.println(m.getSong()+"을 삭제했습니다.");
				
				list.remove(m);
				return false;
				
			}
		}
		return true;
	}
}
