package sec05.ex01;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class LoginImpl
 *
 */
@WebListener
public class LoginImpl implements HttpSessionListener {
	String user_id;
	String user_pw;
	static int total_user = 0;
    public LoginImpl() {
        // TODO Auto-generated constructor stub
    }
    public LoginImpl(String user_id,String user_pw) {
        this.user_id = user_id;
        this.user_pw = user_pw;
    }

	
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("세션 생성");
    	++total_user;
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         System.out.println("세션 소멸");
         --total_user;
    }
	
}
