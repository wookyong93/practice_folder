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
			System.out.print("�� �Է�[0~100] : ");
			int var = sc.nextInt();
			list.add(var);
			
				if(list.size() >= 11) {
					System.out.println("������ ���ߴ´� �����߽��ϴ�.");
					System.out.println("���� : "+num);
					System.out.println("���α׷��� ����˴ϴ�.");
					return;
				}
				if(var > num) {
					System.out.println("����� �Է��� ������ DOWN");
				}else if(var < num) {
					System.out.println("����� �Է��� ������ UP");
				}else if(var == num) {
					System.out.println("�����Դϴ�.");
					System.out.println("������ : "+num);
					System.out.println("���α׷��� ����˴ϴ�.");
					return;
				}
			
			
		}
				
			
	}
}
