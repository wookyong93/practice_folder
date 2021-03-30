package Program.DTO;

public class Score {
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	
	
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
	public int getSum() {
		return sum= this.kor+this.eng+this.math;
	}
	public double getAvg() {
		return avg= this.getSum()/3.0;
	}
	
}
