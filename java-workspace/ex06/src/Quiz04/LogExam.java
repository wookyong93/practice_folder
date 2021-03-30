package Quiz04;

import java.util.Scanner;

public class LogExam {
	public static void main(String[] args) {
		
		Log l1 = new Log();
		Log l2 = new Log();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id 입력 : ");
		l1.setId(sc.next());
		System.out.print("pwd 입력 : ");
		l1.setPassword(sc.next());
		
		

		System.out.print("id 입력 : ");
		l2.setId(sc.next());	
			if(l1.getId().equals(l2.getId())) {
				System.out.println("같은 id 가 존재합니다.다른 id를 입력해주세요 ");
				l2.setId(null);
			}
			else {
				System.out.println("pwd 입력 : ");
				l2.setPassword(sc.next());
				}
		
			if(!l1.getId().equals(l2.getId())) {
				System.out.println("id : "+ l1.getId()+"/"+l1.getPassword());
				System.out.println("id : "+ l2.getId()+"/"+l2.getPassword());
			
	  }	
	}
}
