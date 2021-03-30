package ex05;

import java.util.Scanner;

public class Quiz02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {//무한반복
			System.out.print("정수 입력 : ");	
				int num = sc.nextInt();
				if(num>=2 && num<=9) {
//					int i =1;
//					while(i<=9){
//						System.out.println(num+" * "+i+" = "+(num*i));
//						i++;
//						}
					for(int i =1 ; i<=9;i++) {//반복문 중첩으로 여기까지 실행시킴
						System.out.println(num+" * "+i+" = "+(num*i));
					}//반복의 범위가 1~9까지 정해졌으므로 1~9까지 하고 재시작
				}else if (num == 0){ // 0이입력되면 종료합니다하고 브레이크
						System.out.println("종료합니다");
						break;
				}else {
						System.out.println("범위가 벗어났습니다.");
				}//그외 범위를 입력하면 재시작
		}	
	}
}
