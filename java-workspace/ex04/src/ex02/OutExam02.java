package ex02;

public class OutExam02 {
	public static void main(String[] args) {
		double d1 = 1.1;
		System.out.println(d1);
		System.out.printf("%f\n",d1);
		// % 전체길이. 소수점 아래 공간 지정 - 전체길이의 오른쪽 정렬
		System.out.printf("%10f\n",d1);
		// % 전체길이. 소수점 아래 공간 지정 - 전체길이의 왼쪽 정렬
		System.out.printf("%-10f\n",d1);
		System.out.printf("%10.2f\n",d1);
		// 전체 길이가 출력해야 할 범위보다 작으면 출력할 내용을 그냥 출력
		System.out.printf("%5.8f\n",d1);
		
		int var =100;
		System.out.printf("%5d\n",var);
		System.out.printf("%-5d\n",var);
		System.out.printf("%05d\n",var);
	}
}
