package com.spring.member.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.weaver.loadtime.definition.Definition.ConcreteAspect;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.member.vo.MemberVO;


public class MemberDAOImpl implements MemberDAO {
   private SqlSession sqlSession;
   public void setSqlSession(SqlSession sqlSession) {
      this.sqlSession = sqlSession;
   }

   @Override
   public List selectAllMembers() throws DataAccessException {
      List membersList = new ArrayList();
      membersList = sqlSession.selectList("mapper.member.selectAllMemberList");
      return membersList;
   }

   @Override
   public int addMember(MemberVO memberVO) throws DataAccessException {
      int result = sqlSession.insert("mapper.member.insertMember", memberVO);
      return result;
   }

   @Override
   public MemberVO memberDetail(String id) {
      // TODO Auto-generated method stub
      MemberVO vo = (MemberVO)sqlSession.selectOne("mapper.member.selectMemberById", id);
      return vo;
   }

   @Override
   public int removeMember(String id) {
      // TODO Auto-generated method stub
      int result = sqlSession.delete("mapper.member.deleteMember", id);
      return result;
   }

}