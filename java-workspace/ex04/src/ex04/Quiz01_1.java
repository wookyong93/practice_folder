package ex04;

public class Quiz01_1 {
	public static void main(String[] args) {
		int sum = 0;
		
		System.out.println("3�ǹ��");
		
		for(int i = 1 ; i<=100 ; i++ ) {
			
			if(i % 3 == 0) {
				sum += i; 
				System.out.print(i+",");
			}
			
		}
		System.out.println(sum);
		System.out.println("5�� ����� �հ�");
		int sum1 =0;
		for(int i = 1 ; i<=100 ; i++) {
			if(i%5 ==0 ) {
				sum1 +=i;
			}
		}System.out.println(sum1);
	}
		
}

