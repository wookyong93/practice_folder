package Service;

import DAO.DatabaseService;
import DAO.DatabaseServiceImpl;

public class LoginServiceImpl implements LoginService{
	private DatabaseService dataSrv;
		public LoginServiceImpl(){
			dataSrv= new DatabaseServiceImpl();
		}
	@Override
	public boolean loginChk(String id, String pwd) {
			boolean result = dataSrv.selectMember(id, pwd);
		return result;
	}

}
