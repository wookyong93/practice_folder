package content.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import content.VO.ContentVO;

public class ContentDBServiceImpl implements ContentDBService {
	private Connection con;
	private DataSource dataFactory;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public ContentDBServiceImpl(){
		try {
				Context ctx = new InitialContext();
				Context envContext = (Context)ctx.lookup("java:/comp/env");
				dataFactory = (DataSource)envContext.lookup("jdbc/oracle");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ContentVO> selectAllContent() {
		List<ContentVO> list = new ArrayList<ContentVO>();
		try {
			con=dataFactory.getConnection();
			String query = "SELECT * FROM blog_content WHERE id=? ORDER BY articleNO DESC";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, "admin");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ContentVO vo = new ContentVO();
				vo.setAritcleNO(rs.getInt("articleNO"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setImageFileName(rs.getString("imageFileName"));
				vo.setWriteDate(rs.getDate("writeDate"));
				vo.setId(rs.getString("id"));
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
