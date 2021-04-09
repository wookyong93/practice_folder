package com.spring.pro30.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.pro30.member.dao.MemberDAO;
import com.spring.pro30.member.vo.MemberVO;

@Service("memberService")
@Transactional(propagation = Propagation.REQUIRED)
//트렌젝션을 이용하여 자동 커밋 진행
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDAO memberDAO;
	@Override
	public List listMembers() throws DataAccessException {
		List membersList = null;
				membersList = memberDAO.selectAllMemberList();
				
		return membersList;
	}

	@Override
	public int addMember(MemberVO membervo) throws DataAccessException {
		// TODO Auto-generated method stub
		return memberDAO.insertMember(membervo);
	}

	@Override
	public int removeMember(String id) throws DataAccessException {
		// TODO Auto-generated method stub
		return memberDAO.deleteMember(id);
	}

	@Override
	public MemberVO login(MemberVO memberVO) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.loginById(memberVO);
	}

}
