package Quiz04;

import java.util.Scanner;

public class LogExam {
	public static void main(String[] args) {
		
		Log l1 = new Log();
		Log l2 = new Log();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id �Է� : ");
		l1.setId(sc.next());
		System.out.print("pwd �Է� : ");
		l1.setPassword(sc.next());
		
		

		System.out.print("id �Է� : ");
		l2.setId(sc.next());	
			if(l1.getId().equals(l2.getId())) {
				System.out.println("���� id �� �����մϴ�.�ٸ� id�� �Է����ּ��� ");
				l2.setId(null);
			}
			else {
				System.out.println("pwd �Է� : ");
				l2.setPassword(sc.next());
				}
		
			if(!l1.getId().equals(l2.getId())) {
				System.out.println("id : "+ l1.getId()+"/"+l1.getPassword());
				System.out.println("id : "+ l2.getId()+"/"+l2.getPassword());
			
	  }	
	}
}
