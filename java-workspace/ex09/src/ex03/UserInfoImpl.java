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
		System.out.print("이름 입력 : ");
		u.setName(sc.next());
		System.out.print("나이 입력 : ");
		u.setAge(sc.nextInt());
		System.out.print("주소 입력 : ");
		u.setAddr(sc.next());
		list.add(u);
		
		}else if(list.size() > MAX_USER) {
			System.out.println("최대 등록 인원은 10명입니다.");
		}
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		for(User u :list) {
			if(list.size() > MIN_USER) {
				System.out.println("이름 : "+u.getName());
				System.out.println("나이 : "+u.getAge());
				System.out.println("주소 : "+u.getAddr());
				System.out.println("=======================");
				}
			}
			System.out.println("입력된 정보가 없습니다.");
		}
	}



