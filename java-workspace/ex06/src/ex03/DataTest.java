package ex03;

public class DataTest {
	int gradeNum ; // �г�
	int classNum; // ��
	int number; // ��ȣ

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
