package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInfoImpl implements UserInfo{
	List<User> list  =new ArrayList<>(); 
	Scanner sc = new Scanner(System.in);
	User u =new User();
	@Override
	public void input() {
		// TODO Auto-generated method stub
		User u =new User();
		if(list.size() <= MAX_USER) {
		System.out.print("�̸� �Է� : ");
		u.setName(sc.next());
		System.out.print("���� �Է� : ");
		u.setAge(sc.nextInt());
		System.out.print("�ּ� �Է� : ");
		u.setAddr(sc.next());
		list.add(u);
		
		}else if(list.size() > MAX_USER) {
			System.out.println("�ִ� ��� �ο��� 10���Դϴ�.");
		}
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		for(User u :list) {
			if(list.size() > MIN_USER) {
				System.out.println("�̸� : "+u.getName());
				System.out.println("���� : "+u.getAge());
				System.out.println("�ּ� : "+u.getAddr());
				System.out.println("=======================");
				}
			}
			System.out.println("�Էµ� ������ �����ϴ�.");
		}
	}



