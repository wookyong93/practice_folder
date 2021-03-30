package Quiz01;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random rsp = new Random();
		//0.가위 1.바위 2. 보자기
		while(true) {
			System.out.println("1. 가위  2.바위 3. 보자기 0.종료");
			System.out.print("선택 : ");
				int my = sc.nextInt();
				int you = rsp.nextInt(3)+1;
				
					String r = "바위";
					String s = "가위";
					String p = "보자기";
				switch(my) {
				case 1 :
					System.out.println("나 : " +s);
					if(you == 1) {
						System.out.println("상대 : "+s);
						System.out.println("비겻습니다.");
					}else if (you == 2) {
						System.out.println("상대 :"+r);
						System.out.println("졌습니다.");
					}else if(you ==3 ) {
						System.out.println("상대 : "+p);
						System.out.println("이겼습니다.");
					}
					break;
				case 2 :
					System.out.println("나 : "+ r);
					if(you == 1) {
						System.out.println("상대 : "+s);
						System.out.println("이겼습니다.");
					}else if (you == 2) {
						System.out.println("상대 :"+r);
						System.out.println("비겼습니다.");
					}else if(you ==3 ) {
						System.out.println("상대 : "+p);
						System.out.println("졌습니다.");
					}
					break;
				case 3 : 
					System.out.println("나 :"+ p);
					if(you == 1) {
						System.out.println("상대 : "+s);
						System.out.println("졌습니다.");
					}else if (you == 2) {
						System.out.println("상대 :"+r);
						System.out.println("이겼습니다.");
					}else if(you ==3 ) {
						System.out.println("상대 : "+p);
						System.out.println("비겼습니다.");
					}
					break;
				case 0 : 
					System.out.println("GAME EXIT");
					return;
				default :
					System.out.println("다시입력 ");
				}
			}
			
	}
}
