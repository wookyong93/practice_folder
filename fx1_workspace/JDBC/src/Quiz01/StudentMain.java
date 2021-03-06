package Quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		StudentService stuService = new StudentServiceImpl();
		List<Student> list  =new ArrayList<>();
		int num;
		boolean bl;
		while(true) {
			System.out.println("1. 학생입력 2. 학생수정 3. 학생삭제 4.학생 출력 5.학생 검색 0.종료");
			System.out.print("선택 : ");
			int menu =sc.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.print("학번입력 : ");
				student.setNum(sc.nextInt());
				bl = stuService.checknum(student.getNum());
				if(bl) {
					System.out.println("중복된 학번입니다.");
				}else {
					System.out.print("이름입력 :");
					student.setName(sc.next());
					System.out.print("학과입력 : ");
					student.setMajor(sc.next());
					System.out.print("학년입력 : ");
					student.setYear(sc.nextInt());
					stuService.insert(student);
				}
				break;
			case 2 :
				if(stuService.checkMember()) {
				System.out.print("수정할 학번 검색 : ");
				student.setNum(sc.nextInt());
				bl = stuService.checknum(student.getNum());
				if(bl) {
					System.out.print("이름입력 :");
					student.setName(sc.next());
					System.out.print("학과입력 : ");
					student.setMajor(sc.next());
					System.out.print("학년입력 : ");
					student.setYear(sc.nextInt());
					
					stuService.update(student);
				}else {
					System.out.println("검색한 학번이 없습니다.");
				}
				}else {System.out.println("저장된 학생이 없습니다.");}
				break;
			case 3 :
				if(stuService.checkMember()) {
				System.out.print("삭제할 학번 입력 : ");
				num = sc.nextInt();
				bl =stuService.checknum(num);
				if(bl) {
					stuService.delete(num);
				}else {
					System.out.println("검색한 학번이 없습니다.");
				}
				}else {System.out.println("저장된 학생이 없습니다.");}
				break;
			case 4 :
				list = stuService.select();
				if(list.size() !=0) {
					for(Student s : list) {
						System.out.println("학번 : "+s.getNum());
						System.out.println("이름 : "+s.getName());
						System.out.println("학과 : "+s.getMajor());
						System.out.println("학년 : "+s.getYear());
					}
					
				}else {
						System.out.println("입력된 학생이 없습니다.");
					}
				
				break;
			case 5 : if(stuService.checkMember()) {
				System.out.print("검색할 학번 입력 : ");
				num =sc.nextInt();
				stuService.search(num);
				}else {
					System.out.println("저장된 학생이 없습니다.");
				}
				break;
			case 0 :
				System.out.println("프로그램이 종료됩니다.");
				return;
			default :
				System.out.println("없는 메뉴입니다.");
				
			}
		}
		
	}
}
