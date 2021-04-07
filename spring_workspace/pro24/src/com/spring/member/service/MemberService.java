package com.spring.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;


import com.spring.member.vo.MemberVO;

public interface MemberService {
	public List listMembers() throws DataAccessException;
	public int addMember(MemberVO memberVO);
	public MemberVO memberDetail(String id);
	 public int removeMember(String id);
}
