package Quiz06;

import java.util.Scanner;

public class CompanyExam {
	//실제 실행하는 클래스 = 입력실행, 출력실행,검색실행
	//실행하는 클래스는 반드시 main() 메서드가 존재해야한다.
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		//메인으로 사용할 데이터가 필요하다.
		Company[] c1 = new Company[5]; // Company를 5개 저장할수 있는 공간을 생성;
		//c1[0] = new Comapny(); 로 각인덱스 별로 객체를 생성해야 한다.
		CompanyFunc cm = new CompanyFunc();//각 기능을 가진 클래스 객체를 만들어서 사용한다.
		
		int num = 0;//입력된 인덱스 번호를 저장하는 변수;
	main: while(true) {
			int menu = cm.menu(); //CompanyFunc에 있는 메뉴를 호출
			//cm 에서 불러온 값은 저장되지않기때문에 int menu 에 입력된 값을 저장해준다.
			switch(menu) {//값이 정해져있을때 사용한다.
			case 1 :
				if(num == 5) {
					System.out.println("더 이상 저장할 수 없습니다.");
				}else {
//					c1[num] = new Company();
//				 System.out.println("이름 입력 : ");
//				 c1[num].setName(sc.next());
//				 System.out.println("나이 입력 : ");
//				 c1[num].setAge(sc.nextInt());
//				 System.out.println("직급 입력 : ");
//				 c1[num].setRank(sc.next());
//				 num++;
				
					c1[num]=cm.c1Input(num);
					num++;
				}
				break;
			case 2 : 
				if(cm.companySerch(c1, num)) 
//				System.out.println("이름 겁색 : ");
//				String name = sc.next();
//				for(int i = 0 ; i<5;i++) {
//					if(c1[i].getName().equals(name)) {
//						System.out.println("이름 : "+c1[i].getName());
//						System.out.println("나이 : "+c1[i].getAge());
//						System.out.println("직급 : "+c1[i].getRank());
//						}
//					else {
						System.out.println("기록이 없습니다.");
//						break;
//					}
//				}
				break;
			case 3 : 
				if(num ==0) {
					System.out.println("저장된정보가 없습니다.");
				}else {
				cm.companyall(c1, num);
				}
				break;
			case 0 :
				System.out.println("프로그램 종료");
				break main;
			default : 
					System.out.println("없는 메뉴 번호 입니다.");
			
			}
		}
	}
}
