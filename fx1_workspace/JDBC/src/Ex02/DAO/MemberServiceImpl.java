package Ex02.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Ex02.DTO.Member;

public class MemberServiceImpl implements Memberservice{
	Connection con = null;
	
	public MemberServiceImpl(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ��� ����");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("����̹� ��� ����");
		}
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "system";
			String pwd = "oracle";
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("����Ŭ ���� ����");
		} catch(Exception e) {
			System.out.println("����Ŭ ���� ����");
			e.printStackTrace();
		}
	}
	
	public boolean checkId(String id) {
		try {
			Statement stmt = con.createStatement();
			String sql1 = "select count(*) from member where id = '" + id + "'";
			ResultSet rs = stmt.executeQuery(sql1);
			rs.next();
			int cnt = rs.getInt(1);
			if(cnt != 0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public void insert(Member member) {
		// TODO Auto-generated method stub
		try {
			Statement stmt = con.createStatement();
			System.out.println("�Է� Statement ��ü ���� ����");
			
			
			
			String sql = "insert into member values('"
					+ member.getId() + "','"
					+ member.getPwd() + "','"
					+ member.getName() + "',"
					+ member.getAge() + ")";
			
			int result = stmt.executeUpdate(sql);
			System.out.println("�Է� ���� : " + result);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("�Է� ����");
		}

	}

	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		try {
			Statement stmt = con.createStatement();
			System.out.println("���� Statement ��ü ���� ����");
			
			String sql = "update member "
					+ "set pwd = '"	+ member.getPwd() +
					"', name = '" + member.getName() + 
					"', age = " + member.getAge() + 
					"where id='"+ member.getId() +"'";
			
			int result = stmt.executeUpdate(sql);
			System.out.println("���� ���� : " + result);
		} catch(Exception e) {
			System.out.println("���� ����");
		}
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		try {
			Statement stmt = con.createStatement();
			System.out.println("���� Statement ��ü ���� ����");
			
			String sql = "delete from member where id = '" + id + "'";
			int result = stmt.executeUpdate(sql);
			System.out.println("���� ���� : " + result);
		} catch(Exception e) {
			System.out.println("���� ����");
		}
	}

	@Override
	public List<Member> select() {
		// TODO Auto-generated method stub
		List<Member> memberList = new ArrayList<Member>();
		Member member = null;
		try {
			Statement stmt = con.createStatement();
			System.out.println("Statement ��ü ���� ����");
			
			ResultSet rs = stmt.executeQuery("select * from member");
			
			while(rs.next()) {
				member = new Member();
				member.setId(rs.getString(1));
				member.setPwd(rs.getString(2));
				member.setName(rs.getString(3));
				member.setAge(rs.getInt(4));
				memberList.add(member);
			}
			return memberList;
		}catch (Exception e) {
			System.out.println("Statement ��ü ���� ����");
		} 
		return null;
	}

	@Override
	public void search(String id) {
		// TODO Auto-generated method stub
		try{
		Statement stmt = con.createStatement();
		String sql = "select*from member where id = '"+id+"'";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		if(rs.next()) {
			System.out.println("ID : "+rs.getString(1));
			System.out.println("PW : "+rs.getString(2));
			System.out.println("�̸�: "+rs.getString(3));
			System.out.println("���� : "+rs.getInt(4));
		}else {
			System.out.println("�˻��� ȸ�� ���̵� �����ϴ�.");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean checkMember() {
		// TODO Auto-generated method stub
		try{
			Statement stmt = con.createStatement();
			String sql = "select count(*) from member";
			
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			int cnt = rs.getInt(1);
			if(cnt !=0) {
				return true;
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		return false;
	}

	
	

	

}
