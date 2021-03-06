package com.spring.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.member.dao.MemberDAO;
import com.spring.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
		//memberDAO 속성에 setter를 이요하여 설정 파일에서 생성된 memberDAO 빈을 주입합니다.
	}

	@Override
	public List listMembers() throws DataAccessException {
		List membersList = null;
		membersList = memberDAO.selectAllMembers();
		
		return membersList;
	}


	@Override
	public int addMembers(MemberVO memberVO) throws DataAccessException {
		return memberDAO.addMember(memberVO);
		
	}

}
