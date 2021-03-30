package sec03.brd04;

import java.util.List;

public class BoardService {
	BoardDAO boardDAO;
	public BoardService() {
		boardDAO = new BoardDAO();
	}

	public List<ArticleDTO> listArticles() {
		List<ArticleDTO> articlesList = boardDAO.selectAllArticles();
		return articlesList;
	}
	public int addArticle(ArticleDTO article) {
		return boardDAO.insertNewArticle(article);
	}
	public ArticleDTO viewArticle(int articleNO) {
		ArticleDTO article= null;
		article= boardDAO.selectArticle(articleNO);
		return article;
	}
}
