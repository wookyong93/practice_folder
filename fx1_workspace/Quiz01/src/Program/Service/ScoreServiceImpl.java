package Program.Service;

import java.util.Scanner;

import Program.DAO.DataService;
import Program.DAO.DataServiceImpl;
import Program.DTO.Score;
import Program.DTO.Student;

public class ScoreServiceImpl implements ScoreService{
	Student stu = null;
	Score sco = null;
	Scanner sc = null;
	DataService data = null;
	
	public ScoreServiceImpl() throws Exception{
	stu = new Student();
	sco = new Score();
	sc = new Scanner(System.in);
	data = new DataServiceImpl();
	}
	@Override
	public boolean insert() {
		// TODO Auto-generated method stub
		System.out.print("학번 입력 : ");
		stu.setStu_no(sc.nextInt());
		System.out.print("이름 입력 : ");
		stu.setStu_name(sc.next());
		System.out.print("학년 입력 : ");
		stu.setStu_year(sc.nextInt());
		
		System.out.print("국어점수 입력 :");
		sco.setKor(sc.nextInt());
		System.out.print("영어점수 입력 : ");
		sco.setEng(sc.nextInt());
		System.out.print("수학점수 입력 : ");
		sco.setMath(sc.nextInt());
		
		if(data.insert(stu, sco)) {
		return true;
		}
		return false;

	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		System.out.print("삭제할 학번 입력 : ");
		int stu_no = sc.nextInt();
		if(data.delete(stu_no)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		System.out.print("수정할 학번 입력 : ");
		stu.setStu_no(sc.nextInt());
		System.out.print("이름 수정 : ");
		stu.setStu_name(sc.next());
		System.out.print("학년 수정 : ");
		stu.setStu_year(sc.nextInt());
		
		System.out.print("국어점수 수정 :");
		sco.setKor(sc.nextInt());
		System.out.print("영어점수 수정 : ");
		sco.setEng(sc.nextInt());
		System.out.print("수학점수 수정 : ");
		sco.setMath(sc.nextInt());
		
		if(data.update(stu, sco)) {
			return true;
		}
		return false;
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.print("검색할 학번 입력 : ");
		int stu_no = sc.nextInt();
		
		data.search(stu_no);
	}

}
