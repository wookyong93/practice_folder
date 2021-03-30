package ex04;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Exam1 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.0");
		String result = df.format(123456.89);
		System.out.println(result);// 문자열로 출력됨;
		
		String id = "1234";
		String name = "홍길동";
		String phone = "010-1234-1234";
		
		String text = "회원 ID :{0}, 회원 이름 : {1}, 회원 전화번호 : {2}";
		String result1 = MessageFormat.format(text,id,name,phone);
		System.out.println(result1);
		
		String[] str = new String[] {"0000","이순신","010-9999-9999"};
		String result2 = MessageFormat.format(text,str);
		System.out.println(result2);
		
		User u = new User();
		u.id = "1111";
		u.name = "유관순";
		u.phone ="010-7777-7777";
		System.out.println(u.toString());
		
		String t = u.toString();
		//t 에 저장된 값 : 1111, 유관순,010-7777-7777
		String[] st = t.split(",");
		//t 에 저장된 값 중에 , 기준으로 문자열 나눠서 배열로 저장해 달라는 의미
		//가변 즉 여러가지를 해야 할때는 split 메서드가 훨씬 더 정확하다.

		for (int i =0 ; i<3;i++) {
			System.out.println(st[i]);
		}
		String result3 = MessageFormat.format(text,st);
		System.out.println(result3);
		
		StringTokenizer st1 = new StringTokenizer(t,",");
		//String.split 보다는 속도면에서는 빠르다.
		
		int count = st1.countTokens();
		//st1 이 가지고 있는  tokens 수를 카운터한 값 - 총 갯수
		
		String[] st2 = new String[count];
		for(int i =0 ; i<count ; i++) {
			st2[i] = st1.nextToken();
			System.out.println(st2[i]);
		}
		String result4 = MessageFormat.format(text, st2);
		System.out.println(result4);
		
		List<User> test = new ArrayList<>();
		
		test.add(u);
		
		User u1 = new User();
		u1.id = "9999";
		u1.name = "신사임당";
		u1.phone = "010-1010-1010";
		
		test.add(u1);
		
		for(User s : test) {
			String ttt = s.toString();
			String[] st3 = ttt.split(",");
			String result5 = MessageFormat.format(text, st3);
			System.out.println(result5);
		}
 	}
}


class User{
	String id;
	String name;
	String phone;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ","+this.name+","+this.phone;
	}
	
		
}