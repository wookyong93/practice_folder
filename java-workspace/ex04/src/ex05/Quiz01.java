package ex05;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");	
			int num = sc.nextInt();
			int i =1;//시작
			
				while(i<=9){//종료
					System.out.println(num+" * "+i+" = "+(num*i));//결과값 종료될떄 까지 반복
					i++;//증감
					}
				i =1;
				while(true) {
					
					System.out.println(num+" * "+i+" = "+(num*i));
					i++;
					if(i == 10) {
						System.out.println("종료");
						break;
					}
				}
				
			System.out.println("");
			
			int n = 1;//시작식//i =1; 으로 초기화를 시켜줘야한다.
			
				while(n<=100) {//종료식
					//n++;//증감값
						if(n%num==0) {//증감 하는 값안에서의 조건
							System.out.print(n+" ");//조건에 대한 출력 반복
						}
						n++;//증감값
					}//종료식 맞으면 종료
				n = 0;//시작식//i =1; 으로 초기화를 시켜줘야한다.
				
				while(true) {//종료식
					n++;//증감값
						if(n%num==0) {//증감 하는 값안에서의 조건
							System.out.print(n+" ");//조건에 대한 출력 반복
						}
						if(n==100) {
							break;
						}
						//n++;//증감값
					}
				
	}
}
	
