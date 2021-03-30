package quiz01;

import java.io.BufferedReader;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
       for(int i=0;i<N;i++) {
    	   int A=sc.nextInt();
    	   int B=sc.nextInt();
    	   System.out.println(A+B);
       }
	}
}
