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
		System.out.println(result);// ���ڿ��� ��µ�;
		
		String id = "1234";
		String name = "ȫ�浿";
		String phone = "010-1234-1234";
		
		String text = "ȸ�� ID :{0}, ȸ�� �̸� : {1}, ȸ�� ��ȭ��ȣ : {2}";
		String result1 = MessageFormat.format(text,id,name,phone);
		System.out.println(result1);
		
		String[] str = new String[] {"0000","�̼���","010-9999-9999"};
		String result2 = MessageFormat.format(text,str);
		System.out.println(result2);
		
		User u = new User();
		u.id = "1111";
		u.name = "������";
		u.phone ="010-7777-7777";
		System.out.println(u.toString());
		
		String t = u.toString();
		//t �� ����� �� : 1111, ������,010-7777-7777
		String[] st = t.split(",");
		//t �� ����� �� �߿� , �������� ���ڿ� ������ �迭�� ������ �޶�� �ǹ�
		//���� �� ���������� �ؾ� �Ҷ��� split �޼��尡 �ξ� �� ��Ȯ�ϴ�.

		for (int i =0 ; i<3;i++) {
			System.out.println(st[i]);
		}
		String result3 = MessageFormat.format(text,st);
		System.out.println(result3);
		
		StringTokenizer st1 = new StringTokenizer(t,",");
		//String.split ���ٴ� �ӵ��鿡���� ������.
		
		int count = st1.countTokens();
		//st1 �� ������ �ִ�  tokens ���� ī������ �� - �� ����
		
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
		u1.name = "�Ż��Ӵ�";
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