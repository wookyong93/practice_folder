package Quiz04;

import java.util.Scanner;

public class LogExam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Log1[] log = new Log1[2];
		
		for(int i =0; i<log.length;i++) {
			log[i] = new Log1();
			System.out.print((i+1)+"���� id �Է� : ");
			log[i].setId(sc.next());
			System.out.print((i+1)+"���� ��ȣ �Է� : ");
			log[i].setPwd(sc.next());
		}
		for(int i =0; i<log.length;i++) {
			System.out.println((i+1)+"��° ���̵� : "+log[i].getId());
			System.out.println((i+1)+"��° ��ȣ : "+log[i].getPwd());
		}
		
		
		
		
		
		
		
//		Log1 l1 =new Log1();
//		Log1 l2 =new Log1();
//		System.out.print("ù��° ���̵� �Է� : ");
//		l1.setId(sc.next());
//		System.out.print("ù��° ��ȣ �Է� : ");
//		l1.setPwd(sc.next());
//		do {
//		System.out.print("�ι��� ���̵� �Է� : ");
//		l2.setId(sc.next());
//		}while(l1.getId().equals(l2.getId()));
//		System.out.print("�ι�° ��ȣ �Է� : ");
//		l2.setPwd(sc.next());
//		//�˻簡 �ʿ��ϹǷ� do - while�� ��� 
//		
//		System.out.println("ù��° ���̵� : "+l1.getId());
//		System.out.println("ù��° ��ȣ : "+l1.getPwd());
//		
//		System.out.println("�ι�° ���̵� : "+l2.getId());
//		System.out.println("�ι�° ��ȣ : "+l2.getPwd());
	}
}
