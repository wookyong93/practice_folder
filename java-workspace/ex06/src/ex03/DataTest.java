package ex03;

public class DataTest {
	int gradeNum ; // 학년
	int classNum; // 반
	int number; // 번호

	DataTest(){
		this.gradeNum = 1;
		this.classNum = 1;
		this.number = 1;
	}
	DataTest(int number){
		this();
		this.number = number;
	}
	DataTest(int classNum,int number){
		this(number);
		this.classNum = classNum;
	}
	
	public void get() {
		System.out.println(this.gradeNum+ " ; "+this.classNum+" ; "+this.number);
	}

}
