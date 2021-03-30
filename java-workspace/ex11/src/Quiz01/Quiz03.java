package Quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		Random rand = new Random();
		int num = rand.nextInt(101);
		
		while(true) {
			System.out.print("값 입력[0~100] : ");
			int var = sc.nextInt();
			list.add(var);
			
				if(list.size() >= 11) {
					System.out.println("정답을 맞추는대 실패했습니다.");
					System.out.println("정답 : "+num);
					System.out.println("프로그램이 종료됩니다.");
					return;
				}
				if(var > num) {
					System.out.println("당신이 입력한 값보다 DOWN");
				}else if(var < num) {
					System.out.println("당신이 입력한 값보다 UP");
				}else if(var == num) {
					System.out.println("정답입니다.");
					System.out.println("정답은 : "+num);
					System.out.println("프로그램이 종료됩니다.");
					return;
				}
			
			
		}
				
			
	}
}
