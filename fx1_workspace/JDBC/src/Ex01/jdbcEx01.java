package Ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.tree.ExpandVetoException;

public class jdbcEx01 {
	public static void main(String[] args) {
		try {
			// Class.forName() : ����̹��� JVM �ø� �� �ִ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ��� ����");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("����̹� ��� ����");
		}
		
		// ����Ŭ�� ���� �ϱ� ���� Ŭ����
		Connection con = null;
		try {
			// �����ϱ� ���ؼ��� ����IP�ּ�, ����Ŭ ������, ����Ŭ ��й�ȣ
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			// "jdbc:oracle:thin:@����Ŭ ���� IP �ּ�:1521:XE"
			String user = "system";
			String pwd = "oracle";
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("����Ŭ ���� ����");
		} catch(Exception e) {
			System.out.println("����Ŭ ���� ����");
			e.printStackTrace();
		}
		
		// �������� - �Է�
//		try {
//			Statement stmt = con.createStatement();
//			System.out.println("�Է� Statement ��ü ���� ����");
//			
//			String sql = "insert into member values('hong','hong1234','ȫ�浿',22)";
//			
//			int result = stmt.executeUpdate(sql);
//			System.out.println("�Է� ���� : " + result);
//			
//		} catch(Exception e) {
//			System.out.println("�Է� ����");
//		}
		
		// �������� - ����
//		try {
//			Statement stmt = con.createStatement();
//			System.out.println("���� Statement ��ü ���� ����");
//			
//			String sql = "update member set age = 30 where id='hong'";
//			int result = stmt.executeUpdate(sql);
//			System.out.println("���� ���� : " + result);
//		} catch(Exception e) {
//			System.out.println("���� ����");
//		}
		
		// �������� - ����
		try {
			Statement stmt = con.createStatement();
			System.out.println("���� Statement ��ü ���� ����");
			
			String sql = "delete from member where id = 'hong'";
			int result = stmt.executeUpdate(sql);
			System.out.println("���� ���� : " + result);
		} catch(Exception e) {
			System.out.println("���� ����");
		}
		
		// �������� - ��ȸ
		try {
			Statement stmt = con.createStatement();
			System.out.println("Statement ��ü ���� ����");
			
			ResultSet rs = stmt.executeQuery("select * from member");
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pwd = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				System.out.println(id + ", " + pwd + ", " + name + ", " + age);
			}
			System.out.println("��� �Ϸ�");
		}catch (Exception e) {
			System.out.println("Statement ��ü ���� ����");
		} 
		
		
		
	}
}
