package sec03.brd03;

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
}
