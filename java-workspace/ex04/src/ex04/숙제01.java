package ex04;

import java.util.Scanner;
//1~10 ���̿� �Է��ϰ� 
//1~100�� �Է��� ���� 3�̶��  �� ����� �հ踦 ���
//1~100�� �Է��� ���� 9�̶��  �� ����� ������ŭ ��ǥ ���
//1~100�� �Է��� ���� 3�̳� 9�� �ƴ϶��  �Է��� ������� ��� ���

public class ����01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
				if(num >0 && num<=10) {
					if(num==3){
						int sum=0;
						for(int i = 1; i<=100;i++) {
							if(i%num == 0) {
								sum +=i;
							}
						}System.out.println(sum);
					} else if(num == 9) {
						String ch = "��";
						for(int i = 1;i<=100;i++) {
							if(i%num==0) {
								System.out.print(ch+" ");
								}
							}
						}
					else {
					for(int i = 1;i<=100;i++) {
						if(i%num==0) {
							System.out.print(i+" ");}		
						}
					}
					
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.\n [1~10]������ ���ڸ� �Է����ּ���.");
				}
		
	}
}
