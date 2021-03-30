package Quiz04;

import java.util.Scanner;

public class LogExam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Log1[] log = new Log1[2];
		
		for(int i =0; i<log.length;i++) {
			log[i] = new Log1();
			System.out.print((i+1)+"번쨰 id 입력 : ");
			log[i].setId(sc.next());
			System.out.print((i+1)+"번쨰 암호 입력 : ");
			log[i].setPwd(sc.next());
		}
		for(int i =0; i<log.length;i++) {
			System.out.println((i+1)+"번째 아이디 : "+log[i].getId());
			System.out.println((i+1)+"번째 암호 : "+log[i].getPwd());
		}
		
		
		
		
		
		
		
//		Log1 l1 =new Log1();
//		Log1 l2 =new Log1();
//		System.out.print("첫번째 아이디 입력 : ");
//		l1.setId(sc.next());
//		System.out.print("첫번째 암호 입력 : ");
//		l1.setPwd(sc.next());
//		do {
//		System.out.print("두번쨰 아이디 입력 : ");
//		l2.setId(sc.next());
//		}while(l1.getId().equals(l2.getId()));
//		System.out.print("두번째 암호 입력 : ");
//		l2.setPwd(sc.next());
//		//검사가 필요하므로 do - while문 사용 
//		
//		System.out.println("첫번째 아이디 : "+l1.getId());
//		System.out.println("첫번째 암호 : "+l1.getPwd());
//		
//		System.out.println("두번째 아이디 : "+l2.getId());
//		System.out.println("두번째 암호 : "+l2.getPwd());
	}
}
