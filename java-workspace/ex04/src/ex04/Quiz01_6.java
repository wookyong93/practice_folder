package ex04;

import java.util.Scanner;

public class Quiz01_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num =sc.nextInt();
			if(num>=0 && num<=100) {
				int var = num%10;
					if(num<50) {
							if(var >0) {
							for(int i=0;i<var;i++) {											
									System.out.print("LOW ");
								}
						}else if(var==0){
							System.out.print("LOW ");
						}
			}
			if(num>=50) {
				if(var >0) {
						for(int i=0;i<var;i++) {
							System.out.print("HI ");
						}
						}else if(var == 0) {
						System.out.print("HI ");
					}	
				}
			
			}else {
				System.out.println("�Է��� �߸� �Ǿ����ϴ�.");
				System.out.println("������ ���� 0 ~ 100���� �Է����ּ���");
			}
		}
			
	
}
