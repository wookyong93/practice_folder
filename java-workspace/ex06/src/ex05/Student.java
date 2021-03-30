package ex05;

public class Student {
	
	// 인스턴스(객체)에서 공통으로 사용되는 값을 지정할때 쓴다.
	//(1>2>3>4>5) 식으로 불러올수있다;
	static int classNum=0;
	
	Student(){
		classNum+=1;
		
		System.out.println(StudentExam.PI);
	}
}
