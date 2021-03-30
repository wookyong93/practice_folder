package Quiz01;

import java.util.Arrays;
import java.util.Random;

public class Quiz01 {
	public static void main(String[] args) {
		Random lotto = new Random();
		
		int[] num = new int[6];
		for(int i =0; i<6;i++) {
			num[i]= lotto.nextInt(45)+1;
				for(int j =0 ; j<i ; j++) {
					if(num[i] == num[j]) {
						i--;
				}
			}
		}
		Arrays.sort(num);
		for(int i =0; i<6 ;i++) {
			System.out.print(num[i]+" ");
		}
	}
}
