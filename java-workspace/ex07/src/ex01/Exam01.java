package ex01;

import java.util.ArrayList;
import java.util.List;

public class Exam01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // <>�ȿ� ������ ��ü�� ������ �Է� 
		
		
		list.add("����");// list�� ������ ��ġ�� �� ����
		list.add("��ǻ���п�");
		list.add("�ڹ�");
		list.add("���α׷���");
		
//		System.out.println(list.size());
		
		for(String s : list) {
			System.out.println(s);
		}
		
//		for(int i = 0 ; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		list.add(2,"������");//�ش� �ε�����ȣ �ڸ��� �����򰡶� ������ ���� �������� �迭�� �Ѱ��� �и���.//�߰�
//		
//		for(int i = 0 ; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		list.set(2,"��������");//�ش� �ε�����ȣ �ڸ��� ������ ������������ ����//����
//		
//
//		for(int i = 0 ; i<list.size();i++) {
//			System.out.println(list.get(i)); // �ε��� ��ȣ�� ��ä �� ������ ���;
//		}
//		
//		System.out.println(list.contains("�ڹ�")); //����Ʈ �ȿ� �ڹٶ� ��ü ���� Ȯ��
//		System.out.println(list.contains("��ǻ��"));//toString ���� ���Ѵ�.
//		System.out.println(list.isEmpty()); // �÷��� ��ü�� ���忩��Ȯ��
//		
//		List<String> aa = new ArrayList<>();
//		System.out.println(aa.isEmpty());// ������ִ� ���� ������ true;
//		
//		list.remove(2);//�ε��� ��ȣ�� �̿��� ����
//		list.remove(2);
//		for(int i = 0 ; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		list.remove("���α׷���");//��ü�� �̿��� ����
//		
//		for(int i = 0 ; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		list.clear();
//		
//		for(int i = 0 ; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
	}
}
