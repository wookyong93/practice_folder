package ex02;

import java.util.Scanner;

public class Quiz01 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = {"����","����","����"};//�迭 ����
		int[] score = new int[3]; //�Է� ���� �迭 ����
		int sum = 0;//������ ���ϱ����� ������ ����
			for(int i =0 ; i<score.length;i++) {// �Է� ���� �迭�� ����ŭ for�� �ݺ�;
				System.out.println(str[i]+"���� �Է� : ");//[]�迭�� �� �� ���
				score[i] = sc.nextInt();//score[i] �� ��� �� �� �Է�
				sum+= score[i]; //sum += sum �� score[i] �� ������ ����
			}
			System.out.println("���� : "+sum);
			System.out.println("��� : "+(sum/3.0));
		
		}
		
}
