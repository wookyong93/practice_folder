package Quiz01;

import java.util.Random;
import java.util.Scanner;

public class Quiz02_답 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
	while(true) {	
		int com = rand.nextInt(3)+1;
		
		System.out.println("1. 가위 2. 바위 3. 보자기 ");
		System.out.print("선택 : ");
		int user = sc.nextInt();
		int win = 0;
		int  draw =0;
		int lose = 0;
		
		switch(user) {
		case 1: 
			if(com ==1) {
				System.out.println("둘다 가위로 비겼습니다.");
				draw++;
			}else if(com ==2) {
				System.out.println("컴퓨터 : 바위 ,사용자 : 가위 ");
				System.out.println("컴퓨터가 이겼습니다.");
				lose++;
			}else {
				System.out.println("컴퓨터 : 보자기, 사용자 :가위");
				System.out.println("사용자가 이겼습니다.");
				win++;
			}
			break;
		case 2 : 
			if(com ==1) {
				System.out.println("컴퓨터 : 가위 ,사용자 : 바위 ");
				System.out.println("사용자가 이겼습니다.");
				win++;
			}else if(com ==2) {
				System.out.println("둘다 바위로 비겼습니다.");
				draw++;
			}else {
				System.out.println("컴퓨터 : 보자기, 사용자 :바위");
				System.out.println("컴퓨터가 이겼습니다.");
				lose++;
			}
			break;
		case 3 : 
			if(com ==1) {
				System.out.println("컴퓨터 : 가위, 사용자 :보자기");
				System.out.println("컴퓨터가 이겼습니다.");
				lose++;
			}else if(com ==2) {
				System.out.println("컴퓨터 : 바위 ,사용자 : 보자기 ");
				System.out.println("사용자가 이겼습니다.");
				win++;
			}else {
				System.out.println("둘다 보자기로 비겼습니다.");
				draw++;
			}
			break;
			
			default :
				System.out.println("잘못입력되었습니다.");
		}
		System.out.println("승 : "+win+"무 : "+draw+"패:"+lose);
		
		if(win ==5 || lose ==5) {
			System.out.println("승률을 초기화 합니다.\n");
			win =0;
			lose =0;
			draw =0;
		}
	}
		
	}
}
