package ex02;

import java.util.Scanner;

public class Quiz01 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = {"국어","영어","수학"};//배열 생성
		int[] score = new int[3]; //입력 받을 배열 갯수
		int sum = 0;//총합을 구하기위해 변수값 설정
			for(int i =0 ; i<score.length;i++) {// 입력 받을 배열의 수만큼 for문 반복;
				System.out.println(str[i]+"점수 입력 : ");//[]배열에 들어간 값 출력
				score[i] = sc.nextInt();//score[i] 의 들어 갈 값 입력
				sum+= score[i]; //sum += sum 에 score[i] 의 점수를 더함
			}
			System.out.println("총점 : "+sum);
			System.out.println("평균 : "+(sum/3.0));
		
		}
		
}
