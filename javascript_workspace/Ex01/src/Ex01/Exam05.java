package Ex01;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		int i = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int j=sc.nextInt();
	
		if(i>j) {
			System.out.println(i);
		}else if(i<j){
			System.out.println(j);
		}else {
			System.out.println("���ϰ�");
		}
	
	}
}
