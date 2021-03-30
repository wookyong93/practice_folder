package ex03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam1 {
	public static void main(String[] args) {
		Date now = new Date();
		String nowDate1 = now.toString();
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초 E요일");
		String nowDate = sdf.format(now);
		System.out.println(nowDate);
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		nowDate = sdf.format(now);
		System.out.println(nowDate);
		
		//G : AD , BC 출력
		//y : 년도 
		//M : 월
		//d : 일
		//E : 요일
		//h : 1~12 시
		//H : 0~23 시
		//m : 분
		//s : 초
		//a : 오전 /오후
		//z : 타임존
	}
}
