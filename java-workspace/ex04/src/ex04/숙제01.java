package ex04;

import java.util.Scanner;
//1~10 사이에 입력하고 
//1~100중 입력한 값이 3이라면  그 배수의 합계를 출력
//1~100중 입력한 값이 9이라면  그 배수의 갯수만큼 별표 출력
//1~100중 입력한 값이 3이나 9가 아니라면  입력한 배수값을 모두 출력

public class 숙제01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
				if(num >0 && num<=10) {
					if(num==3){
						int sum=0;
						for(int i = 1; i<=100;i++) {
							if(i%num == 0) {
								sum +=i;
							}
						}System.out.println(sum);
					} else if(num == 9) {
						String ch = "☆";
						for(int i = 1;i<=100;i++) {
							if(i%num==0) {
								System.out.print(ch+" ");
								}
							}
						}
					else {
					for(int i = 1;i<=100;i++) {
						if(i%num==0) {
							System.out.print(i+" ");}		
						}
					}
					
				}else {
					System.out.println("잘못 입력하셨습니다.\n [1~10]사이의 숫자를 입력해주세요.");
				}
		
	}
}
