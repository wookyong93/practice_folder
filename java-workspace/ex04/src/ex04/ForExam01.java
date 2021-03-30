package ex04;

public class ForExam01 {
	public static void main(String[] args) {
		int i=0;
		for(i=0; i<5; i++) {
			System.out.println(i);
			//i = 0  = > i ++ : 1 -> 1 < 5 : true
			//i = 1  = > i ++ : 2 -> 2 < 5 : true
			//i = 2  = > i ++ : 3 -> 3 < 5 : true
			//i = 3  = > i ++ : 4 -> 4 < 5 : true
			//i = 3  = > i ++ : 5 -> 5 < 5 : false
		}
		System.out.println(i);
	}
}
