package sec03.brd01;

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
}
