package com.spring.ex01;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDAO {
	public static SqlSessionFactory sqlMapper =null;
	
	private static SqlSessionFactory getInstance() {
		if(sqlMapper==null) {
			try {
				//MemberDAO의 각 메서드 호출시 src/mybatis/SqlMapConfig.xml에서 설정정보를 읽은 후 데이터베이스와의 연동을 준비합니다.
				String resource = "mybatis/SqlMapConfig.xml";
				Reader reader = Resources.getResourceAsReader(resource);
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
				//마이바티스를 이용하여 SqlMapper 객체를 호출합니다.
				reader.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return sqlMapper;
	}
	public List<MemberVO> selectAllMemberList(){
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		//실제 member.xml의 SQL 문을 호출하는 데 사용되는 SqlSession 객체를 가져옵니다.
		List<MemberVO> memlist = null;
		memlist = session.selectList("mapper.member.selectAllMemberList");
		//여러 개의 레코드를 조회하므로 selectList() 메서드에 실행하고자 하는 SQL문의 id인자를 전달합니다.
		return memlist;
	}
}
