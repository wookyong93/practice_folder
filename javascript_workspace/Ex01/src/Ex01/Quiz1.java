package Ex01;



public class Quiz1 {
	public static void main(String[] args) {
		int []a = new int[9];
		int b=0;
//		int c=0;
//		for(b=1; b<9;b++) {
//			for(c=0; c<9;c++) {
//				a[c]=(b+1)*(c+1);
//				
//			}
//			for(int i=0;i<9;i++) {
//				System.out.println((b+1)+"x"+(i+1)+"="+a[i]);
//			}		
//		}
		while(b<9) {
			b=b+1;
			int c=0;
			while(c<9) {
				c=c+1;
				a[c-1] = b*c;
			}
			for(int i =1;i<=9;i++) {
				System.out.println(b +" x "+ i + " = " + a[i-1]);
			}
		}
	}
}
