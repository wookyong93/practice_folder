package ex05;

import java.util.Scanner;

public class Quiz02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {//���ѹݺ�
			System.out.print("���� �Է� : ");	
				int num = sc.nextInt();
				if(num>=2 && num<=9) {
//					int i =1;
//					while(i<=9){
//						System.out.println(num+" * "+i+" = "+(num*i));
//						i++;
//						}
					for(int i =1 ; i<=9;i++) {//�ݺ��� ��ø���� ������� �����Ŵ
						System.out.println(num+" * "+i+" = "+(num*i));
					}//�ݺ��� ������ 1~9���� ���������Ƿ� 1~9���� �ϰ� �����
				}else if (num == 0){ // 0���ԷµǸ� �����մϴ��ϰ� �극��ũ
						System.out.println("�����մϴ�");
						break;
				}else {
						System.out.println("������ ������ϴ�.");
				}//�׿� ������ �Է��ϸ� �����
		}	
	}
}
