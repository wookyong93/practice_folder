package ex02;

public class ArrayExam01 {
	public static void main(String[] args) {
//		int var1[];
//		int []var2; 
		// []�� �ǹ̴� �迭�� ����ϰٴ�
		//��ġ�� �������;
		int[] var1; //�迭 ����
		var1 =new int[] {80,100,90};// ���� �� �� �Է�;
		
		int[]var2 = {100,90,80};//�迭����� ���ÿ� �� �Է�;
		
		System.out.println(var1.length);
		//var1.length �� �ȿ� ���Ե� ����
		for(int i =0 ; i <var1.length;i++) {
			System.out.println(var1[i]);
			//var1[0] , var1[1],var1[2]
		}
	}
}
