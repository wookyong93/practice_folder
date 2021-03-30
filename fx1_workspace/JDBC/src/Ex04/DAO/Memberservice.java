package Ex04.DAO;

import java.util.List;

import Ex04.DTO.Member;

public interface Memberservice {
	public void insert(Member member);
	public void update(Member member);
	public void delete(String id);
	public List<Member> select();
	public boolean checkId(String id);
	public void search(String id);
	public boolean checkMember();
}