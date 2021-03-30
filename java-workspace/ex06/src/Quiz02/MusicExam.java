package Quiz02;

import java.util.Scanner;

public class MusicExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Music M1 = new Music();
		
		System.out.print("가수 입력 : ");
//		String singer = sc.next();
//		M1.setSinger(singer);
		M1.setSinger(sc.next());
		System.out.print("노래 입력 : ");
		M1.setSongName(sc.next());
		
		System.out.println("가수 : "+ M1.getSinger()+", 노래 제목 : "+ M1.getSongName());

		
	
	
	}
}
