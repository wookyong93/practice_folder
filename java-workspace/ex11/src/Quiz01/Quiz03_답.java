package Quiz01;

import java.util.Random;
import java.util.Scanner;

public class Quiz03_답 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		while(true) {
			System.out.println("====UP&DOWN 게임 스타트 ====");
			int com = rand.nextInt(101);
			
			for(int i = 0; i<10;i++) {
				System.out.println(i+1+"번째 시도");
				System.out.print("값 입력 : ");
				int user = sc.nextInt();
				
				if(user >com) {
					System.out.println("DOWN");
				}else if(user < com) {
					System.out.println("UP");
				}else {
					System.out.println("정답입니다.");
					break;//정답을 맞추고 계속 반복 실행;
					//return;  정답을 맞추면 프로그램 종료; 
				}
				
				if(i == 9) {
					System.out.println("패배하였습니다.");
					System.out.println("정답은 "+com+"입니다.");
				}
			}
		}
	}
}
