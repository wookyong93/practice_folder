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
		System.out.print("�й� �Է� : ");
		stu.setStu_no(sc.nextInt());
		System.out.print("�̸� �Է� : ");
		stu.setStu_name(sc.next());
		System.out.print("�г� �Է� : ");
		stu.setStu_year(sc.nextInt());
		
		System.out.print("�������� �Է� :");
		sco.setKor(sc.nextInt());
		System.out.print("�������� �Է� : ");
		sco.setEng(sc.nextInt());
		System.out.print("�������� �Է� : ");
		sco.setMath(sc.nextInt());
		
		if(data.insert(stu, sco)) {
		return true;
		}
		return false;

	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		System.out.print("������ �й� �Է� : ");
		int stu_no = sc.nextInt();
		if(data.delete(stu_no)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		System.out.print("������ �й� �Է� : ");
		stu.setStu_no(sc.nextInt());
		System.out.print("�̸� ���� : ");
		stu.setStu_name(sc.next());
		System.out.print("�г� ���� : ");
		stu.setStu_year(sc.nextInt());
		
		System.out.print("�������� ���� :");
		sco.setKor(sc.nextInt());
		System.out.print("�������� ���� : ");
		sco.setEng(sc.nextInt());
		System.out.print("�������� ���� : ");
		sco.setMath(sc.nextInt());
		
		if(data.update(stu, sco)) {
			return true;
		}
		return false;
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.print("�˻��� �й� �Է� : ");
		int stu_no = sc.nextInt();
		
		data.search(stu_no);
	}

}
