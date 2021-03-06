package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
		public BoardDAO() {
			try {
			Context ctx = new InitialContext();
			Context ctxenv = (Context)ctx.lookup("java:/comp/env");
			dataFactory = (DataSource)ctxenv.lookup("jdbc/oracle");
		
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		public List<BoardDTO> aticleList(){
			List<BoardDTO> aList = new ArrayList<BoardDTO>();
			try {
				con = dataFactory.getConnection();
				String sql = "SELECT * FROM t_board ORDER BY articleNO DESC";
				pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					BoardDTO bDto = new BoardDTO();
					bDto.setArticleNO(rs.getInt("articleNO"));
					bDto.setTitle(rs.getString("title"));
					bDto.setContent(rs.getString("content"));
					bDto.setWriteDate(rs.getDate("writeDate"));
					bDto.setId(rs.getString("id"));
					aList.add(bDto);
				}
				rs.close();
				pstmt.close();
				con.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return aList;
		}
		public int getArticleNO() {
			int articleNO = -1;
			try {
				con=dataFactory.getConnection();
				String sql = "select max(articleNO) from t_board";
				pstmt=con.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();
				rs.next();
				articleNO = rs.getInt(1);
				rs.close();
				pstmt.close();
				con.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return articleNO;
		}
		public void write(BoardDTO bDto) {
			int articleNO = getArticleNO()+1;
			try {
				con=dataFactory.getConnection();
				String sql="INSERT INTO t_board(articleNO,title,content,id) VALUES(?,?,?,?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, articleNO);
				pstmt.setString(2, bDto.getTitle());
				pstmt.setString(3, bDto.getContent());
				pstmt.setString(4, bDto.getId());
				pstmt.executeUpdate();
				
				pstmt.close();
				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		public BoardDTO selectArticleNO(int articleNO) {
			BoardDTO  bDto= new BoardDTO();
			try {
				con=dataFactory.getConnection();
				String sql="SELECT * FROM t_board WHERE articleNO=?";
				pstmt =con.prepareStatement(sql);
				pstmt.setInt(1, articleNO);
				ResultSet rs = pstmt.executeQuery();
				rs.next();
				bDto.setArticleNO(rs.getInt("articleNO"));
				bDto.setTitle(rs.getString("title"));
				bDto.setContent(rs.getString("content"));
				bDto.setId(rs.getString("id"));
				bDto.setWriteDate(rs.getDate("writeDate"));
				
				rs.close();
				pstmt.close();
				con.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return bDto;
		}
		
		public boolean deleteArticle(int articleNO) {
			boolean result =false;
			try {
				con = dataFactory.getConnection();
				String sql = "DELETE FROM t_board WHERE articleNO=?";
				pstmt =con.prepareStatement(sql);
				pstmt.setInt(1, articleNO);
				pstmt.executeUpdate();
				result=true;
				pstmt.close();
				con.close();
				return result;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return result;
			}
		public void modify(BoardDTO bDto) {
			try {
				con = dataFactory.getConnection();
				String sql = "UPDATE t_board SET title=?,content=? WHERE articleNO=?";
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1,bDto.getTitle());
				pstmt.setString(2, bDto.getContent());
				pstmt.setInt(3, bDto.getArticleNO());
				pstmt.executeUpdate();
				
				pstmt.close();
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
}
