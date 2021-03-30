package ex02;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("최대 저장 가능한 곡의 갯수 입력 : ");
		int count = sc.nextInt();
		String[] sing = new String [count];
		int num =0;
label:	while(true) {
				System.out.println("1. 노래 저장\n2. 노래 재생\n3. 저장된 노래\n0. 종료");
				System.out.print("메뉴 선택 : ");
				int menu = sc.nextInt();
				switch (menu) {
				case 1 :
				
					for(int i = 0; i <sing.length;i++) {
						if(sing[i]== null) {
						System.out.print("저장할 노래 입력 : ");
							sing[i]=sc.next();
							if(sing[i]== null) {
								System.out.println((i+1)+"번에"+sing[i]+"저장되었습니다.");
								break;
							}else if(sing[i] != null) {
								System.out.println((i+1)+"번에 "+sing[i]+"저장되었습니다.");
								break;
								}
							}else if(sing[count-1] != null) {
								System.out.println("더이상 저장할 공간이 없습니다.");
							break;
							}
						
						}
				
					break;
				case 2 :
					for(int i = 0; i<sing.length;i++ ) {
						if(sing[i] != null) {
						System.out.println((i+1)+"번곡 재생 : "+sing[i]);
						System.out.println("다음 곡을 재생하시겠습니까 ? [Y/N]");
						System.out.print("입력 : ");
						String YN = sc.next();
						if(YN.equals("Y")) {
							if(sing[i+1] == null) {System.out.println("저장된 곡이없습니다.");
							break;}
						}else {
							break;}
						}
					}
					break;
				case 3 : 
					for(int i = 0 ;i<sing.length;i++)
							if(sing[i] != null) {
							System.out.println((i+1)+"번 저장된 노래 : "+sing[i]);
							}else {
								System.out.println((i+1)+"번 저장된 노래 : 없습니다.");
							}
					break;
				case 0 :
					System.out.println("시스템을 종료 합니다.");
					break label;
				default:
					System.out.println("없는 메뉴입니다.");
						
				}
		}
		
	}
}
