package Quiz03;

public class Score extends User {
	private int kor;
	private int eng;
	private int math;
	public int getSum() {
		return this.kor + this.eng+this.math;
	}
	public double getAvg() {
		return this.getSum()/3.0;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
}
