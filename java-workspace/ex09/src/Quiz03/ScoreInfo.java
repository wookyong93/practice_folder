package Quiz03;

public interface ScoreInfo {
	int MAX_SCORE = 100;
	int MIN_SCORE = 0;
	
	public int menu();
	 Score scoreInput(Score s);
	public void scoreOutput(Score s);
	void userOutput(Score s);
}
