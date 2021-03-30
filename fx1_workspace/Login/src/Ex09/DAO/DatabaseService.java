package Ex09.DAO;

import Ex09.Member;

public interface DatabaseService {
	public void insert(Member member);
	public boolean select(String id, String pw);
	public boolean checkId(String id);
	public Member search(String id);
}
