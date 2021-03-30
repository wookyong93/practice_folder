package Quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentInfoImpl implements StudentInfo {
	
	Scanner sc = new Scanner(System.in);
	List <Student> list = new ArrayList<>();
	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 학생입력\n2. 학생검색 \n3. 학생출력 \n4. 학생수정 \n5.학생삭제 \n0.종료");
		System.out.print("메뉴선택 : ");
		int menu = sc.nextInt();
		return menu;
	}

	@Override
	public void Input() {
		System.out.print("학번 입력 : ");
			int num = sc.nextInt();
				if(list.size() != 0) {
					for(Student s : list) {
						if(s.getColnum() == num) {
							System.out.println("중복된 학번 입니다.");
							return;
						}
					}
				}
			Student s= new Student();
			s.setColnum(num);
			System.out.print("이름 입력 : ");
			s.setName(sc.next());
			System.out.print("학년 입력 : ");
			s.setYear(sc.nextInt());
			System.out.print("전공과목 입력 : ");
			s.setMajor(sc.next());
			list.add(s);
		}

	@Override
	public void serch() {
		// TODO Auto-generated method stub
		if(list.isEmpty()) {
			System.out.println("입력된 정보가 없습니다.");
		}else {
		System.out.print("검색할 학생 학번 입력 : ");
			int var1 = sc.nextInt();
		
			for(Student s : list) {
				if(s.getColnum() == var1) {
					System.out.println("학번 : "+s.getColnum());
					System.out.println("이름 : "+s.getName());
					System.out.println("학년 : "+s.getYear());
					System.out.println("전공과목 : "+ s.getMajor());
					return;
				}
			}System.out.println("검색하는 사용자가 없습니다.");
		}
	}
	@Override
	public void outPut() {
		// TODO Auto-generated method stub
		if(list.isEmpty()) {
			System.out.println("등록된 학생이없습니다.");
		}else {
			for(Student s : list) {
				System.out.println("===== 학생 출력 =====");
				System.out.println("학번 : "+s.getColnum());
				System.out.println("이름 : "+s.getName());
				System.out.println("학년 : "+s.getYear());
				System.out.println("전공과목 : "+ s.getMajor());
			}
		}
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		if(list.isEmpty()) {
			System.out.println("입력된 정보가 없습니다.");
		}else {
		System.out.print("수정할 학생 학번 입력 : ");
		int num = sc.nextInt();
					for(int i =0; i<list.size();i++) {
						if(list.get(i).getColnum()==num){
							System.out.println("해당학번에 수정할 이름 입력 : ");
							list.get(i).setName(sc.next());
							System.out.println("해당학번에 수정할 학년 입력 : ");
							list.get(i).setYear(sc.nextInt());
							System.out.println("해당학번에 수정할 전공과목 입력 : ");
							list.get(i).setMajor(sc.next());
							System.out.println("수정이 완료되었습니다.");
							return;
						}
				}System.out.println("검색한 학번이 없습니다.");
			}
	}
	

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.print("삭제할 학생 학번 입력 : ");
		int num = sc.nextInt();
			for(Student s : list) {
				if(s.getColnum()==num) {
					System.out.println(s.getColnum()+"학번 학생의 정보가 삭제 됩니다.");
					
					list.remove(s);
					return;
				}
			}System.out.println("검색하는 사용자가 없습니다.");
	}

}
