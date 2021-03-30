package ex02;

public class DataTypeExam02 {
	public static void main(String[] args) {
		short var1 = -32768;
		short var2 = 32767;
		System.out.println(var1);
		System.out.println(var2);
		// 자신이 저장할 수 있는 범위가 넘어가면 에러 발생
		// var1 = -32768 - 1 ;
		// var2 = 32767 +1 ;
	}
}
