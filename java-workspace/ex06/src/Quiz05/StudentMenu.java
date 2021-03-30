package Quiz05;

import java.util.Scanner;

public class StudentMenu {
	Scanner sc = new Scanner(System.in);
	public int menu() {
		System.out.println("1. 학생입력\n2. 학생출력\n3. 전체학생정보\n0. 종료");
		System.out.print("메뉴 선택 : ");
		int menu =sc.nextInt();
		return menu;
	}
	
	public Student studentInput(int num) {
		Student student = new Student();
		
		student.setSnum(num+1001);
		System.out.print(student.getSnum()+"번 학생 이름 입력 : ");
		student.setName(sc.next());
		System.out.print(student.getSnum()+"번 학생 학과 입력 : ");
		student.setMa(sc.next());
		
		return student;
	}
	
	public void studentOutAll(Student[] student,int num) {
		for(int i = 0;i<num;i++) {
			System.out.println("====="+student[i].getSnum()+"학번=====");
			System.out.println("이름 : "+student[i].getName());
			System.out.println("학과 : "+student[i].getMa());
			}
	}
	public boolean studentSerch(Student[] student,int num) {
		System.out.println("검색할 학번 입력 : ");
       int tmp = sc.nextInt();
         for (int i = 0;i < num; i++) {
           if(tmp == student[i].getSnum()) {
              System.out.println(student[i].getSnum() + "학번");
              System.out.println("이름 : " + student[i].getName());
              System.out.println("학과 : " + student[i].getMa());
             return false;
           }
        }
         return true;
	}

	
	
}
