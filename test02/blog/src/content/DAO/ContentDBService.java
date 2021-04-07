package content.DAO;

import java.util.List;

import content.VO.ContentVO;

public interface ContentDBService {
	public List<ContentVO> selectAllContent();
}
