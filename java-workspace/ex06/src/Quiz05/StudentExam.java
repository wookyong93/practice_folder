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
					System.out.println("더이상 저장할 수 없습니다.");
				}else {
					student[num] =smenu.studentInput(num);
					num++;
				}
				break;
			case 2 : 
					if(smenu.studentSerch(student, num)) {
						System.out.println("찾는 사람이 없습니다.");
					}
		            break;

			case 3 :
				smenu.studentOutAll(student, num);
			break;
			case 0 : {
				System.out.println("종료됩니다.");
				}
			break f;
			default : 
				System.out.println("없는 메뉴입니다.");
			}
	      }
	}
	
}
