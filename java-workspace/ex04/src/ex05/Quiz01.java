package ex05;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");	
			int num = sc.nextInt();
			int i =1;//����
			
				while(i<=9){//����
					System.out.println(num+" * "+i+" = "+(num*i));//����� ����ɋ� ���� �ݺ�
					i++;//����
					}
				i =1;
				while(true) {
					
					System.out.println(num+" * "+i+" = "+(num*i));
					i++;
					if(i == 10) {
						System.out.println("����");
						break;
					}
				}
				
			System.out.println("");
			
			int n = 1;//���۽�//i =1; ���� �ʱ�ȭ�� ��������Ѵ�.
			
				while(n<=100) {//�����
					//n++;//������
						if(n%num==0) {//���� �ϴ� ���ȿ����� ����
							System.out.print(n+" ");//���ǿ� ���� ��� �ݺ�
						}
						n++;//������
					}//����� ������ ����
				n = 0;//���۽�//i =1; ���� �ʱ�ȭ�� ��������Ѵ�.
				
				while(true) {//�����
					n++;//������
						if(n%num==0) {//���� �ϴ� ���ȿ����� ����
							System.out.print(n+" ");//���ǿ� ���� ��� �ݺ�
						}
						if(n==100) {
							break;
						}
						//n++;//������
					}
				
	}
}
	
