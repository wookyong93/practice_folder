package Exam;

import java.util.Scanner;

public class ExamFunc {
	
	Scanner sc = new Scanner(System.in);
	public int menu () {
		System.out.println("1. �Է�\n2. �˻�\n3. ���\n0. ���α׷� ����");
		System.out.print("�޴� �Է� : ");
		int menu =sc.nextInt();
		return menu;
		}
	public ExamInfor input(int num) {// ��ü ���� ���� ������ Ŭ���� �̸� �ҷ��� �̸� ����
		ExamInfor exam = new ExamInfor();
		System.out.print("��ǻ�� �̸� �Է� : ");
		exam.setName(sc.next());
		System.out.print("��ǻ�� CPU �̸� �Է� : ");
		exam.setCpu(sc.next());
		System.out.print("��ǻ�� RAM �뷮 �Է� : ");
		exam.setRam(sc.nextInt());
		System.out.print("��ǻ�� �ϵ� �뷮 �Է� : ");
		exam.setHd(sc.nextInt());
		return exam;
	}
	public boolean serch(ExamInfor[] com,int num) {
		System.out.print("�˻��� ��ǻ�� �̸� �Է� : ");
		String name=sc.next();
		boolean b1 = true;
			for(int i = 0 ; i<num;i++) {
				if(com[i].getName().equals(name)) {
					System.out.println("��ǻ�� �̸� : "+com[i].getName());
					System.out.println("��ǻ�� CPU : "+com[i].getCpu());
					System.out.println("��ǻ�� RAM �뷮 : "+com[i].getRam()+"GB");
					System.out.println("��ǻ�� HD �뷮: "+com[i].getHd()+"GB");
					b1 = false;
				}
			}
			return b1;
		}
	public void output(ExamInfor[] com,int num) {
		for(int i=0;i<num;i++) {
			System.out.println("��ǻ�� �̸� : "+com[i].getName());
			System.out.println("��ǻ�� CPU : "+com[i].getCpu());
			System.out.println("��ǻ�� RAM �뷮 : "+com[i].getRam()+"GB");
			System.out.println("��ǻ�� HD �뷮: "+com[i].getHd()+"GB");
			System.out.println("======================================");
		}
	}
	
}
