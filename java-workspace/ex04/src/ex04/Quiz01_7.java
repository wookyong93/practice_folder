package ex04;

import java.util.Scanner;

public class Quiz01_7 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("정수 값 입력 : ");
		int num = sc.nextInt();
			if(num>0 && num<=10) {//0~10 사이의 값
				if (num%2 ==0) {//짝수
						int sum=0;
							for(int i=1;i<=100;i++) {
								if(i%num == 0 ) {//num의 배수를 출력
									sum += i;//num의 배수를 sum = 0 +=로 더한다. ex )0+2+4+6+8+10;
								}
							}System.out.println(sum);//for문 밖에서총합계를 출력
						
					}else if(num%2 ==1) {//홀수
						for(int i=1;i<=100;i++) {
							if(i%num ==0) {//num의 배수를 출력한다.
								System.out.print(i+" ");//for문 안에서 1~100까지 반복하여 그 값만 출력
							}
						}
						
					}
			}else {//범위를 벗어난 수
				System.out.println("범위를 초과 했습니다.\n [1~10]사이의 수를 입력해주세요.");
			}
	}
}
