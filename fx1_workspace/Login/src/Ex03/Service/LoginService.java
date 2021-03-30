package Ex03.Service;

import javafx.event.ActionEvent;
import javafx.scene.Parent;

public interface LoginService {
	public void LoginProc(Parent root);
	public void CancelProc(ActionEvent e);
	public void OpneMembershipForm();
}
