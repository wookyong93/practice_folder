package Ex09.Service;

import Ex09.Member;
import javafx.scene.Parent;

public interface LoginService {
	public void LoginProc(String id);
	public Member search(String id);
}
