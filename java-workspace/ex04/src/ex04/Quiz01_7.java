package ex04;

import java.util.Scanner;

public class Quiz01_7 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("���� �� �Է� : ");
		int num = sc.nextInt();
			if(num>0 && num<=10) {//0~10 ������ ��
				if (num%2 ==0) {//¦��
						int sum=0;
							for(int i=1;i<=100;i++) {
								if(i%num == 0 ) {//num�� ����� ���
									sum += i;//num�� ����� sum = 0 +=�� ���Ѵ�. ex )0+2+4+6+8+10;
								}
							}System.out.println(sum);//for�� �ۿ������հ踦 ���
						
					}else if(num%2 ==1) {//Ȧ��
						for(int i=1;i<=100;i++) {
							if(i%num ==0) {//num�� ����� ����Ѵ�.
								System.out.print(i+" ");//for�� �ȿ��� 1~100���� �ݺ��Ͽ� �� ���� ���
							}
						}
						
					}
			}else {//������ ��� ��
				System.out.println("������ �ʰ� �߽��ϴ�.\n [1~10]������ ���� �Է����ּ���.");
			}
	}
}
