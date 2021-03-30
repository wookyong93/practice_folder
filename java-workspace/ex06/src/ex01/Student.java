package ex01;

public class Student {
	public String name;
	 int kor;
	 int eng;
	 int math;
		//public : 전체가 공유 = > 전체가 데이터의 값을 읽고 쓰기 가능
		//default : 접근제한자를 사용하지 않음 => 같은 패키지 안에서만;
	 	//protected : 같은 패키지내와 상속받은 자식 클래스에서 값을 읽고 쓰기  => 상속 할때 재설명
	 	//private : 클래스 내부에서만 값을 읽고 쓰기가 가능
	 
	 
	 
	 //메소든 : 접근제한자 결과자료형 메소드명 (인자값)
	 //결과 자료형 : 메소드가 끝날때 전달할 자료형의 종류(int double String 객체 void ... )
	 //메소드명 : 처음시작은 소문자 중간에 단어 연결할때 첫글자는 대문자 사용
	 //인자값 : 메소드를 호출한 사람이 전달해주는 값 (int double String 객체 void ... )
	 public int scoreSum() {
		 int sum = kor+eng+math;
		 return sum;
	 }
	 public double ScoreAvg(int sum) {
		 return sum/3.0;
	 }
}
