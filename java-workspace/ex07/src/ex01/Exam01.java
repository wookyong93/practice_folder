package ex01;

import java.util.ArrayList;
import java.util.List;

public class Exam01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // <>안에 저장할 객체의 유형을 입력 
		
		
		list.add("이젠");// list의 마지막 위치에 값 저장
		list.add("컴퓨터학원");
		list.add("자바");
		list.add("프로그래밍");
		
//		System.out.println(list.size());
		
		for(String s : list) {
			System.out.println(s);
		}
		
//		for(int i = 0 ; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		list.add(2,"과정평가");//해당 인덱스번호 자리에 과정평가란 문장이 들어가고 나머지는 배열이 한개씩 밀린다.//추가
//		
//		for(int i = 0 ; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		list.set(2,"과정평가형");//해당 인덱스번호 자리의 문장을 과정평가형으로 변경//수정
//		
//
//		for(int i = 0 ; i<list.size();i++) {
//			System.out.println(list.get(i)); // 인덱스 번호로 객채 값 가져와 출력;
//		}
//		
//		System.out.println(list.contains("자바")); //리스트 안에 자바란 객체 여부 확인
//		System.out.println(list.contains("컴퓨터"));//toString 값과 비교한다.
//		System.out.println(list.isEmpty()); // 컬렉션 객체의 저장여부확인
//		
//		List<String> aa = new ArrayList<>();
//		System.out.println(aa.isEmpty());// 저장되있는 값이 없으면 true;
//		
//		list.remove(2);//인덱스 번호를 이용한 삭제
//		list.remove(2);
//		for(int i = 0 ; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		list.remove("프로그래밍");//객체를 이용한 삭제
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
