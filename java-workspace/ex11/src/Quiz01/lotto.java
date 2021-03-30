package Quiz01;

import java.util.Arrays;
import java.util.Random;

public class lotto {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] lotto = new int[6];
		
		for(int i =0; i<6;i++) {
			lotto[i] = rand.nextInt(45)+1;
			for(int j =0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		
		Arrays.sort(lotto);
		for(int i =0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
	}
}
