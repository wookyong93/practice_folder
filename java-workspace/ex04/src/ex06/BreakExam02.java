package ex06;

public class BreakExam02 {
	public static void main(String[] args) {
		int i =0;
		first : while(true) {
			second : while(true) {
				System.out.println(i);
				
				if(i ==5 ) {
					break first;
				}
				i++;
			
			}
		}
		label : for(int j =0; j<100;j++) {
				for(int k =0; k<100;k++) {
					System.out.println(k);
					if(k == 5) {
						break label;
					}
				}
		}
	}
}
