package ex05;

import java.util.Scanner;

public class Quiz04_�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	while(true) {	
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
			if(num>=1 && num<=9) {
				System.out.print("���ڸ����� �Է��� �� �����ϴ�.");
			}else if(num ==0){
				System.out.println("�����մϴ�.");
				break;
			} else {
				while(true) {
					System.out.print(num%10);
					num /= 10 ;
					if(num ==0) {
						break;
					}
				}
			}System.out.println();
		}
	}
}
