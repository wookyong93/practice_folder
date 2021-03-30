package ex02;

import java.util.Random;

public class Exam4 {
	public static void main(String[] args) {
		Random rand = new Random();
		
//		int number = rand.nextInt(5);
//		//0 시작 4 까지 
//		System.out.println(number);
//		
//		number = rand.nextInt(5)+1;
//		System.out.println(number);
		
		int[] num = new int[5];
		for(int i = 0 ; i<5 ; i++) {
			num[i] =rand.nextInt(100)+1;
		}
		for(int i = 0; i<5;i++) {
			System.out.println(num[i]);
		}
	}
}
