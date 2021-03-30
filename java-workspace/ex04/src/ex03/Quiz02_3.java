package ex03;

import java.util.Scanner;

public class Quiz02_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("월 입력 : ");
			
			int month = sc.nextInt();
			String day = null;
			
			if(month >= 1 && month<=12) {
			switch (month){
				case 1 :
				case 3 : 
				case 5 : 
				case 7 :
				case 8 :
				case 10:
				case 12:
					//System.out.println(month + " 월은 31일까지 있습니다.");
					day ="31일";
					break;
				case 2 :
					day = "28 ~ 29일";
					break;
				case 4 : 
				case 6 :
				case 9 :
				case 11:
					//System.out.println(month + " 월은 30일까지 있습니다. ");
					day="30일";
					break;
				
			}System.out.println(month+" 월은 " + day + "까지 있습니다.");
		}else {
			System.out.println(month+"월은 존재하지 않습니다.");
		}
	}
}
