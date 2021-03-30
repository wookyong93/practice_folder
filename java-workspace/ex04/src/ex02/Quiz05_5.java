package ex02;

import java.util.Scanner;

public class Quiz05_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당월을 입력해주세요 : ");
		int tomonth = sc.nextInt();
		System.out.print("당일을 입력해주세요 : ");
		int today= sc.nextInt();
		System.out.println("오늘은 2020년 "+tomonth+ "월 " +today+ "일 입니다.");
		System.out.println("======================================");
		System.out.print("당신의 태어난 해 입력 : ");
		int year = sc.nextInt();
		System.out.print("당신의 태어난 월 입력 : ");
		int month = sc.nextInt();
		System.out.print("당신의 태어난 일 입력 : ");
		int day = sc.nextInt();
		System.out.println("======================================");
		System.out.printf("당신의 생년월일은 %d 년 %d 월 %d 일 입니다.\n",year,month,day);
		System.out.println("======================================");
		int age1=0;
		if(month <= tomonth) {
			if(month<tomonth) {
				age1 =2020-year;
			}else if(month == tomonth) {
				if(day <= today) {
					age1 =2020-year;
			}else if (day > today) {
					age1 =2019-year;
				}
			}
		}else{
			age1 =2019-year;
		}
		System.out.println("당신은 만"+age1+"세입니다.");
		System.out.println("======================================");
		System.out.print("당신의 이름을 입력해주세요. : ");
		String name = sc.next();
		 sc.nextLine();
		System.out.print("당신의 주소를 입력해주세요. : ");
		String address = sc.nextLine();
		System.out.println("======================================");
		System.out.println("\t신\t상\t정\t보");
		System.out.println("======================================");
		System.out.printf("당신의 이름 : %s\n당신의 생년월일: %d 년 %d 월 %d 일\n만나이 : %d\n당신의 주소: %s ",name,year,month,day,age1,address);
		// 생월 
	}
}
