package ex04;

public class ForExam02 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=1 ; i<=10 ; i++) {
			sum += i; // sum = sum + i;
			// i : 1 ~ 10 ���� ��
			// sum :0 , i=1 ���Ѱ� sum = 1
			// sum :1 , i=2 ���Ѱ� sum = 3
			// sum :3 , i=3 ���Ѱ� sum =6
			// sum :6 , i=4 ���Ѱ� sum =10
			// sum :10, i=5 ���Ѱ� sum =15
			// sum :15, i=6 ���Ѱ� sum =21
			// sum :21, i=7 ���Ѱ� sum =28
			// sum :28, i=8 ���Ѱ� sum =36
			// sum :36, i=9 ���Ѱ� sum =45
			// sum :45, i=10 ���Ѱ� sum =55	
		}
		System.out.println(sum);
	}
}
