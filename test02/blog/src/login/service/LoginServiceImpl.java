package login.service;

import login.DAO.DatabaseService;
import login.DAO.DatabaseServiceImpl;

public class LoginServiceImpl implements LoginService{
		DatabaseService dataSrv;
	public LoginServiceImpl() {
		dataSrv = new DatabaseServiceImpl();
	}
	
	@Override
	public boolean loginCheck(String id,String pwd) {
		
		return dataSrv.loginCheck(id, pwd);
	}

}
