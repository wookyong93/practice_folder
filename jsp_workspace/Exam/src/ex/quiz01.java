package ex;

import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("전자계산기 점수 입력 : ");
		int var1 = sc.nextInt();
		System.out.print("데이터베이스 점수 입력 : ");
		int var2 = sc.nextInt();
		System.out.print("알고리즘 점수 입력 : ");
		int var3 = sc.nextInt();
		
		int sum= var1+var2+var3;
		double avg = sum/3.0;
		System.out.println("이름 : "+name);
		System.out.println("총점 : "+sum);
		System.out.printf("평균 : %.2f%n",avg);
		
		if(var1<40 || var2<40 || var3 <40) {
			System.out.println("과목 40점 미만이 있으므로 불합격입니다.");
		}else if(avg>=60){
			System.out.println("평균 60점 이상으로 합격입니다.");
		}else{
			System.out.println("평균 60점 미만으로 불합격입니다.");
		}
		
		if(var1<40) {
			System.out.println("전자계산기 점수 40점 미만으로 불합격");
		}else if(var2<40) {
			System.out.println("데이터베이스 점수 40점 미만으로 불합격");
		}else if(var3<40) {
			System.out.println("알고리즘 점수 40점 미만으로 불합격");
		}else if(avg>=60) {
			System.out.println("평균 60점 이상 합격입니다.");
		}else {
			System.out.println("평균 60점 미만으로 불합격입니다.");
			}
	}
}
