package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreMethod {
	List<Score> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public int menu() {
		System.out.println("=====��  ��=====");
		System.out.println("1. ���� �Է�\n2. ���� �˻�\n3. ���� ���\n0. ���α׷� ����");
		System.out.print("�޴� ���� : ");
		int menu = sc.nextInt();
		return menu;
	}
	public Score inPut() {
		Score s = new Score();
		System.out.print("�̸� �Է� : ");
		s.setName(sc.next());
		System.out.print("���� ���� �Է� : ");
		s.setKor(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		s.setEng(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		s.setMath(sc.nextInt());
		
		return s;
	}
	public boolean serch(List<Score> list) {
		System.out.print("�˻��� �̸� �Է� : ");
		String name = sc.next();
		for(Score s : list) {
			if(name.equals(s.getName())) {
				System.out.println("�̸� : "+s.getName());
				System.out.println("���� : "+s.getKor()+" ��");
				System.out.println("���� : "+s.getEng()+" ��");
				System.out.println("���� : "+s.getMath()+" ��");
				System.out.println("���� : "+s.getSum()+" ��");
				System.out.printf("��� : %.2f ��\n",s.getAvg());
				return false;
			}
		}return true;
	}
	public void outPut(List<Score> list) {
		for(Score s : list) {
			System.out.println("�̸� : "+s.getName());
			System.out.println("���� : "+s.getSum()+" ��");
			System.out.printf("��� : %.2f ��\n",s.getAvg());
			System.out.println("===============");
		}
	}
}
