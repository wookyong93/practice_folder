package Quiz06;

public class Company {
	//데이터 저장할 수 있는 형태의 설계도
	
	private String name; //이름
	private int age;// 나이
	private String rank; // 직급
	
	//getter : 출력
	//setter : 입력 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
}
