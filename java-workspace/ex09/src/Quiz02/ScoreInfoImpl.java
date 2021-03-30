package Quiz02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreInfoImpl implements ScoreInfo{
	Scanner sc = new Scanner(System.in);
	List<Score> list = new ArrayList<>();
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Score s = new Score();
	do {
		System.out.println("���� ���� �Է� : ");
		s.setKor(sc.nextInt());
	}while(s.getKor()<MIN_SCORE || s.getKor()>MAX_SCORE);
	do {
		System.out.println("���� ���� �Է� : ");
		s.setEng(sc.nextInt());
	}while(s.getEng()<MIN_SCORE || s.getEng()>MAX_SCORE);
	do {
		System.out.println("���� ���� �Է� : ");
		s.setMath(sc.nextInt());
	}while(s.getMath()<MIN_SCORE || s.getMath()>MAX_SCORE);
	
	list.add(s);
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		for(Score s :list) {
			System.out.println("���� ���� :  "+s.getKor());
			System.out.println("���� ���� : "+s.getEng());
			System.out.println("���� ���� : "+s.getMath());
			System.out.println("==========================");
		}
	}

	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. �Է� 2. ��� 0. ����");
		System.out.print("�޴����� : ");
		int menu = sc.nextInt();
		return menu;
	}
	
}
