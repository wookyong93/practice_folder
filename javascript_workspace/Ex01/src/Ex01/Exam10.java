package Ex01;

public class Exam10 {
	public static void main(String[] args) {
		int [][] a = new int [5][5];
		int k=0;
		int s=3;
		int e=3;
		
		for(int i=1;i<=5;i++) {
			for(int j=s;j<=e;j++) {
				k = k + 1;
				a[i-1][j-1] = k;
			}
			if(i>=3) {
				s++;
				e--;
			}else {
				s--;
				e++;
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		
	}
}
