package ex05;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			if(num>=2 && num<=9) {
					int i  = 1;
					while(i<10) {
						System.out.println(num+" * "+i+" = "+(num*i));
						i++;
						if(i>9) {
						System.out.println("���Ḧ ���Ͻø� 0�� �Է����ּ���. \n���Ͻ����ʴ´ٸ� �����Է��� ���ּ���.");
						num =sc.nextInt();
						
						if(num == 0) {
							System.out.println("�����մϴ�");
							break;
						}else {
							i =1;
						}
					}
				}	
				
			}else {
				System.out.println("������ ������ϴ�.");
			}
		
}
}
