package ex02;

import java.util.Scanner;

public class Quiz05_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//↑ String name = new String("블라블라"); 과 비슷한 내용이다 
		//↑ sc 는 스캐너이름이므로 원하는 내용을 입력하면 된다.
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int meth = sc.nextInt();
		System.out.println("===============================");
		
		int sum = kor + eng + meth;
		double avg = (double)sum / 3; // or sum / 3.0;
		//(double) 붙여주지않으면 정수로 계산 인식되어 정확한 계산이 되지않는다.
		//System.out.println(name + " 님의 총점은 "+sum+" 점이고, 평균은 "+avg+" 점입니다.");
		
		System.out.printf("%s 님의 총점은 %d 점이고,평균은 %.2f 점입니다.\n",name,sum,avg);
		// %d = 정수, %f = 실수, %s = 문자열, %c = 한글자 ==> 외우기;
		//printf 의 경우에는 줄바꿈이 되지않는다 \n 으로 줄을 바꿔 준다 .
		//Enter => \r\n 입력이 된다
		
		
	}
}
