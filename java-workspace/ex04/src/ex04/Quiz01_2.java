package ex04;

public class Quiz01_2 {
	public static void main(String[] args) {
		int sum  = 0;
		System.out.println("3�� ���");
		for (int i=1; i<=100;i++) {
			if(i%3 ==0) {
				System.out.print(i+" ");
			}
			if(i%5 ==0) {
				sum += i;
			}
			
		}
		System.out.println();
		System.out.println("5�ǹ���� �հ�");
		System.out.println(sum);
	}
}
