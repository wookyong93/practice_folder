package Test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mp3Func {
	
		Scanner sc = new Scanner(System.in);
		List<Music> list = new ArrayList<Music>();
		public int menu() {
		System.out.println("1. �뷡 ���� \n2. �뷡 �˻� \n3. �� ���\n4. �뷡���� \n5. �뷡��� \n6. �����뷡\n7. �����뷡 \n0. ���� ");
		System.out.print("�޴����� : ");
		int menu =sc.nextInt();
		return menu;
		}
		
		public Music input(){
			Music m = new Music();
			System.out.print("�뷡���� �Է� : ");
			m.setSong(sc.next());
			System.out.print("���� �Է� : ");
			m.setSinger(sc.next());
			
			return m;
		}
		public boolean serch (List<Music> list) {
			System.out.println("�˻��� �뷡���� �Է� : ");
			String name =sc.next();
			
			for(Music m : list) {
				if(name.equals(m.getSong())) {
					System.out.println(m.getSong()+"_"+m.getSinger());
					return false;
					
				}
			}return true;
		}
		public void output(List<Music> list) {
			for(Music m : list) {
				System.out.println(m.getSong()+"_"+m.getSinger());
				System.out.println("----------------------------");
			}
		}
	public boolean remove(List<Music> list) {
		System.out.print("������ ��� �Է� : ");
		String name = sc.next();
		
		for(Music m: list) {
			if(name.equals(m.getSong())) {
				System.out.println(m.getSong()+"�� �����߽��ϴ�.");
				
				list.remove(m);
				return false;
				
			}
		}
		return true;
	}
}
