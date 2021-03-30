package ex02;

public class ArrayExam01 {
	public static void main(String[] args) {
//		int var1[];
//		int []var2; 
		// []의 의미는 배열을 사용하겟다
		//위치는 상관없다;
		int[] var1; //배열 선언
		var1 =new int[] {80,100,90};// 선언 후 값 입력;
		
		int[]var2 = {100,90,80};//배열선언과 동시에 값 입력;
		
		System.out.println(var1.length);
		//var1.length 는 안에 포함된 갯수
		for(int i =0 ; i <var1.length;i++) {
			System.out.println(var1[i]);
			//var1[0] , var1[1],var1[2]
		}
	}
}
