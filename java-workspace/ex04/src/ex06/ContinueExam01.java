package ex06;

public class ContinueExam01 {
	public static void main(String[] args) {
//		for(int i = 0 ; i < 100; i++){
//			if(i%2 == 0 ) {
//				System.out.println(i);
//			}
//		}
		
		for(int i =0 ; i<100; i++){
			if(i%2 != 0 ) {
				continue;
			}
			System.out.println(i);
		}
		int j =0;
		while(j<100) {
			j++;
			if(j%2 == 1) {
				continue;//if�� �������� �ٽ� while�� �÷���
				
			}
			System.out.println(j);// if ���ǿ� ���� ��ӽ�������ʴ� ���� ���
		}
	}
}
