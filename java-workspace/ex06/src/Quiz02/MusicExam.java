package Quiz02;

import java.util.Scanner;

public class MusicExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Music M1 = new Music();
		
		System.out.print("���� �Է� : ");
//		String singer = sc.next();
//		M1.setSinger(singer);
		M1.setSinger(sc.next());
		System.out.print("�뷡 �Է� : ");
		M1.setSongName(sc.next());
		
		System.out.println("���� : "+ M1.getSinger()+", �뷡 ���� : "+ M1.getSongName());

		
	
	
	}
}
