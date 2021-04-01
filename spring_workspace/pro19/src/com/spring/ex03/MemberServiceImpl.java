package com.spring.ex03;

public class MemberServiceImpl implements MemberService{
	private MemberDAO memberDAO;
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
		//member.xml 에서 property를 사용하였으므로 세터를 사용해준다.
	}
	@Override
	public void listMembers() {
		memberDAO.listMembers();
		//세터로 호출된 memberDAO 에 listMembers() 메서드를 실행시켜준다.
		
	}

}
