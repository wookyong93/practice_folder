package Quiz05;

import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] student = new Student[5];
		StudentMenu smenu = new StudentMenu();
		String name;
		int num = 0;
f:	while(true) {
		int M = smenu.menu();
			switch(M) {
			case 1:
				if(num==5) {
					System.out.println("���̻� ������ �� �����ϴ�.");
				}else {
					student[num] =smenu.studentInput(num);
					num++;
				}
				break;
			case 2 : 
					if(smenu.studentSerch(student, num)) {
						System.out.println("ã�� ����� �����ϴ�.");
					}
		            break;

			case 3 :
				smenu.studentOutAll(student, num);
			break;
			case 0 : {
				System.out.println("����˴ϴ�.");
				}
			break f;
			default : 
				System.out.println("���� �޴��Դϴ�.");
			}
	      }
	}
	
}
