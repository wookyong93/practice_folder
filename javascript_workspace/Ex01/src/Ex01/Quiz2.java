package Ex01;

public class Quiz2 {
	public static void main(String[] args) {
		int i=0;
		int j=0;
		int sw=0;
		
//		for(i=0;i<100;i++) {
//			if(sw==0) {
//				j= j+(i+1);
//				sw=1;
//			}else if(sw!=0) {
//				j= j-(i+1);
//				sw=0;
//			}
//		}
//		System.out.println(j);

		while(i<100) {
			i=i+1;
			if(sw==0) {
				j=j+i;
				sw=1;
			}else if(sw!=0){
				j=j-i;
				sw=0;
			}
		}
		System.out.println(j);
	}
}
