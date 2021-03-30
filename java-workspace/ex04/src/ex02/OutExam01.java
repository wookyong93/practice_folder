package ex02;

public class OutExam01 {
	public static void main(String[] args) {
		System.out.println("글을 써요");
		System.out.println("다음라인으로 이동");
		
		System.out.println();
		
		System.out.print("글을 써요");
		System.out.print("다음라인으로 이동 안함");
		
		System.out.println();
		
		System.out.println("이름 : ");
		System.out.println("홍길동");
		
		System.out.print("이름 : ");
		System.out.println("홍길동");
		
		System.out.println();
		
		//System.out.printf("형식",값);
		System.out.printf("%d\n",100); //정수값   "%d" \n 은 한칸 내림 (Enter)
		System.out.printf("%f\n",1.1); // 실수값
		System.out.printf("%s\n","문자열");//문자열
		System.out.printf("%c\n", 'A');//단일문자
		//%d , %f , %s , %c => printf 에서만 사용가능
		//\n 은 한칸내림
		System.out.printf("\n값\n");
		System.out.printf("\n값\n");
		
		int date = 20;
		String week ="월";
		System.out.println("오늘은 "+date+"일 입이고, " +week+" 요일 입니다.");
		System.out.printf("오늘은 %d 일이고, %s 요일 입니다.\n", date, week);
		
		
		
	}
}
