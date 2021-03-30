package ex05;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if(num>=2 && num<=9) {
					int i  = 1;
					while(i<10) {
						System.out.println(num+" * "+i+" = "+(num*i));
						i++;
						if(i>9) {
						System.out.println("종료를 원하시면 0을 입력해주세요. \n원하시지않는다면 정수입력을 해주세요.");
						num =sc.nextInt();
						
						if(num == 0) {
							System.out.println("종료합니다");
							break;
						}else {
							i =1;
						}
					}
				}	
				
			}else {
				System.out.println("범위를 벗어났습니다.");
			}
		
}
}
