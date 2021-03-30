package Program.Controller;

import java.util.Scanner;

import Program.Service.ScoreService;
import Program.Service.ScoreServiceImpl;

public class ScoreControllerImpl implements ScoreController{

	@Override
	public void start() throws Exception  {
		// TODO Auto-generated method stub
		ScoreService scoreSrv = new ScoreServiceImpl();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.성적입력 2.성적수정 3.성적삭제 4.성적검색 0. 프로그램 종료");
			System.out.print("선택 : ");
			int menu =sc.nextInt();
			switch(menu){
			case 1 :
				if(scoreSrv.insert()) {
					  System.out.println("입력이 완료되었습니다.");
	            } else {
	               System.out.println("입력이 실패되었습니다.");
	            }
				break;
			case 2 :
				if(scoreSrv.update()) {
				    System.out.println("수정이 완료되었습니다.");
	            } else {
	               System.out.println("수정이 실패되었습니다.");
	            }
				break;
				
			case 3 :
				if(scoreSrv.delete()) {
					  System.out.println("삭제가 완료되었습니다.");
	            } else {
	               System.out.println("삭제가 실패되었습니다.");
	            }
				break;
			case 4 :
				scoreSrv.search();
				break;
				
			case 0 :
				System.out.println("프로그램 종료");
				return;
			default : 
					System.out.println("선택이 잘못 되었습니다.");
			}
		}
		
	}

}
