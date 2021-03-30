package Quiz06;

import java.util.Scanner;

public class CompanyFunc {
	Scanner sc = new Scanner(System.in);
	
		public int menu() {
			System.out.println("1. 입력\n2. 검색\n3. 출력\n0. 종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			return menu;
		}
		//Comf에 menu 라는 객체를 만든다. 
		//menu를 호출한 클래스에서 실행된다 . 
		//그후 저장된 값을 넘겨주고 이 객체는 사라진다.
		public Company c1Input(int num) {
			Company c1 = new Company();//임시 저장할 객체를 생성
			
			System.out.print("이름 입력 :");
			c1.setName(sc.next());
			System.out.print("나이 입력 : ");
			c1.setAge(sc.nextInt());
			System.out.print("직급 입력 : ");
			c1.setRank(sc.next());
			
			return c1;
			//메인에 객체를 전달한다.
		}
		public boolean companySerch(Company[] c1,int num) {
			System.out.print("검색할 사람 이름 :");
			String name = sc.next();
			boolean b =true;
			for(int i = 0 ; i<num;i++) {//exam에서  false 가 되는 값
				//c1 이라는 배열안에 입력되있는 자리까지만 검색하기위해 num 값을 넣는다.
				if(name.equals(c1[i].getName())) {
					System.out.println("이름 : "+c1[i].getName());
					System.out.println("나이 : "+c1[i].getAge());
					System.out.println("직급 : "+c1[i].getRank());
					b=false; // false or true 만있음 
					//exam if 문에 조건이 거짓이되므로 위에 문장 출력 ;
					//exam if 문에 조건이 참이 되면 위에 문장이 출력안되고 if 문에있는 찾는사람이없습니다가 나옵니다.
				}
			}
			return b;
		}
		public void  companyall(Company[] c1,int num) {
			for(int i =0; i<num;i++) {
				System.out.println("이름 : " +c1[i].getName()+"\n나이 : "+c1[i].getAge()+"세\n 직급 : "+c1[i].getRank());
				System.out.println("======");
			}
		}
		
}
